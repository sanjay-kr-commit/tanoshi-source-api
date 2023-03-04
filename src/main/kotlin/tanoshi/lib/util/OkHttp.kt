package tanoshi.lib.util

import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import com.squareup.okhttp.Response
import tanoshi.lib.exception.OkHttpException

val defaultHeaders = arrayOf(
    Pair( "user-agent" , "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36" )
)

fun String.toHtml(
    vararg headers : Pair<String,String> = defaultHeaders
) : String = Request.Builder().run {
    url( this@toHtml )
    get()
    for ( i in headers ) addHeader( i.first , i.second )
    val response = OkHttpClient()
        .newCall( build() )
        .execute()
    if ( !response.isSuccessful ) throw OkHttpException( """
        |Failed
        |${response.code()}
        |${response.message()}
        |${response.headers()}
    """.trimMargin() )
    response!!.body().string()
}