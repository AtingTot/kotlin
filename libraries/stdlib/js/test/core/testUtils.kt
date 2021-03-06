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

package test

import kotlin.test.*

public fun assertTypeEquals(expected: Any?, actual: Any?) {
    assertEquals(expected?.let { it::class.js }, actual?.let { it::class.js })
}

@Suppress("DEPRECATION")
public fun randomInt(limit: Int): Int = (kotlin.js.Math.random() * limit).toInt()

@Suppress("NOTHING_TO_INLINE")
internal inline fun String.removeLeadingPlusOnJava6(): String = this
internal fun doubleTotalOrderEquals(a: Double?, b: Double?) = a == b || (a != a && b != b)
