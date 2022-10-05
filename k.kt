package com.example.kotlin

fun main() {

    var answers = arrayListOf(50.5, 50.60, 50.0, 54.9, 50.105)

    println(answers)

    var sum = 0.0
    for (answer in 0..answers.size)
sum += answer
        val average = sum / answers.size
    println("Average : $average")


}