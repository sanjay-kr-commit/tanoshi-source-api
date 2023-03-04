package tanoshi.source.api.model.component

import tanoshi.source.api.model.Extension

class Anime( source: Extension<Anime> ) : Common<Anime>( source ) {

    var type : String? = null

    var airDate : String? = null

    lateinit var episodeList : List<AnimeEpisode>

}