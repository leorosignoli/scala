package edu.linkedin.challenges

object PalindromeValidator {
  def validate(word: String): Boolean =
     word.equalsIgnoreCase(word.reverse)

}
