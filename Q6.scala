import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {

    println("Enter a number : ");
    val n = readInt()
    println("Fibonacci Series : " );
    println(fibonacciSequence(n));
  }

  def fibonacci(n:Int):Int = n match {
    case x if x==0 => 0;
    case x if x==1 => 1;
    case _ => fibonacci(n-1) + fibonacci(n-2)
  }
  def fibonacciSequence(n:Int):Unit = {
    if(n>0) {
      fibonacciSequence(n-1);
    }
    println(fibonacci(n));
  }
}