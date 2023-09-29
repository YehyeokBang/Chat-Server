package net.skhu.realtimechat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RealTimeChatApplication

fun main(args: Array<String>) {
    runApplication<RealTimeChatApplication>(*args)
}
