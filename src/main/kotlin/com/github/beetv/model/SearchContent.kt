package com.github.beetv.model

sealed interface SearchContent

data class DefaultSearchContent(
    val cells: List<Cell>,
    val columns: Int = 6
) : SearchContent {

    data class Cell(
        val id: String,
        val cover: String,
        val title: String,
        val desc: String,
        val aspectRatio: Float = 16 / 9F
    )
}