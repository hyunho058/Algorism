package greedy

import bruteForce.m
import bruteForce.n
import java.util.*

var N = 0
var M = 0
var K = 0
val numList = mutableListOf<Int>()


fun main(args: Array<String>){
    val scanenr = Scanner(System.`in`)

//    N = scanenr.nextInt()
//    M = scanenr.nextInt()
//    K = scanenr.nextInt()

    val temp = scanenr.next()

    val numListTemp = temp.split(" ")

    for (num in numListTemp){
        numList.add(num.toInt())
    }
    numList.sort()
    println("num size : ${numList.size}")
    for (num in numList){
        print("NUMBER---$num")
    }

}

