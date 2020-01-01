package hackerrank.algorithms.strings

import java.util.*

private val violations = hashSetOf(1, 2, 3, 4)

val numbersRange = (48..57)
val specialCharsRange = (33..47)
val upperCaseRange = (65..90)
val lowercaseRange = (97..122)
const val REQUIRED_LENGTH = 6

// Complete the minimumNumber function below.
fun minimumNumber(length: Int, password: String): Int {
    //This can be solved in O(n).
    //We traverse through the string by each character.  Checking the character
    //to make sure that it meets the requirement each requirement

    for (c in password) {

        if(violations.size ==0)
            break

        when (c.toInt()) {
            in upperCaseRange -> violations.remove(1)
            in lowercaseRange -> violations.remove(2)
            in numbersRange -> violations.remove(3)
            in specialCharsRange -> violations.remove(4)
        }
    }

    return when {
        length < REQUIRED_LENGTH -> {
            //apply violations to newPassword count
            val newPassword = password.length + violations.size

            //after we apply if it's less than required length then 6 - length
            if( newPassword < REQUIRED_LENGTH) REQUIRED_LENGTH - length
            else
                violations.size
        }

        else -> violations.size
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val password = scan.nextLine()
    val answer = minimumNumber(n, password)

    println(answer)
}
