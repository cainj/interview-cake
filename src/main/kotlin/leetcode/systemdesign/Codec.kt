package leetcode.systemdesign

import kotlin.random.Random

class Codec {

    private val urls = hashMapOf<String, String>()

    // Encodes a URL to a shortened URL.
    fun encode(longUrl: String): String{

        //create generated shortened url val encodedUrl =
        val encodedKey = StringBuilder()

        for(i in 1..5)
            encodedKey.append(randomChar())

        val key = "$TINY_URL/$encodedKey"
        urls[key] = longUrl
        return key
    }


    // Decodes a shortened URL to its original URL.
    fun decode(shortUrl: String): String =
        if(urls[shortUrl] != null) urls[shortUrl]!!
        else throw IllegalArgumentException("short url not found")


    private fun randomChar(): Char {
        var random = Random.nextInt(48, 122)

        while(true) {
            if(random in 48..57
                || random in 65..90
                || random in 98..122
            ) break

            random = Random.nextInt(48, 122)
        }

        return random.toChar()
    }

    companion object {
        const val TINY_URL = "http://tinyurl.com/"
    }
}

/**
 * Your leetcode.systemdesign.Codec object will be instantiated and called as such:
 * var obj = leetcode.systemdesign.Codec()
 * var url = obj.encode(longUrl)
 * var ans = obj.decode(url)
 */
