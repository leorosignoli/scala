package edu.linkedin.challenges

import edu.linkedin.challenges.Constants.{MINIMAL_PASSWORD_SIZE, NOT_ENOUGH_CHARS_MESSAGE, NO_LOWERCASE_CHARS_MESSAGE, NO_NUMBERS_MESSAGE, NO_UPPERCASE_CHARS_MESSAGE}
import org.scalatest.funsuite.AnyFunSuite


class PasswordCheckerTest extends AnyFunSuite {

  test("should return empty list when passwords are valid") {
    assert(PasswordChecker.isValidPassword("Password232").isEmpty)
    assert(PasswordChecker.isValidPassword("34OajISHdivÇ").isEmpty)
  }

  test("Should return list contaning messages when password isn't valid") {
    val result  = PasswordChecker.isValidPassword("ask")
    assert(result.contains(NOT_ENOUGH_CHARS_MESSAGE.formatted(MINIMAL_PASSWORD_SIZE)))
    assert(result.contains(NO_UPPERCASE_CHARS_MESSAGE))
    assert(result.contains(NO_NUMBERS_MESSAGE))
  }
  test("Should return list contaning single message when password is uppercase") {
    val result = PasswordChecker.isValidPassword("SCREAMING123")
    assert(!result.contains(NOT_ENOUGH_CHARS_MESSAGE.formatted(MINIMAL_PASSWORD_SIZE)))
    assert(!result.contains(NO_UPPERCASE_CHARS_MESSAGE))
    assert(!result.contains(NO_NUMBERS_MESSAGE))
    assert(result.contains(NO_LOWERCASE_CHARS_MESSAGE))
  }



}
