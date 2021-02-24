package foo

trait flyable {
 def fly:String
}
trait bulletproof {
  def hitbybullet: String

  def ricochet(StartSpeed: Double): String = {
    "The Bullet recoshet at the speed of %.2f m/sec".format(StartSpeed * 0.75)
  }
}
