package com.github.beetv.provider

import com.github.beetv.model.ChannelTab
import com.github.beetv.model.DetailContent
import com.github.beetv.model.SearchContent
import com.github.beetv.model.TabContent

interface ChannelProvider {
    suspend fun queryTabs(): List<ChannelTab>
    suspend fun queryTabContent(id: String): TabContent
    suspend fun queryDetailContent(id: String): DetailContent
    suspend fun search(name: String): SearchContent
    suspend fun parseMediaUrl(url: String): String
}