package tanoshi.source.api.model

import tanoshi.source.api.model.component.*

interface AnimeExtension : Extension<Anime> {

    fun fetchEpisodeList( anime : Anime) : List<AnimeEpisode>

    fun fetchEpisodeLink( episode: AnimeEpisode) : List<Video>

}