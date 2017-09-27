package tutorial

/**
 * Representation of User
 * @property firstName
 * @property lastName
 * @property email
 * @property phone
 */
data class User(
        var firstName: String = "",
        val lastName: String = "",
        val email: String = "",
        val phone: String = ""
)