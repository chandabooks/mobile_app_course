package org.example

fun main() {
//    simplePrint()
//    readAndPrint()
//    showExprValue()
//    intMathOperations()
//    doubleMathOperations()
//    typeMathOperations()
//    showPrimitiveCall()
//    showTypeCast()
//    showList()
//    showListMutable()
//    showArray()
//    showArray2()
//    showArray3()
//    showArray4()
//    showIf()
//    showIf2()
//    showRange()
//    showWhen()
//    showWhen1()
//    showWhen2()
//    showWhen3()
//    showFor1()
//    showFor2()
//    showFor3()
//    showWhile()
//    showDo()
//    showRepeat()
//    showRepeat2()
//    showRepeat3()
//    showExpr()
//    showDefaultFn()
//    showCalls()
//    showCompact()
//    showFnArgs()
//    showListFilter()
//    showLazy()
//    showMap()
//    showFlatten()



}

fun simplePrint() {
    val name = "Friend"
    println("Hello, " + name + "!")
}


fun readAndPrint() {
    print("Hi, What is your name: ")
    val userName = readlnOrNull()
    println("Hello " + userName)

}

fun intMathOperations() {
    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(53 / 10)
    println(9 % 3)
    println(10 % 3)
}

fun doubleMathOperations() {
    println(1.0 + 2.0)
    println(1.0 / 2.0)
    println(2.0 * 3.5)
    println(2 * 3.5)
    println(2 / 4.0)
}

fun typeMathOperations() {
    val x = 1.0 + 2.0
    println(x::class.simpleName + ": " + x)
    val y = 1 + 2
    println(y::class.simpleName + ": " + y)
    val z = 2 * 3.5
    println(z::class.simpleName + ": " + z)
    println(2::class.simpleName + ": " + 2)
    println(2.5::class.simpleName + ": " + 2)
}

fun printClassVal(x: Any) {
    println(x::class.simpleName + ": " + x)
}

fun showExprValue() {
    //val x = println("Something")
    val x = (5 > 4)
    printClassVal(x)
}

fun showPrimitiveCall() {
    val x = 2.times(3)
    printClassVal(x)

    val y = 3.5.plus(4)
    printClassVal(y)

    val z = 2.4.div(2)
    printClassVal(z)

    val u = 2 * 4.5.plus(2)
    printClassVal(u)

    val v = 2 * 4.minus(3)
    printClassVal(v)

    var w = 2 * 4.minus(3.5)
    printClassVal(w)

    w = 2.minus(3.5) * 4
    printClassVal(w)


}

fun showTypeCast() {
    val a: Int = 6
//     val b: Byte = a
//
    val b: Byte = a.toByte()
//    val b = a

}

fun showList() {
    val thisList = listOf("One", "Two", "Three")
    println("Element 0 is ${thisList[0]}")
    // Note without use of {} expression gets attached to the closest value
    println("Element 1 is ${thisList[1]}")
    println("List is $thisList")

    // demonstrate get,  getOrNull, getOrElse
    println("Element 2 is ${thisList.get(2)}")
    println("Element 2 is ${thisList.getOrNull(2)}")
    println("Element 3 is ${thisList.getOrNull(3)}")
    // The default in else should be an expression returning a value
    println("Element 3 is ${thisList.getOrElse(3, { "Default" })}")
    // The default can be of another type using dynamic typing of Kotlin
    println("Element 3 is ${thisList.getOrElse(3, { 30 })}")

}

fun showListMutable() {
    // Mutable List
    val newList = mutableListOf("One", "Two", "Three")
    println("List before changing: $newList")
    newList[2] = "Everything"
    println("List after changing: $newList")
    // Note that the newList was declared with val, but its contents can be changed
    newList.add("new value")
    println("List after adding: $newList")

//    var thisList = listOf("One", "Two", "Three")
//    thisList[2] = "foo"
}

fun showArray() {
    val thisArray = arrayOf("One", "Two", "Three")
    println("Element 0 is ${thisArray[0]}")
    // Note that the print does not print the array out by default
    println("Array is $thisArray")
    // One can use java.util.Array.toString to print out an array
    println("Array is ${thisArray.contentToString()}")

    thisArray[1] = "New2"
    println("Modified Array is ${thisArray.contentToString()}")
}

