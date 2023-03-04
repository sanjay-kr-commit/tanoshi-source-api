package tanoshi.source.api.annotation


/**
 * This annotation is used to create tabs
 * for example "popular tab" , etc
 * function syntax should be such
 * -------------------------------------------------------
 * fun someFunctionName( pageIndex : Int ) : List<Content>
 * -------------------------------------------------------
 * Content can be Manga,Anime,Novel,or any other
 * which might get added to in future
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class TAB