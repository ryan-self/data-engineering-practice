package com.dep.spark.cli.wordcount

import org.apache.spark.sql.{Dataset, Encoder, Encoders, SparkSession}

object WordCountUtils {
  implicit class StringDataset(val dataSet: Dataset[String]) {
    def splitWords(spark: SparkSession)(implicit encoder: Encoder[String]):Dataset[String] = {
      dataSet
        .flatMap(_.split(' '))
        .map(_.toLowerCase)
        .map(_.filter(_.isLetterOrDigit))
    }

    def countByWord(spark: SparkSession):Dataset[(String,Long)] = {
      import spark.implicits._
      dataSet
        .groupByKey[String] { l:String => l }
        .count()
    }
  }
}
