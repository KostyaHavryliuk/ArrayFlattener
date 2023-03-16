package com.havryliuk.utils

sealed trait NotNothing[-T]

object NotNothing {
  implicit object notNothing extends NotNothing[Any]
}
