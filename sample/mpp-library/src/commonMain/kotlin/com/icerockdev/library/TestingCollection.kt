/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package com.icerockdev.library

import dev.icerock.moko.units.CollectionUnitItem

class TestingCollection(val unitFactory: CollectionUnitFactory) {

    fun getUnits(): List<CollectionUnitItem> {
        return with(unitFactory) {
            listOf(
                createSimpleUnit(id = 1, title = "hello"),
                createSimpleUnit(id = 2, title = "world"),
                createSimpleUnit(id = 3, title = "and"),
                createSimpleUnit(id = 4, title = "work"),
                createSimpleUnit(id = 5, title = "!"),
                createSimpleUnit(id = 6, title = "data", itemData = ItemData("there data"))
            )
        }
    }

    interface CollectionUnitFactory {
        fun createSimpleUnit(id: Long, title: String, itemData: ItemData? = null): CollectionUnitItem
    }
}
