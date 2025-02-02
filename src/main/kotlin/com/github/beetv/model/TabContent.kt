package com.github.beetv.model

sealed interface TabContent

object EmptyTabContent : TabContent

data class DefaultTabContent(
    val cellGroups: List<CellGroup>
) : TabContent {
    data class CellGroup(
        val title: String,
        val cells: List<Cell>
    )

    data class Cell(
        val id: String,
        val cover: String,
        val title: String,
        val desc: String,
        val aspectRatio: Float = 16 / 9F
    )
}

