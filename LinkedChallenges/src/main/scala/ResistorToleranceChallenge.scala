package edu.linkedin.challenges

import E12.TenOhm

import edu.linkedin.challenges.E6.FifteenOhm


@main def mainFunc(): Unit =
  val funcResult = ResistorToleranceChallenge.range(List(TenOhm, FifteenOhm))
  println(funcResult)
object ResistorToleranceChallenge {
  /**
   *
   * Resistors are supposed to be connected in series so the total resistance will be the sum of all resistors. <br>
   * resistance = r1+...+rn <br>
   * resistance tolerance = (t1+...+tn)/ n <br>
   *
   * @param resistors - list of resistors
   * @return (minimal resistor, maximum resistor) - based on average tolerance of the resistances
   */
  def range(resistors: List[Resistor]): (Double, Double) =
    val totalResistance = resistors.map(_.resistance).sum
    val mediumTolerance = resistors.map(_.tolerance).sum / resistors.size
    val minimalResistance = totalResistance - (totalResistance * mediumTolerance)
    val maximumResistance = totalResistance + (totalResistance * mediumTolerance )
    (minimalResistance, maximumResistance)
}


sealed trait Resistor {
  def resistance: Double
  def tolerance: Double
}

enum E6(val resistance: Double) extends Resistor {
  val tolerance = 0.2
  case FifteenOhm extends E6(15.0)
}

enum E12(val resistance: Double) extends Resistor {
  val tolerance = 0.1
  case TenOhm extends E12(10.0)
}

