package org.toy.playground.dataclass

fun main() {

    // case 1. 일반 클래스 들의 값 비교, hashcode 비교, toString 실행
    val studentAlice1 = Student(name = "Alice", age = 12, grade = 6, score = 100)
    val studentAlice2 = Student(name = "Alice", age = 12, grade = 6, score = 100)

    println("studentAlice1 == studentAlice2 : ${studentAlice1 == studentAlice2}") // result: false
    println("studentAlice1 hashcode : ${studentAlice1.hashCode()}")
    println("studentAlice2 hashcode : ${studentAlice2.hashCode()}")
    println("studentAlice1.toString() : $studentAlice1")
    println("studentAlice2.toString() : $studentAlice2")

}