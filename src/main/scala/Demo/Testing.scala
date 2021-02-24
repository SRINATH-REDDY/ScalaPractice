package Demo

object Testing {
def main(args:Array[String]):Unit =
{
  var i=0;
  var even = for{ i <-1 to 10
    if i%2==0

  }yield(i)
  for(i<-even)




    println(i)
}
}
