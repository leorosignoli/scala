ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "LinkedChallenges",
    idePackagePrefix := Some("edu.linkedin.challenges"),
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test",
    libraryDependencies ++= Seq(
      "org.creativescala" %% "doodle" % "0.18.0",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )

  )
