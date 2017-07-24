package tutorial

/**
 * Created by johnymbr on 22/07/17.
 */
data class ErrorMessage(
        val code: String,
        val message: String? = null,
        val statusCode: String
)