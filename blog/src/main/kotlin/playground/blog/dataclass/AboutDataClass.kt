package playground.blog.dataclass

fun main() {

    // case 1. 일반 클래스 들의 값 비교, hashcode 비교, toString 실행
    val studentAlice1 = Student(name = "Alice", age = 12)
    val studentAlice2 = Student(name = "Alice", age = 12)

    println("studentAlice1 == studentAlice2 : ${studentAlice1 == studentAlice2}") // result: false
    println("studentAlice1 hashcode : ${studentAlice1.hashCode()}")
    println("studentAlice2 hashcode : ${studentAlice2.hashCode()}")
    println("studentAlice1.toString() : $studentAlice1")
    println("studentAlice2.toString() : $studentAlice2")

    // case2. data class 들 간의 값 비교 hashcode 비교, toString 실행
    val studentDataClassAlice1 = StudentDataClass(name = "Alice", age = 12)
    val studentDataClassAlice2 = StudentDataClass(name = "Alice", age = 12)

    println("studentDataClassAlice1 == studentDataClassAlice2 : ${studentDataClassAlice1 == studentDataClassAlice2}") // result: true
    println("studentDataClassAlice1 hashcode : ${studentDataClassAlice1.hashCode()}")
    println("studentDataClassAlice2 hashcode : ${studentDataClassAlice2.hashCode()}")
    println("studentDataClassAlice1.toString() : $studentDataClassAlice1")
    println("studentDataClassAlice2.toString() : $studentDataClassAlice2")

    val studentDataClassAlice =
		StudentDataClass(
			name = "Alice",
        	age = 12
        )

    print(studentDataClassAlice.component1())
    print(studentDataClassAlice.component2())

}