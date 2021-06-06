scalaVersion := "2.12.10"
val sparkVersion = "3.1.2"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.dep.spark",
      scalaVersion := "2.12.10",
      version := "0.1.0-SNAPSHOT"
    )),

    name := "de-pipeline",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-sql" % sparkVersion,
      "org.apache.spark" %% "spark-streaming" % sparkVersion,
      "com.typesafe" % "config" % "1.3.2",
      "org.scalatest" %% "scalatest" % "3.0.5" % "test"
    )
  )
