package com.havryliuk.logic

import com.havryliuk.utils.NotNothing

import scala.reflect.ClassTag

object ArrayFlattener {

  def flatten[T: NotNothing: ClassTag](in: Array[Any]): Array[T] = in.flatMap {
    case x: Array[Any] => flatten[T](x)
    case x: Array[T]   => flatten[T](x.toArray[Any])
    case i: T          => Array[T](i)
  }
}
