ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(
    name := "Fireworks",
    libraryDependencies ++= Seq(
      "org.creativescala" %% "doodle" % "0.9.33",
      "org.creativescala" %% "doodle-jvm" % "0.9.33",
      "org.scalatest" %% "scalatest" % "3.2.16" % Test
    )
  )
