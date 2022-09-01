import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ");
    val n = readInt();

    if(isOdd(n)) {
      println("Odd Number");
    }
    else {
      println("Even Number");
    }

  }

  def isEven(n:Int):Boolean = n match {
    case 0 => true;
    case _ => isOdd(n-1);
  }

  def isOdd(n:Int):Boolean = !(isEven(n))

}