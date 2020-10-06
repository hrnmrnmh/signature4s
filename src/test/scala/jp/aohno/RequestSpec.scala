package jp.aohno

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class RequestSpec() extends AnyFlatSpec with Matchers {
  behavior of "Request"
}

object RequestSpec {

  val postRequest: Request = Request.apply("POST", "/path/to/post", Map.empty)

}