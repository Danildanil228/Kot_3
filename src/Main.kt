import kotlin.random.Random
fun generateSalaries(): Array<IntArray> {
    return Array(18) { IntArray(12) { Random.nextInt(30000, 100000) } }
}
fun main() {
    val salaries = generateSalaries()
    for (month in 0 until 12) {
        var totalSalary = 0
        for (employee in 0 until 18) {
            totalSalary += salaries[employee][month]
        }
        val averageSalary = totalSalary / 18.0
        println("Средняя зарплата за ${getMonthName(month)}: %.2f".format(averageSalary))
    }
}
fun getMonthName(month: Int): String {
    return when (month) {
        0 -> "Январь"
        1 -> "Февраль"
        2 -> "Март"
        3 -> "Апрель"
        4 -> "Май"
        5 -> "Июнь"
        6 -> "Июль"
        7 -> "Август"
        8 -> "Сентябрь"
        9 -> "Октябрь"
        10 -> "Ноябрь"
        11 -> "Декабрь"
        else -> "Неизвестный месяц"
    }
}