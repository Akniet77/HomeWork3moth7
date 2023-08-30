import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите ваш возраст:")
    val ageInput = scanner.nextInt()

    val years = ageInput
    val months = ageInput * 12
    val days = ageInput * 365

    val ageArray = intArrayOf(years, months, days)

    println("Ваш возраст:")
    println("$years лет, $months месяцев, $days дней")

}