package jp.aohno

case class Request(
                    method: String,
                    path: String,
                    parameter: Map[String, String]
                  )

