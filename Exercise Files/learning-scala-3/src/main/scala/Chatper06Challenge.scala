import Chatper06Challenge.*

@main def chatper06Challenge: Unit =
  println(getListHeadAndTail(linkedList))
  println(getUniqueValues(linkedList))
  println(getFirstThreeElements(linkedList))
  println(getListLength(linkedList))
  println(getQuadraticValues(linkedList))
  println(getThriceDuplicates(linkedList))
  println(getDestinationsThatTakesLessThenHours(16))


object Chatper06Challenge {

  var simpleEmptyList = List.empty
  var linkedList = 1 :: 1 :: 2 :: 2 :: 3 :: 3 :: 4 :: Nil

  def getListHeadAndTail(list: List[Any]): List[Any] =
    List(list.head, list.last)

  def getUniqueValues(list: List[Any]): List[Any] =
    list.distinct

  def getFirstThreeElements(list: List[Any]): List[Any] =
    list.slice(0, 2)

  def getListLength(list: List[Any]): Int =
    list.length

  def getQuadraticValues(list: List[Int]): List[Int] =
    list.map(integer => integer * integer)

  def getThriceDuplicates(list: List[Any]): List[Any] =
    List(list, list, list).flatten

  case class Destination(city: String, journeyTime: Int)

  val destinations = List(Destination("japan", 30), Destination("Europe", 14), Destination("Greenland", 50), Destination("France", 16))

  def getDestinationsThatTakesLessThenHours(hoursToDestination: Int): List[String] =
    destinations.filter(destination => destination.journeyTime.<=(hoursToDestination)).map(destination => destination.city)
}


