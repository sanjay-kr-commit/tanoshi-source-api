package tanoshi.source.api.model.component

import tanoshi.source.api.model.Extension

class Manga( source : Extension<Manga>? = null ) : Common<Manga>( source ) {

    lateinit var chapterList : List<MangaChapter>

}