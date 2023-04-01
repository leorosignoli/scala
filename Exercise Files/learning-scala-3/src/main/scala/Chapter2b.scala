import Chapter2b.{greeting, product}

@main def functionCalls: Unit =
  println(product(3, 3))
  println(greeting("Leonardo"))
object Chapter2b {
  // types
  val favouriteDessert = "brownie"
  val favouriteDessert2: String = "brownie"


  // functions
  def sum(n1: Int, n2: Int): Int = n1 + n2
  def lightSwitch(switchOn: Boolean = false): String = if switchOn then "light on!" else "light off!"

  def product(arg01: Int, arg02: Int): Int = arg01 * arg02

  def greeting(name: String = "Someone"): String = "Greetings ".concat(name)
}
