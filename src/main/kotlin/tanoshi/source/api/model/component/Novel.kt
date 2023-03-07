package tanoshi.source.api.model.component

import tanoshi.source.api.model.Extension

class Novel( source : Extension<Novel> ) : Common<Novel>( source ) {

    var source : String? = null

    lateinit var chapterList : List<NovelChapter>

}