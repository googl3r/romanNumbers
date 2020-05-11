name := "romanNumbers"

version := "0.1"

scalaVersion := "2.13.2"

val scalatestVersion = "3.1.0"
val ScalaCheckVersion = "1.14.3"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalatestVersion % "test",
  "org.scalacheck" %% "scalacheck" % ScalaCheckVersion % Test
)
