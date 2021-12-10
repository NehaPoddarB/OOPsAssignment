package OOPs2

class Person(var name:String,var age:Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 =>
        if (this.age.equals(that.age))
          println("True\nWhen person name and age are equal")
        else
          println("False\nWhen person name or age are not equal")
        0

      case _ =>
        if (this.name.length.equals(that.name.length) && this.age.equals(that.age))
          println("True")
        else
          println("false")
        1
    }
  }
}
object Person extends  App{
  var personOne = new Person("Neha",21)
  var personTwo = new Person("Navi",22)
  personOne compare personTwo
}