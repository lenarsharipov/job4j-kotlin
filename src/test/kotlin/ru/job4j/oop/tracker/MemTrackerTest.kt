package ru.job4j.oop.tracker

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class MemTrackerTest: StringSpec({

    "Add Item(0, test name) to empty list get Item(1, test name)" {
        val tracker = MemTracker()
        val item = Item(0, "test name")
        tracker.findAll() shouldBe emptyList()

        val rsl = tracker.add(item)
        rsl shouldBe Item(1, "test name")
        tracker.findAll() shouldBe listOf(rsl)
    }

    "Replace by id Item(1, test name) to empty list get True" {
        val tracker = MemTracker()
        val item = Item(0, "item1")
        tracker.add(item)
        val rsl = tracker.replace(1, Item(0, "item1 UPD"))

        rsl shouldBe true
        tracker.findAll() shouldBe listOf(Item(1, "item1 UPD"))
    }

    "Replace by id Item(1, test name) to empty list get False" {
        val tracker = MemTracker()

        val rsl = tracker.replace(1, Item(0, "item1 UPD"))

        rsl shouldBe false
        tracker.findAll() shouldBe emptyList()
    }

    "Delete by id existing Item and get True" {
        val tracker = MemTracker()
        val item = Item(0, "item1")
        tracker.add(item)
        val rsl = tracker.delete(1)

        rsl shouldBe true
        tracker.findAll() shouldBe emptyList()
    }

    "Delete by id not existing Item and get False" {
        val tracker = MemTracker()
        val rsl = tracker.delete(1)

        rsl shouldBe false
    }

    "Find By Name Then get list with found items" {
        val tracker = MemTracker()
        val item1 = tracker.add(Item(0, "name"))
        val item2 = tracker.add(Item(0, "name"))
        val item3 = tracker.add(Item(0, "AAAbbb"))

        tracker.findByName("name") shouldBe listOf(item1, item2)
        tracker.findByName("AAAbbb") shouldBe listOf(item3)
        tracker.findByName("unknown") shouldBe emptyList()
    }

    "Find By id then get found item or null" {
        val tracker = MemTracker()
        val item = tracker.add(Item(0, "name"))

        tracker.findById(item.id) shouldBe item
        tracker.findById(-1) shouldBe null
    }

})