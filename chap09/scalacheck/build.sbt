name := "ScalaCheckExample"

version := "1.0"

organization := "Scala in Action"

scalaVersion := "2.9.1"

resolvers ++= Seq(
  //"snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq (
  "org.scalacheck" % "scalacheck_2.9.1" % "1.9" % "test"
)


// append -deprecation to the options passed to the Scala compiler
scalacOptions += "-deprecation"