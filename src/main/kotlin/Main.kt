fun main(){
    arithmetic1(10, 20)
    recArea(40, 2)
    info("Faith", 80, "pink")
    averageNums(10, 10, 10)

}

//PERFORMING ARITHMETIC OPERATIONS
fun arithmetic1(num1: Int, num2: Int){
    var add = num1 + num2
    var difference = num1 - num2
    var product = num1 * num2
    var quotient = num2 / num1

    println(add)
    println(difference)
    println(product)
    println(quotient)

}

//FINDING THE AREA OF RECTANGLE
fun recArea(num0: Int, num9: Int){
    var area1 =  num0 * num9
    println(area1)
}

//Write a program that prompts the user to enter their name,
// age, and favourite color, and then prints out a message including all of that information.
fun info(firstName: String, age: Int, favColor: String){
    var fullInfo = "Hi my name is $firstName and I am $age years old and I like color $favColor"
    println(fullInfo)

}

//Write a program that calculates the average of three numbers.
// The user should be prompted to enter the three numbers.
fun averageNums(av1: Int, av2: Int, av3: Int){
    var ress = (av1 + av2 + av3)/3
    println(ress)
}



