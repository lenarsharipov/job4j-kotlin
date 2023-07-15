package ru.job4j.oop.tracker

class MemTracker: Store {

    private var items = ArrayList<Item>()

    private var ids: Long = 1

    override fun add(item: Item): Item {
        item.id = ids++
        items.add(item)
        return item
    }

    override fun replace(id: Long, item: Item): Boolean {
        val index = indexOf(id)
        if (index != -1) {
            item.id = id
            items[index] = item
        }
        return index != -1
    }

    override fun delete(id: Long): Boolean {
        val index = indexOf(id)
        if (index != -1) items.removeAt(index)
        return index != -1
    }

    override fun findAll(): List<Item> {
        return items.toList()
    }

    override fun findByName(key: String): List<Item> {
        val foundByName = ArrayList<Item>()
        for ((index, value) in items.withIndex()) {
            if (key == items[index].name) {
                foundByName.add(value)
            }
        }
        return foundByName
    }

    override fun findById(id: Long): Item? {
        val index = indexOf(id)
        return if (index != -1) items[index] else null
    }

    private fun indexOf(id: Long): Int {
        var rsl = -1
        for (index in items.indices) {
            if (items[index].id == id) {
                rsl = index
                break
            }
        }
        return rsl
    }

}