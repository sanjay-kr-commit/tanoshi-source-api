package tanoshi.source.api.model.component

class MangaChapter {

    lateinit var url : String

    lateinit var name : String

    var readStatus : Boolean = false

    var upload_date : String? = null

    var chapter_number : Float = -1f

    var scanlator : String? = null

}