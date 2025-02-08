package com.github.beetv.model

sealed interface DetailContent

object EmptyDetailContent : DetailContent

data class DefaultDetailContent(
    val id: String,
    val title: String,
    val sourceGroup: List<MediaSourceGroup>,
    val subtitle: String = "",
    val desc: String = "",
    val bgImage: String = "",
    val duration: Long = 0,
    val category: String = "",
    val releaseDate: Long = 0,
) : DetailContent

data class MediaSourceGroup(
    val name: String,
    val sources: List<MediaSource>
)

data class MediaSource(
    val name: String,
    val mediaUrl: String,
    val parseUrl: String = "",
)
