package com.github.beetv.model

interface DetailContent

object EmptyDetailContent : DetailContent

data class DefaultDetailContent(
    val id: String,
    val title: String,
    val subtitle: String,
    val desc: String,
    val bgImage: String,
    val duration: Long,
    val category: String,
    val releaseDate: Long,
    val sourceGroup: List<MediaSourceGroup>,
) : DetailContent

data class MediaSourceGroup(
    val name: String,
    val sources: List<MediaSource>
)

data class MediaSource(
    val name: String,
    val url: String,
)
