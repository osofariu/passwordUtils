import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "cse.kata"
ThisBuild / organizationName := "ColumbusScalaEnthusiasts"

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      scalaVersion := "2.12.8",
      version := "0.1.0-SNAPSHOT",
      organization := "cse.kata",
      organizationName := "ColumbusScalaEnthusiasts"
    )),
    name := "secure-authentication",
    libraryDependencies ++= kataDependencies
  )


resolvers in ThisBuild ++= Seq(
  Resolver.sbtPluginRepo("releases")
)
