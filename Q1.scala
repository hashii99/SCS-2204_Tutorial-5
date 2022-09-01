import scala.io.StdIn.readInt

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter a number : ");
    var n =readInt()

    println(isPrime(n))
  }

  def gcd (a:Int, b:Int):Int = b match {
    case 0 => a;
    case b if (b>a) => gcd(b,a);
    case _ => gcd(b,a%b);
  }
  def isPrime(n:Int, i:Int=2):Boolean = n match {
    case n if n==i => true;
    case n if gcd(n,i)>1 => false;
    case x => isPrime(n,i+1);
  }
}