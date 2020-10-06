package jp.aohno

case class Signature(
                      request: Request,
                      token: Token
                    ) {
  def verify(): Boolean = {
    ???
  }

  def sign(): String = {
    ???
  }
}
