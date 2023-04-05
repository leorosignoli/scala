package edu.linkedin.challenges

import PasswordChecker.MINIMAL_PASSWORD_SIZE

class PasswordChecker(validator : StringValidator) {


  def isValidPassword(password: String): List[String] = {
    validator
       .validateThat(password)
      .hasEightChars()
      .hasUppercaseLetters()
  }

}




class StringValidator(str: String, errorList: List[String] = List()) {
  val MINIMAL_PASSWORD_SIZE = 8
  def validateThat(string :String): StringValidator ={
  return new StringValidator(string)
  }

  def hasEightChars(): StringValidator = {
    if (str.length.>=(MINIMAL_PASSWORD_SIZE)) {
      errorList.appended("Password does not have %s chars".formatted(MINIMAL_PASSWORD_SIZE))
    }
    this
  }

  def hasUppercaseLetters()

}




