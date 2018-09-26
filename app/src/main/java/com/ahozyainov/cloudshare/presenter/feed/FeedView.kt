package com.ahozyainov.cloudshare.presenter.feed

import com.ahozyainov.cloudshare.presenter.base.BaseRestView

interface FeedView : BaseRestView {
    fun setItem(items: List<String>)
}
