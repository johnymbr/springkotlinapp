package tutorial

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * The main entry point to the application
 */
@EnableAutoConfiguration
@SpringBootApplication
class Application /*{

//    @Bean
//    fun controller() = FirstController()
}*/

/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}