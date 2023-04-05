package edu.linkedin.challenges

import Constants.{MINIMAL_PASSWORD_SIZE, NOT_ENOUGH_CHARS_MESSAGE, NO_LOWERCASE_CHARS_MESSAGE, NO_NUMBERS_MESSAGE, NO_UPPERCASE_CHARS_MESSAGE}

import scala.collection.mutable.ListBuffer


object PasswordChecker {

  def isValidPassword(password: String): List[String] = {
    StringValidator()
      .validateThat(password)
      .hasEightChars
      .hasUppercaseLetters
      .hasLowercaseLetters
      .hasNumbers
      .getErrors
  }

}


case class StringValidator(str: String = "", var errorList: ListBuffer[String] = ListBuffer()) {


  def validateThat(string: String): StringValidator = StringValidator(string)


  def hasEightChars: StringValidator = {
    if (str.length.<(MINIMAL_PASSWORD_SIZE))
      errorList.addOne(NOT_ENOUGH_CHARS_MESSAGE.formatted(MINIMAL_PASSWORD_SIZE))
    this
  }

  def hasUppercaseLetters: StringValidator = {
    if (!str.exists(_.isUpper))
      errorList.addOne(NO_UPPERCASE_CHARS_MESSAGE)
    this
  }

  def hasLowercaseLetters: StringValidator = {
    if (!str.exists(_.isLower))
      errorList.addOne(NO_LOWERCASE_CHARS_MESSAGE)
    this
  }


  def hasNumbers: StringValidator = {
    if (!str.exists(_.isDigit))
      errorList.addOne(NO_NUMBERS_MESSAGE)
    this
  }

  def getErrors: List[String] = errorList.toList
}




