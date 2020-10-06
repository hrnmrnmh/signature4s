package jp.aohno

import java.util.UUID

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TokenSpec extends AnyFlatSpec with Matchers {
  behavior of "Token"
}

object TokenSpec {
  val randomToken: Token = Token.apply(
    UUID.randomUUID().toString
    , UUID.randomUUID().toString
  )
}