fun showArray2() {
    // Arrays can be mixed as well
    val thisArray = arrayOf("One", 3, "Three", 4.5)
    printClassVal(thisArray[0])
    printClassVal(thisArray[1])
    printClassVal(thisArray[3])
}

fun showArray3() {
    val intArray = intArrayOf(1, 2, 4, 5, 6)
    val doubleArray = doubleArrayOf(1.3, 4.5, 6.7, 8.9)
    // for float array the f prefix indicates floating points instead of default double
    val floatArray = floatArrayOf(1.2f, 4.5f, 3.6f)
    //Arrays can contain Arrays
    val matrix = arrayOf(
        intArrayOf(1, 2, 4, 5, 6), intArrayOf(4, 7, 8, 9, 10)
    )
}

fun showArray4() {
    val array1 = arrayOf("One", "Two", "Three")
    val array2 = arrayOf("Four", "Five", "Six")
    val array3 = array1 + array2

    println("Joined Array is  ${array3.contentToString()}")

    val array4 = array3.plus(array1)
    println("Next Joined Array is  ${array4.contentToString()}")
}

fun showIf() {
    val hour: Int = 10

    if (hour < 12) {
        print("It is morning")
    } else {
        print("It is evening")
    }
}

fun showIf2() {
    val hours: Int = 10

    if (hours < 12) {
        println("It is morning")
    } else if (hours < 18) {
        println("it is afternoon")
    } else if (hours < 21) {
        println("It is evening")
    } else {
        println("It is night")
    }
}

fun showRange() {
    val value: Int = 40

    if (value in 1..100) {
        println("Value is in range")
    } else {
        println("Value is out of range")
    }

}

fun showWhen() {
    val x: Int = 4

    when (x) {
        in (1..4) -> println("It is less than 4")
        5 -> println("it is 5")
        in (6..10) -> println("it is between 6 and 10")
        else -> println("It is more than 10")
    }

}

fun showWhen1() {
    val x: Int = 5

    when (x) {
        5 -> {
            println("it is 5")
            println("It is new line")
        }

        in (6..10) -> println("it is between 6 and 10")
        else -> println("It is more than 10")
    }

}

fun showWhen2() {
    val x: Int = 7

    when {
        (x < 5) -> println("it is less than 5")
        x in (6..10) -> println("it is between 6 and 10")
        else -> println("It is more than 10")
    }

}

fun showWhen3() {
    val x: Int = 3

    var y = when (x) {
        5 -> 'A'
        in 6..10 -> 'B'
        else -> "String"
    }
    printClassVal(y)

}

fun showFor1() {
    val thisArray = arrayOf("This", "is", "an", "example")

    for (x in thisArray) {
        println(x)
    }
    println("---------")
    val thisList = listOf(4, 5, 6, 7)
    for (x in thisList) {
        println(x)
    }

    println("---------")
    val thisSet = setOf(4, 5, 4, 7)
    for (x in thisSet) {
        println(x)
    }
}

fun showFor2() {
    val thisArray = arrayOf("This", "is", "an", "example")

    for ((index, element) in thisArray.withIndex()) {
        println("Element at position $index is $element")
    }

    println("---------")

    val thisList = listOf(4, 5, 6, 7)
    for ((index, element) in thisList.withIndex()) {
        println("Element at position $index is $element")
    }
}

fun showFor3() {
    for (x in 1..5) {
        println(x)
    }
    println("--------")
    for (x in 5 downTo (1)) {
        println(x)
    }
    println("--------")
    for (x in 1..10 step 2) {
        println(x)
    }

    println("--------")
    for (x in 10 downTo (1) step 3) {
        println(x)
    }

    println("--------")
    val x = 4
    val y = 6
    for (i in x..y) {
        println(i)
    }

}

fun showWhile() {
    var x = 30
    while (x > 0) {
        println(x)
        x -= 10
    }
}

fun showDo() {
    var x = 30
    do {
        println(x)
        x -= 10
    } while (x > 0)
}


fun showRepeat() {
    repeat(5) {
        print("Hello ")
    }
}


