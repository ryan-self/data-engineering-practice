package com.dep.spark.wordcount

import scala.collection.mutable


class WordCountUtilsTest extends DefaultFeatureSpecWithSpark {
  feature("Split Words") {
    //ignore("test splitting a dataset of words by spaces") {}
    scenario("test splitting a dataset of words by spaces") {
      /*
      Given("a non-empty stack")
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      val oldSize = stack.size
      When("pop is invoked on the stack")
      val result = stack.pop()
      Then("the most recently pushed element should be returned")
      assert(result === 2)
      And("the stack should have one less item than before")
      assert(stack.size == oldSize - 1)
       */
    }

    ignore("test splitting a dataset of words by period") {}

    ignore("test splitting a dataset of words by comma") {}

    ignore("test splitting a dataset of words by hypen") {}

    ignore("test splitting a dataset of words by semi-colon") {}
  }

  feature("Count Words") {
    ignore("basic test case") {}

    ignore("should not aggregate dissimilar words") {}

    ignore("test case insensitivity") {}
  }

  feature("Sort Words") {
    ignore("test ordering words") {}
  }

}
