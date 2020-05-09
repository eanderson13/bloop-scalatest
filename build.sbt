lazy val commonSettings = Seq(scalaVersion := "2.13.1",
  scalaSource in Compile := baseDirectory.value / ".." / "src" / "main" / "scala",
  scalaSource in Test := baseDirectory.value / ".." / "src" / "test" / "scala",
  testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", s"${baseDirectory.value}/target/html"),
  libraryDependencies ++= Seq(
    "org.pegdown" % "pegdown" % "1.4.2",
    "org.scalatest" %% "scalatest" % "3.0.8"
  )
)

lazy val bloopProject = Project("bloop", file("bloop")).settings(commonSettings)

lazy val sbtProject = Project("sbt", file("sbt")).settings(commonSettings)