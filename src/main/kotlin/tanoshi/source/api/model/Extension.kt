package tanoshi.source.api.model

interface Extension<T> {

    val name : String

    val lang : String
        get() = ""

    val baseUrl : String

    val DOMAIN_MIRROR : List<String>

    fun fetchDetails( content : T ) : T

    fun search( name : String , pageIndex : Int = 1 ) : List<T>

}