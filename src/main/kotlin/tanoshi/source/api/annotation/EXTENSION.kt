package tanoshi.source.api.annotation

import tanoshi.source.api.enum.TYPES

/**
 * This annotation is used to identify
 * extension class
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class EXTENSION(
    val contentType : TYPES
)