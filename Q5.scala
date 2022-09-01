import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ");
    val n = readInt();
    println("Sum of even numbers = "+EvenAddition(n))
  }

  def EvenAddition(n:Int):Int = {
    if(n%2==0) {
      if(n==0) {
        return 0;
      }
      else {
        return n+EvenAddition(n-1);
      }
    }
    else {
      return EvenAddition(n-1)
    }
  }
}