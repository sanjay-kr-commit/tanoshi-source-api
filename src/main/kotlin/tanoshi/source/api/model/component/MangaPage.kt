package tanoshi.source.api.model.component

data class MangaPage(
    val index : Int ,
    val url : String = "" ,
    var imageUrl : String? = null
)