fun print_fn(index: Int) {
    println("Repeat loop no. $index")
}

fun showRepeat2() {
    repeat(5, ::print_fn)
}

fun showRepeat3() {
    repeat(5, { index -> println("Repeat loop no. $index") })
}

fun showExpr() {
    var temp = 100_000

    printClassVal(temp)

    val funky = temp > 40
    printClassVal(funky)

    temp = 30

    val junky = if (temp > 40) 25.0 else false
    printClassVal(junky)

    val pinky = println("hello")
    printClassVal(pinky)
}

fun speedingFine(speed: Int = 65): Int {
    if (speed < 55) {
        return (0)
    } else if (speed < 70) {
        return 100
    } else {
        return 300
    }
}

fun showDefaultFn() {
    println("Value of speedingFine(50) is ${speedingFine(50)}")
    println("Value of speedingFine() is ${speedingFine()}")
    println("Value of speedingFine() is ${speedingFine(90)}")

}

fun diff(x: Int, y: Int = 50): Int {
    return x - y
}

fun showCalls() {
    println("Value of diff(100) is ${diff(100)}")
    println("Value of diff(100,40) is ${diff(100, 40)}")
    println("Value of diff(x=60,y=30) is ${diff(x = 60, y = 30)}")
    println("Value of diff(x=70) is ${diff(x = 70)}")
    println("Value of diff(y=70,x=100) is ${diff(y = 70, x = 100)}")
}

fun double(x: Int) = 2 * x

fun double_verbose(x: Int): Int {
    return 2 * x
}

fun showCompact() {
    for (x in 1..5) {
        println("Double of $x is ${double_verbose(x)}")
    }
    println("-------Compact Version")
    for (x in 1..5) {
        println("Double of $x is ${double(x)}")
    }

}

fun bool_f(p: Boolean, q: Boolean): Boolean {
    return p && q
}

fun evaluate(arg1: Boolean, arg2: Boolean, binary_fn: (Boolean, Boolean) -> Boolean): Boolean {
    return binary_fn(arg1, arg2)
}

fun showFnArgs() {
    val ans: Boolean = evaluate(true, false, ::bool_f)
    println("evaluation result 1: $ans")

    // Using a lambda expression and calling by name
    val ans2 = evaluate(true, arg2 = true, binary_fn = { x, y -> x && y })
    println("evaluation result 2: $ans2")

    // Using a lambda expression outside the parentheses
    val ans3 = evaluate(true, true) { x, y -> x && y }
    println("evaluation result 3: $ans3")
}

fun showListFilter() {
    val myList = listOf("red", "blue", "deep red", "light red", "green")

    println("Original List was: $myList")

    val subList = myList.filter { it.contains("red") }
    println("Filtered List is: $subList")

    val subList2 = myList.filter { item: String -> item.contains("red") }
    println("Alternate Filtered List is: $subList2")


    val list2 = listOf("nature", "nurture", "upbringing", "genetics")
    val subList3 = list2.filter { it[0] == 'n' }
    println("Original List was: $list2")
    println("Filtered List is: $subList3")

}

fun showLazy() {
    val list2 = listOf("nature", "nurture", "upbringing", "genetics")
    val subList3 = list2.filter { it[0] == 'n' }
    println("Original List was: $list2")
    println("Eager Filtered List is: $subList3")

    val lazyList = list2.asSequence().filter { it[0] == 'n' }
    println("Lazy Filtered Sequence is: $lazyList")

    println("Sequence converted to list is: ${lazyList.toList()}")
}

fun mapCode(code: Int): String {
    return when (code) {
        1 -> "Blue"
        2 -> "Green"
        3 -> "Red"
        else -> "Generic Color"

    }
}

fun showMap() {
    val numbers = listOf(1, 2, 3)
    println("Numbers is $numbers")
    println("Numbers with mapping is ${numbers.map(::mapCode)}")

    val squares = numbers.map { it * it }
    println("Squares of numbers are $squares")

}

fun showFlatten() {
    val original = listOf(listOf("a", "b", "c"), listOf("d", "e", "f"), listOf("h", "i", "j"))
    val flat = original.flatten()
    println("Original $original")
    println("Flatten $flat")

}

