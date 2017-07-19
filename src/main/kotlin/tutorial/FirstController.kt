package tutorial

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

/**
 * Our very first controller
 */
@RestController
class FirstController {

    /** The ultimate answer to life, the universe and everything */
    @RequestMapping("/answer")
    fun answer() = 42

    /** Get the details of a user */
    @RequestMapping("/user")
    fun getUser(): User {
        val user = User(
                username = "grahamcox",
                screenName = "Graham",
                email = "grahamcox@example.com",
                registered = Instant.now()
        )
        return user
    }
}