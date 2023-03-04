package tanoshi.lib.util

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import tanoshi.lib.exception.JsoupException

fun String.toJsoup() : Document {
    if ( this.isBlank() ) throw JsoupException( "Blank Doc" )
    return try {
        Jsoup.parse(this)
    }catch ( e : Exception ) {
        throw JsoupException( "Exception : ${e.printStackTrace()}" )
    }?.let {
        if ( it.body().toString().isBlank() ) throw JsoupException( "Parsed Document is blank for String --------\n$this\n------------" )
        else it
    } ?: throw JsoupException( "Jsoup return null document for String -------------\n$this\n-----------------" )
}