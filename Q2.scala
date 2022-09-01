import scala.io.StdIn.readInt
import scala.util.control.Breaks._

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter a number: ")
    var n =readInt()

    printSequence(n);
  }

  def gcd(a:Int, b:Int):Int = b match {
    case 0 => a
    case b if(b>a)=> gcd(b,a)
    case _ => gcd(b, a%b)
  }
  def isPrime(n:Int, i:Int=2):Boolean = n match {
    case n if n==i => true
    case n if gcd(n,i)>1 => false //not a prime
    case x => isPrime(n,i+1)
  }

  def printSequence(n:Int,i:Int=2):Unit = {
    if(n==i) {
      break
    }
    if(isPrime(i)) {   // if a prime number -> print
      println(i)
    }
    printSequence(n,i+1)
  }
}