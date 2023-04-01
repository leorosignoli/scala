import Chapter5Challenge.{TicketPrice, duplicateInteger, getFirstClassTicketPrice, getFirstClassTicketPrice2}

@main def mainFunc(): Unit =
  println(duplicateInteger(Some(3)))
  println(getFirstClassTicketPrice(Some(TicketPrice(4, Some(2)))))
  println(getFirstClassTicketPrice2(Some(TicketPrice(4, Some(2)))))
  println(getFirstClassTicketPrice2(Some(TicketPrice(4, None))))

object Chapter5Challenge {

  var optionalInteger: Option[Int] = Some(3)

  optionalInteger.map(i => i * i)
  optionalInteger = None

  def duplicateInteger(optionalInteger: Option[Int]): Option[Int] =
    optionalInteger.map(i => i * i)


  // part 2

  case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])

  def getFirstClassTicketPrice(ticketPrice: Option[TicketPrice]): Option[Int] =
    ticketPrice.flatMap(ticketPrice => ticketPrice.firstClassTicketPrice)

  def getFirstClassTicketPrice2(ticketPrice: Option[TicketPrice]): Option[Int] = for
    ticket <- ticketPrice
    price <- ticket.firstClassTicketPrice.orElse(Some(1))
  yield price

}
