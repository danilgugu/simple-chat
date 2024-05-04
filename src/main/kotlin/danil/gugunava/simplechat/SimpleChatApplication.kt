package danil.gugunava.simplechat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleChatApplication

fun main(args: Array<String>) {
    runApplication<SimpleChatApplication>(*args)
}
