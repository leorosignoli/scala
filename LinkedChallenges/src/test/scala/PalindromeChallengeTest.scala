package edu.linkedin.challenges

import org.scalatest.funsuite.AnyFunSuite

class PalindromeChallengeTest extends AnyFunSuite {

  test("should return true since hannah is a palindrome"){
    assert(PalindromeValidator.validate("hannah"))
  }

  test("should return true since hannah is a palindrome and case is ignored"){
    assert(PalindromeValidator.validate("WOooOow"))
  }

  test("should return false when words are not palindromes") {
    assert(!PalindromeValidator.validate("notst"))
    assert(!PalindromeValidator.validate("SIljhnS"))
  }
}
