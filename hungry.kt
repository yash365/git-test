fun main(args : Array<String>) {

    println("Write yes or no if you are hungry")

    val input = readLine()!!
    print(input)
}

fun print(input: String) {

    if(input == "yes") {
        print("I will eat samosa")
        print("I will eat sev-puri")
    }
    else if(input == "no") {
        print("I will do my work")
    }
    else {
        print("Invalid option")
    }

}