package com.github.beetv.provider

import com.github.beetv.model.ChannelTab
import com.github.beetv.model.DetailContent
import com.github.beetv.model.TabContent

interface ChannelProvider {
    suspend fun queryTabs(): List<ChannelTab>
    suspend fun queryTabContent(tabId: String): TabContent
    suspend fun queryDetailContent(detailId: String): DetailContent
}