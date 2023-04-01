
@main def competitionChallenge: Unit =
  println(competition(1))
  println(competition(2))
  println(competition(3))
  println(competition(41))

  def competition( result: Int) : String = result match
    case 1 => "gold"
    case 2 => "silver"
    case 3 => "bronze"
    case _ => "try again next year..."

