import ExampleObject.*
import ExampleObject.UnitedKingdom.Scotland


@main def countryExercise(): Unit = println(whereAmI(Scotland))

object ExampleObject {
  case class Country(name: String, populationSize: Int)

  def Population(country: Country): Int = country.populationSize

  enum UnitedKingdom:
    case England, NorthernIreland, Scotland, Wales


  val country = Scotland
  if (country == Scotland) then "Scotland!"

  import UnitedKingdom.*
  def whereAmI(country: UnitedKingdom) = country match {
    case England => "I'm in England!"
    case NorthernIreland => "I'm in Northern Ireland!"
    case Scotland => "I'm in Scotland!"
    case Wales => "I'm in Wales!"
  }


}
