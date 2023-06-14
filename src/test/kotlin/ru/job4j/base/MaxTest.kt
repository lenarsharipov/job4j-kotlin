package ru.job4j.base

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MaxTest : StringSpec ({

    "Max of 1 and 2 is 2" {
        max(1, 2) shouldBe 2
    }

    "Max of 1 and 1 is 1" {
        max(1, 1) shouldBe 1
    }

    "Max of 2 and 1 is 2" {
        max(2, 1) shouldBe 2
    }

    "Max of 1, 2, 3 is 3" {
        max(1, 2, 3) shouldBe 3
    }

    "Max of 1, 2, 2 is 2" {
        max(1, 2, 2) shouldBe 2
    }

    "Max of 2, 2, 2 is 2" {
        max(2, 2, 2) shouldBe 2
    }

    "Max of 2, 3, 2 is 3" {
        max(2, 3, 2) shouldBe 3
    }

})