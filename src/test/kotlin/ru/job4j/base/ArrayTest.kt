package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ArrayTest: StringSpec ({

    "[a, null, b, null, c] -> [a, b, c, null, null]" {
        val array = arrayOf("a", null, "b", null, "c")
        defragment(array)
        array shouldBe arrayOf("a", "b", "c", null, null)
    }

    "Array with all null elements remains unchanged" {
        val array = arrayOfNulls<String?>(5)
        defragment(array)
        array shouldBe arrayOfNulls<String?>(5)
    }

    "[a, null, b, null, c, null, d] -> [a, b, c, d, null, null, null]" {
        val array = arrayOf("a", null, "b", null, "c", null, "d")
        defragment(array)
        array shouldBe arrayOf("a", "b", "c", "d", null, null, null)
    }

    "Empty array remains unchanged" {
        val array = emptyArray<String?>()
        defragment(array)
        array shouldBe emptyArray<String?>()
    }

})
