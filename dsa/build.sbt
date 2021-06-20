scalaVersion := "2.13.6"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.dep.dsa",
      scalaVersion := "2.13.6",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "de-dsa",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.9" % "test"
    )
  )
