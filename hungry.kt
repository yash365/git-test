fun main(args : Array<String>) {

    println("Write yes or no if you are hungry")

    val input = readLine()!!
    print(input)
}

fun print(input: String) {

    if(input == "yes") {
        print("I am hungry. I will eat samosa")
<<<<<<< HEAD
        print("I am hungry. I will eat sev-puri")
        print("I am hungry. I will eat veg-kolhapuri")
=======
>>>>>>> parent of 59f73ba... sev-puri
    }
    else if(input == "no") {
        print("I am not hungry. I will do my work")
    }
    else {
        print("Invalid option")
    }

}