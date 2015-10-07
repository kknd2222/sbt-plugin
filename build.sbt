name := "first-plugin"

version := "0.2.0"

sbtPlugin := true

organization := "org.hashgeek"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
