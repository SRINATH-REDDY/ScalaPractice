package Demo
class Myname(val Name:String,val Class1:String )
{
  println("My Name Is Srinathreddy")
    def this(Name:String)
    {
       this(Name,"100")

      }
  def test(): Unit =
    {
      println(Name +" "+Class1)
    }
}

object Demo {
  def main(args: Array[String]): Unit =
  {
      val m =new Myname("Ram","1998")
        m.test()
      val m1=new Myname("Srinath")
    m1.test();
  }

}
