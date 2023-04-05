package edu.linkedin.challenges

import edu.linkedin.challenges.Constants.MINIMAL_PASSWORD_SIZE
import org.scalatest.funsuite.AnyFunSuite


class PasswordCheckerTest extends AnyFunSuite {

  test("should return empty list when passwords are valid") {
    assert(PasswordChecker.isValidPassword("Password232").isEmpty)
    assert(PasswordChecker.isValidPassword("34OajISHdivÇ").isEmpty)
  }

  test("Should return list contaning messages when password isn't valid") {
    assert(PasswordChecker
      .isValidPassword("Sass2")
      .contains("Password does not have %s chars".formatted(MINIMAL_PASSWORD_SIZE)))

    assert(PasswordChecker
      .isValidPassword("Sass2")
      .contains("Password does not have %s chars".formatted(MINIMAL_PASSWORD_SIZE)))

  }


}
