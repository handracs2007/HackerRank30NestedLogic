// https://www.hackerrank.com/challenges/30-nested-logic/problem

fun main() {
    val actualDate = readLine()!!.split(" ")
    val actualDay = actualDate[0].toInt()
    val actualMonth = actualDate[1].toInt()
    val actualYear = actualDate[2].toInt()

    val expectedDate = readLine()!!.split(" ")
    val expectedDay = expectedDate[0].toInt()
    val expectedMonth = expectedDate[1].toInt()
    val expectedYear = expectedDate[2].toInt()

    val fine = when {
        actualYear > expectedYear -> 10000
        actualYear == expectedYear && actualMonth > expectedMonth -> 500 * (actualMonth - expectedMonth)
        actualYear == expectedYear && actualMonth == expectedMonth && actualDay > expectedDay -> 15 * (actualDay - expectedDay)
        else -> 0
    }

    println(fine)
}