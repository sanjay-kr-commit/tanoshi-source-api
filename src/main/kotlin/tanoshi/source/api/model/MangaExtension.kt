package tanoshi.source.api.model

import tanoshi.source.api.model.component.Manga
import tanoshi.source.api.model.component.MangaChapter
import tanoshi.source.api.model.component.MangaPage


interface MangaExtension : Extension<Manga> {

    fun fetchChapterList( manga: Manga ) : List<MangaChapter>

    fun fetchPageList( chapter: MangaChapter ) : List<MangaPage>

}