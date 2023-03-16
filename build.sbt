name := "ArrayFlattener"
version := "1.0.0"
ThisBuild / organization := "com.github.havryliuk"

lazy val scala213 = "2.13.10"

lazy val root = (project in file("."))
  .settings(
    scalaVersion := scala213,
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.2.15",
      "org.scalatest" %% "scalatest" % "3.2.15" % "test"),
    dockerBaseImage := "adoptopenjdk/openjdk11"
  ).enablePlugins(JavaAppPackaging)

