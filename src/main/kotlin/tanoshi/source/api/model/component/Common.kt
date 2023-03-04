package tanoshi.source.api.model.component

import tanoshi.source.api.model.Extension

open class Common<T>( source : Extension<T> ) {

    lateinit var url : String

    lateinit var title : String

    var id : String? = null

    var artist : String? = null

    var author : String? = null

    var description : String? = null

    var genre : String? = null

    var status : String? = null

    var thumbnail_url : String? = null

    var alternativeName : String? = null

    var lang : String? = null

    val extensionName : String? = source::class.java.name

    fun getGenre() : List<String>? {
        return if ( genre.isNullOrEmpty() ) null
        else genre?.split( "," )?.map { it.trim() }?.filterNot { it.isBlank() }?.distinct()
    }

}