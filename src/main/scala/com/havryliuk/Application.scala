package com.havryliuk

import com.havryliuk.logic.ArrayFlattener._

object Application extends App {
  val array: Array[Any] = Array(Array("a", Array("b", "c"), "d"), "e")

  flatten[String](array).foreach(print)
}
