package edu.linkedin.challenges

import PasswordChecker.MINIMAL_PASSWORD_SIZE

object PasswordChecker {

  val MINIMAL_PASSWORD_SIZE = 8
  def isValidPassword(password: String): List[String] = {
    StringValidator
      .validateThat(password)
      .hasEightChars()
  }

}




object StringValidator {

  def validateThat(string :String)

  def hasEightChars(string: String): StringValidator = {
    if (stringToValidate.length.>=(MINIMAL_PASSWORD_SIZE))

  }
}




