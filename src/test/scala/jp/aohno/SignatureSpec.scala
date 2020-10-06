package jp.aohno

import jp.aohno.SignatureSpec.signature
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SignatureSpec extends AnyFlatSpec with Matchers {
  behavior of "Signature"
  it should "signature :: sign" in {
    it should behave
    //    signature.sign()
  }

}

object SignatureSpec {
  val signature: Signature = Signature(RequestSpec.postRequest, TokenSpec.randomToken)
}