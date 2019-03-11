import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.6"
  lazy val mockitoScala = "org.mockito" %% "mockito-scala" % "1.2.0"


  lazy val kataDependencies: Seq[ModuleID] = Seq(
    scalaTest % Test,
    mockitoScala % Test
  )
}
