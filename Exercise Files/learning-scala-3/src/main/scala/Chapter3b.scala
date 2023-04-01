import Chapter3b.{greeting, greeting2, partyAtHome, weather}

@main def patternMatching: Unit =
  println(partyAtHome(4, false))
  println(weather(false))
  println(greeting("Leo"))
  println(greeting2("not leo"))
object Chapter3b {
  def partyAtHome(guests: Int, tentAvailable: Boolean): Boolean =
    if guests < 15 then true
    else if tentAvailable && guests < 40 then true
    else false
  end partyAtHome

  def weather(sunny: Boolean): String = if sunny then
    "yay! Where are my sunglasses?"
  else
    "oh where is my umbrella?"

  def greeting(friend: String): String = friend match
    case "Ada" => "hi Ada!"
    case "Deji" => "hi Deji!"
    case _ => "hi! What's your name?"
  end greeting

  def greeting2(friend: String): String = friend match
    case "Ada" | "Deji" => "hi my friend! Long time no see!"
    case newFriend => s"hi $newFriend! It's so nice to meet you!"
  end greeting2
}
