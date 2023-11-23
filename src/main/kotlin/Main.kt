import java.util.Scanner
fun main(){
//  Problem:1
//    var ss = Scanner(System.`in`)
//    var mark:Int = ss.nextInt()
//    if(mark>=0 && mark<=32){
//        println("Your grade is : F")
//    }
//    else if(mark>=33 && mark<=39 ){
//        println("Your grade is : D")
//    }
//    else if (mark>=40 && mark<=49){
//        println("Your grade is : C")
//    }
//    else if (mark>=50 && mark<=59){
//        println("Your grade is : B")
//    }
//    else if (mark>=60 && mark<=69){
//        println("Your grade is : A-")
//    }
//    else if (mark>=70 && mark<=79){
//        println("your grade is : A")
//    }
//    else if (mark>=80 && mark<=89 && mark<=100){
//        println("Your grade is : A+")
//    }
//    else{
//        println("Invalid grade!")
//    }

//    Problem:2

    val ss = Scanner(System.`in`)
    val year:Int = ss.nextInt()
    if((year%4==0)&&(year%100!=0)||(year%400==0)){
        println("$year is a Leap Year.")
    }
    else {
        println("$year is not a Leap Year.")
    }
}