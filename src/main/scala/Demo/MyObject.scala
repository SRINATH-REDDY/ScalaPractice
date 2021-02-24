package Demo
import scala.math._
object MyObject
{
   def test(): Unit =
   {
     println(true && false)
     /*println(sqrt(pow(2,2))+pow(2,2))
     println(floor(5.4))
     println((random*(11-1)).toInt)
     println(toRadian(90))*/
     var age = 18;
     val canvote= if(age>=18) "yes" else if(age<18) "no"
     println (canvote)

     if (age>=5 && age<=6)
     {
       println("Kindergarten")
     }else if(age>=6 && age<=7)
     {
       println("grade1")
     }else {println(age-5)}
   }
}
object Main
{
  def main(args: Array[String])
  {
    //MyObject.test();
   /* val rand="ABCDEFGHI"
    for(i<-1 until rand.length)
      println(rand(i))*/
   def getSum(Num1:Int,Num2:Int): Int =
     {
       return Num1+Num2
     }
     println(getSum(4,5))

}}
