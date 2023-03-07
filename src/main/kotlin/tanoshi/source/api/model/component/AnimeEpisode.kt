package tanoshi.source.api.model.component

class AnimeEpisode {

    lateinit var url : String

    lateinit var name : String

    var watchStatus : Boolean = false

    var upload_date : String? = null

    var episode_number : Float = -1f

    var scanlator : String? = null

}