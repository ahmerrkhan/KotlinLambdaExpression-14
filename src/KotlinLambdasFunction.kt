
// Lambda functions are those functions which has no name and represented by curly {} braces
// and by -> operator

fun main(args:Array<String>){
    val _result = {println("Hello Lambda!")}    // function with no name
    _result()
    /////// lambda expression with args and parameters
    val sum  = {a :Int, b:Int -> a+b}
    val res = sum(5,8)
    println("The sum is : "+res)
}