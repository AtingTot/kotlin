package org.jetbrains.jet.plugin.quickfix.createFromUsage.createFunction

import org.jetbrains.jet.plugin.quickfix.JetSingleIntentionActionFactory
import org.jetbrains.kotlin.diagnostics.Diagnostic
import com.intellij.codeInsight.intention.IntentionAction
import org.jetbrains.kotlin.resolve.dataClassUtils.*
import org.jetbrains.kotlin.diagnostics.Errors
import org.jetbrains.jet.plugin.quickfix.QuickFixUtil
import org.jetbrains.kotlin.psi.JetMultiDeclaration
import org.jetbrains.kotlin.psi.JetForExpression
import org.jetbrains.kotlin.types.Variance
import org.jetbrains.jet.plugin.quickfix.createFromUsage.callableBuilder.*

object CreateComponentFunctionActionFactory : JetSingleIntentionActionFactory() {
    override fun createAction(diagnostic: Diagnostic): IntentionAction? {
        val diagnosticWithParameters = Errors.COMPONENT_FUNCTION_MISSING.cast(diagnostic)
        val name = diagnosticWithParameters.getA()
        if (!isComponentLike(name)) return null

        val componentNumber = getComponentIndex(name) - 1

        var multiDeclaration = QuickFixUtil.getParentElementOfType(diagnostic, javaClass<JetMultiDeclaration>())
        val ownerType = if (multiDeclaration == null) {
            val forExpr = QuickFixUtil.getParentElementOfType(diagnostic, javaClass<JetForExpression>())!!
            multiDeclaration = forExpr.getMultiParameter()!!
            TypeInfo(diagnosticWithParameters.getB(), Variance.IN_VARIANCE)
        }
        else {
            val rhs = multiDeclaration!!.getInitializer() ?: return null
            TypeInfo(rhs, Variance.IN_VARIANCE)
        }
        val entries = multiDeclaration!!.getEntries()

        val entry = entries[componentNumber]
        val returnType = TypeInfo(entry, Variance.OUT_VARIANCE)

        return CreateCallableFromUsageFix(multiDeclaration!!, FunctionInfo(name.getIdentifier(), ownerType, returnType))
    }
}
