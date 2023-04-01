object Chapter4b {
  // case classes
  case class Person(name: String, age: Int=  0)

  val anne: Person = Person("Anne", 35)
  val anneName = anne.name
  val anneAge = anne.age
  // case classes are immutable, so it need to create a new object.
  val anneWithAmendedAge = anne.copy(age = 36)

  val baby  = Person("baby")


  // enumerations
  enum TrafficLight:
    case Red, Amber, Green

  import TrafficLight.*
  def drivingSignal(light: TrafficLight): String =
    if light == Red then "Stop"
    else if light == Amber then "Get Ready"
    else "Go"

  def drivingSignal2(trafficLight: TrafficLight): String = trafficLight match {
    case Red => "Stop"
    case Amber => "Get Ready"
    case Green => "Go"
  }

  enum Triathlon(val metres: Int):
    case Swim extends Triathlon(metres=400)
    case Cycle extends Triathlon(5000)
    case Run extends Triathlon(2500)

  import Triathlon.*
  def howManyMetres(triathlon: Triathlon): Int = triathlon match {
    case s @ Swim => s.metres
    case c @ Cycle => c.metres
    case r @ Run => r.metres
  }
}
