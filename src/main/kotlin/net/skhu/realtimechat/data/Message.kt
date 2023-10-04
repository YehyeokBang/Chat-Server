package net.skhu.realtimechat.data

class Message(
    var author: String? = null,
    var message: String? = null,
    var time: String? = null
) {

    companion object {
        fun write(author: String, message: String, time: String): Message =
            Message(author, message, time)
    }

    fun toJson(): String =
        "{\"author\":\"$author\",\"message\":\"$message\",\"time\":\"$time\"}"

}