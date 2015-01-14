/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.resolve.calls;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/resolvedCalls")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({ResolvedCallsTestGenerated.Arguments.class, ResolvedCallsTestGenerated.DifferentCallElements.class, ResolvedCallsTestGenerated.Dynamic.class, ResolvedCallsTestGenerated.FunctionTypes.class, ResolvedCallsTestGenerated.Invoke.class, ResolvedCallsTestGenerated.ObjectsAndClassObjects.class, ResolvedCallsTestGenerated.RealExamples.class, ResolvedCallsTestGenerated.Resolve.class, ResolvedCallsTestGenerated.ThisOrSuper.class})
@RunWith(JUnit3RunnerWithInners.class)
public class ResolvedCallsTestGenerated extends AbstractResolvedCallsTest {
    public void testAllFilesPresentInResolvedCalls() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("explicitReceiverIsDispatchReceiver.kt")
    public void testExplicitReceiverIsDispatchReceiver() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/explicitReceiverIsDispatchReceiver.kt");
        doTest(fileName);
    }

    @TestMetadata("explicitReceiverIsExtensionReceiver.kt")
    public void testExplicitReceiverIsExtensionReceiver() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/explicitReceiverIsExtensionReceiver.kt");
        doTest(fileName);
    }

    @TestMetadata("hasBothDispatchAndExtensionReceivers.kt")
    public void testHasBothDispatchAndExtensionReceivers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/hasBothDispatchAndExtensionReceivers.kt");
        doTest(fileName);
    }

    @TestMetadata("hasBothDispatchAndExtensionReceiversWithoutExplicitReceiver.kt")
    public void testHasBothDispatchAndExtensionReceiversWithoutExplicitReceiver() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/hasBothDispatchAndExtensionReceiversWithoutExplicitReceiver.kt");
        doTest(fileName);
    }

    @TestMetadata("implicitReceiverIsDispatchReceiver.kt")
    public void testImplicitReceiverIsDispatchReceiver() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/implicitReceiverIsDispatchReceiver.kt");
        doTest(fileName);
    }

    @TestMetadata("implicitReceiverIsExtensionReceiver.kt")
    public void testImplicitReceiverIsExtensionReceiver() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/implicitReceiverIsExtensionReceiver.kt");
        doTest(fileName);
    }

    @TestMetadata("impliedThisNoExplicitReceiver.kt")
    public void testImpliedThisNoExplicitReceiver() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/impliedThisNoExplicitReceiver.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleCall.kt")
    public void testSimpleCall() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/simpleCall.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/resolvedCalls/arguments")
    @TestDataPath("$PROJECT_ROOT")
    @InnerTestClasses({Arguments.FunctionLiterals.class, Arguments.GenericCalls.class, Arguments.NamedArguments.class, Arguments.OneArgument.class, Arguments.RealExamples.class, Arguments.SeveralCandidates.class})
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Arguments extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInArguments() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/arguments"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class FunctionLiterals extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInFunctionLiterals() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/arguments/functionLiterals"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("chainedLambdas.kt")
            public void testChainedLambdas() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals/chainedLambdas.kt");
                doTest(fileName);
            }

            @TestMetadata("notInferredLambdaReturnType.kt")
            public void testNotInferredLambdaReturnType() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals/notInferredLambdaReturnType.kt");
                doTest(fileName);
            }

            @TestMetadata("notInferredLambdaType.kt")
            public void testNotInferredLambdaType() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals/notInferredLambdaType.kt");
                doTest(fileName);
            }

            @TestMetadata("simpleGenericLambda.kt")
            public void testSimpleGenericLambda() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals/simpleGenericLambda.kt");
                doTest(fileName);
            }

            @TestMetadata("simpleLambda.kt")
            public void testSimpleLambda() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals/simpleLambda.kt");
                doTest(fileName);
            }

            @TestMetadata("unmappedLambda.kt")
            public void testUnmappedLambda() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/functionLiterals/unmappedLambda.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/resolvedCalls/arguments/genericCalls")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class GenericCalls extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInGenericCalls() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/arguments/genericCalls"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("inferredParameter.kt")
            public void testInferredParameter() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/genericCalls/inferredParameter.kt");
                doTest(fileName);
            }

            @TestMetadata("simpleGeneric.kt")
            public void testSimpleGeneric() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/genericCalls/simpleGeneric.kt");
                doTest(fileName);
            }

            @TestMetadata("uninferredParameter.kt")
            public void testUninferredParameter() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/genericCalls/uninferredParameter.kt");
                doTest(fileName);
            }

            @TestMetadata("uninferredParameterTypeMismatch.kt")
            public void testUninferredParameterTypeMismatch() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/genericCalls/uninferredParameterTypeMismatch.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/resolvedCalls/arguments/namedArguments")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class NamedArguments extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInNamedArguments() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/arguments/namedArguments"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("positionedAfterNamed.kt")
            public void testPositionedAfterNamed() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/namedArguments/positionedAfterNamed.kt");
                doTest(fileName);
            }

            @TestMetadata("shiftedArgsMatch.kt")
            public void testShiftedArgsMatch() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/namedArguments/shiftedArgsMatch.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/resolvedCalls/arguments/oneArgument")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class OneArgument extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInOneArgument() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/arguments/oneArgument"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("argumentHasNoType.kt")
            public void testArgumentHasNoType() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/oneArgument/argumentHasNoType.kt");
                doTest(fileName);
            }

            @TestMetadata("simpleMatch.kt")
            public void testSimpleMatch() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/oneArgument/simpleMatch.kt");
                doTest(fileName);
            }

            @TestMetadata("typeMismatch.kt")
            public void testTypeMismatch() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/oneArgument/typeMismatch.kt");
                doTest(fileName);
            }

            @TestMetadata("unmappedArgument.kt")
            public void testUnmappedArgument() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/oneArgument/unmappedArgument.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/resolvedCalls/arguments/realExamples")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class RealExamples extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInRealExamples() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/arguments/realExamples"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("emptyList.kt")
            public void testEmptyList() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/realExamples/emptyList.kt");
                doTest(fileName);
            }

            @TestMetadata("emptyMutableList.kt")
            public void testEmptyMutableList() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/realExamples/emptyMutableList.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/resolvedCalls/arguments/severalCandidates")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class SeveralCandidates extends AbstractResolvedCallsTest {
            public void testAllFilesPresentInSeveralCandidates() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/arguments/severalCandidates"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("mostSpecific.kt")
            public void testMostSpecific() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/arguments/severalCandidates/mostSpecific.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/differentCallElements")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DifferentCallElements extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInDifferentCallElements() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/differentCallElements"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("annotationCall.kt")
        public void testAnnotationCall() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/differentCallElements/annotationCall.kt");
            doTest(fileName);
        }

        @TestMetadata("delegatorToSuperCall.kt")
        public void testDelegatorToSuperCall() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/differentCallElements/delegatorToSuperCall.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleArrayAccess.kt")
        public void testSimpleArrayAccess() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/differentCallElements/simpleArrayAccess.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/dynamic")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Dynamic extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInDynamic() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/dynamic"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("explicitReceiverIsDispatchReceiver.kt")
        public void testExplicitReceiverIsDispatchReceiver() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/dynamic/explicitReceiverIsDispatchReceiver.kt");
            doTest(fileName);
        }

        @TestMetadata("explicitReceiverIsExtensionReceiver.kt")
        public void testExplicitReceiverIsExtensionReceiver() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/dynamic/explicitReceiverIsExtensionReceiver.kt");
            doTest(fileName);
        }

        @TestMetadata("hasBothDispatchAndExtensionReceivers.kt")
        public void testHasBothDispatchAndExtensionReceivers() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/dynamic/hasBothDispatchAndExtensionReceivers.kt");
            doTest(fileName);
        }

        @TestMetadata("hasBothDispatchAndExtensionReceiversWithoutExplicitReceiver.kt")
        public void testHasBothDispatchAndExtensionReceiversWithoutExplicitReceiver() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/dynamic/hasBothDispatchAndExtensionReceiversWithoutExplicitReceiver.kt");
            doTest(fileName);
        }

        @TestMetadata("implicitReceiverIsDispatchReceiver.kt")
        public void testImplicitReceiverIsDispatchReceiver() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/dynamic/implicitReceiverIsDispatchReceiver.kt");
            doTest(fileName);
        }

        @TestMetadata("implicitReceiverIsExtensionReceiver.kt")
        public void testImplicitReceiverIsExtensionReceiver() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/dynamic/implicitReceiverIsExtensionReceiver.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/functionTypes")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class FunctionTypes extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInFunctionTypes() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/functionTypes"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("invokeForExtensionFunctionType.kt")
        public void testInvokeForExtensionFunctionType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/functionTypes/invokeForExtensionFunctionType.kt");
            doTest(fileName);
        }

        @TestMetadata("invokeForFunctionType.kt")
        public void testInvokeForFunctionType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/functionTypes/invokeForFunctionType.kt");
            doTest(fileName);
        }

        @TestMetadata("valOfExtensionFunctionType.kt")
        public void testValOfExtensionFunctionType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/functionTypes/valOfExtensionFunctionType.kt");
            doTest(fileName);
        }

        @TestMetadata("valOfExtensionFunctionTypeInvoke.kt")
        public void testValOfExtensionFunctionTypeInvoke() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/functionTypes/valOfExtensionFunctionTypeInvoke.kt");
            doTest(fileName);
        }

        @TestMetadata("valOfFunctionType.kt")
        public void testValOfFunctionType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/functionTypes/valOfFunctionType.kt");
            doTest(fileName);
        }

        @TestMetadata("valOfFunctionTypeInvoke.kt")
        public void testValOfFunctionTypeInvoke() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/functionTypes/valOfFunctionTypeInvoke.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/invoke")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Invoke extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInInvoke() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/invoke"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("bothReceivers.kt")
        public void testBothReceivers() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/bothReceivers.kt");
            doTest(fileName);
        }

        @TestMetadata("dispatchReceiverAsReceiverForInvoke.kt")
        public void testDispatchReceiverAsReceiverForInvoke() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/dispatchReceiverAsReceiverForInvoke.kt");
            doTest(fileName);
        }

        @TestMetadata("extensionReceiverAsReceiverForInvoke.kt")
        public void testExtensionReceiverAsReceiverForInvoke() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/extensionReceiverAsReceiverForInvoke.kt");
            doTest(fileName);
        }

        @TestMetadata("implicitReceiverForInvoke.kt")
        public void testImplicitReceiverForInvoke() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/implicitReceiverForInvoke.kt");
            doTest(fileName);
        }

        @TestMetadata("invokeOnClassObject1.kt")
        public void testInvokeOnClassObject1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/invokeOnClassObject1.kt");
            doTest(fileName);
        }

        @TestMetadata("invokeOnClassObject2.kt")
        public void testInvokeOnClassObject2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/invokeOnClassObject2.kt");
            doTest(fileName);
        }

        @TestMetadata("invokeOnEnumEntry1.kt")
        public void testInvokeOnEnumEntry1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/invokeOnEnumEntry1.kt");
            doTest(fileName);
        }

        @TestMetadata("invokeOnEnumEntry2.kt")
        public void testInvokeOnEnumEntry2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/invokeOnEnumEntry2.kt");
            doTest(fileName);
        }

        @TestMetadata("invokeOnObject1.kt")
        public void testInvokeOnObject1() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/invokeOnObject1.kt");
            doTest(fileName);
        }

        @TestMetadata("invokeOnObject2.kt")
        public void testInvokeOnObject2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/invoke/invokeOnObject2.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/objectsAndClassObjects")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ObjectsAndClassObjects extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInObjectsAndClassObjects() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/objectsAndClassObjects"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("classObject.kt")
        public void testClassObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/objectsAndClassObjects/classObject.kt");
            doTest(fileName);
        }

        @TestMetadata("kt5308IntRangeConstant.kt")
        public void testKt5308IntRangeConstant() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/objectsAndClassObjects/kt5308IntRangeConstant.kt");
            doTest(fileName);
        }

        @TestMetadata("object.kt")
        public void testObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/objectsAndClassObjects/object.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/realExamples")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RealExamples extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInRealExamples() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/realExamples"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("stringPlusInBuilders.kt")
        public void testStringPlusInBuilders() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/realExamples/stringPlusInBuilders.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/resolve")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Resolve extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInResolve() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/resolve"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("mostSpecificUninferredParam.kt")
        public void testMostSpecificUninferredParam() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/resolve/mostSpecificUninferredParam.kt");
            doTest(fileName);
        }

        @TestMetadata("mostSpecificWithLambda.kt")
        public void testMostSpecificWithLambda() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/resolve/mostSpecificWithLambda.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/resolvedCalls/thisOrSuper")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ThisOrSuper extends AbstractResolvedCallsTest {
        public void testAllFilesPresentInThisOrSuper() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/resolvedCalls/thisOrSuper"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("labeledSuper.kt")
        public void testLabeledSuper() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/thisOrSuper/labeledSuper.kt");
            doTest(fileName);
        }

        @TestMetadata("labeledThis.kt")
        public void testLabeledThis() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/thisOrSuper/labeledThis.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleSuper.kt")
        public void testSimpleSuper() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/thisOrSuper/simpleSuper.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleThis.kt")
        public void testSimpleThis() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/thisOrSuper/simpleThis.kt");
            doTest(fileName);
        }

        @TestMetadata("thisInExtensionFunction.kt")
        public void testThisInExtensionFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/resolvedCalls/thisOrSuper/thisInExtensionFunction.kt");
            doTest(fileName);
        }
    }
}
