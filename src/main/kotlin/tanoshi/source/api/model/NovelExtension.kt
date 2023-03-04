package tanoshi.source.api.model

import tanoshi.source.api.model.component.*

interface NovelExtension : Extension<Novel> {

    fun fetchChapterList( novel : Novel ) : List<NovelChapter>

    fun fetchChapterContent( chapter: NovelChapter ) : String

}