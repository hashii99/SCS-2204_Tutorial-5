import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter the number: ");
    var n = readInt();
    println("Sum = "+FindSum(n));
  }

  def FindSum(n:Int):Int = {
    if(n==0) {
      return 0;
    }
    else {
      return n+FindSum(n-1);
    }
  }
}