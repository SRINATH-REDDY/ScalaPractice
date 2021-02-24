import foo.{flyable,bulletproof}
package Demo{

object mainobject {


  def main(args: Array[String]): Unit =
  {
    val superman = new superhero("SuperMan")
    println(superman.fly)
    println(superman.hitbybullet)
    println(superman.ricochet(10))

  }
}
  class superhero(val name:String) extends flyable with bulletproof {
     def fly: String = {"%s  fly".format(this.name)}
     def hitbybullet ={"%s hit by bullet".format(this.name)}

  }


}
