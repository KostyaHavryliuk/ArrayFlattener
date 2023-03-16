package com.havryliuk.logic

import com.havryliuk.logic.ArrayFlattener._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ArrayFlattenerSpec extends AnyFlatSpec with Matchers {

  "An ArrayFlattener" should "flatten an Array of Any" in {
    val array: Array[Any] = Array(Array("a", Array("b", 2), 0.5), "e")
    flatten[Any](array) shouldBe Array("a", "b", 2, 0.5, "e")
  }

  it should "flatten an array of Any to Array of Strings" in {
    val array: Array[Any] = Array(Array("a", Array("b", "c"), "d"), "e")
    flatten[String](array) shouldBe Array("a", "b", "c", "d", "e")
  }

  it should "flatten an array of Any to Array of Int" in {
    val array: Array[Any] = Array(Array(1, Array(2, 3), 4), 5)
    flatten[Int](array) shouldBe Array(1, 2, 3, 4, 5)
  }

  it should "fail if elements of Array is different from resulting parameter type" in {
    val array: Array[Any] = Array(Array(1, Array(2, "c"), 4), 5)
    a[MatchError] should be thrownBy {
      flatten[Int](array)
    }
  }
}
