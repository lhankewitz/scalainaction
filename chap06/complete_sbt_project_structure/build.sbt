// Quickreference: https://github.com/harrah/xsbt/wiki/Quick-Configuration-Examples

scalaVersion := "2.9.1-1"

name := "Testing SBT"

version := "1.0"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += "Sonatype repository Releases" at  "http://oss.sonatype.org/content/repositories/releases"

libraryDependencies ++= Seq (
  "org.specs2" %% "specs2" % "1.9" % "test"
  , "org.eclipse.jetty" % "jetty-server" % "7.0.0.RC2"
)

mainClass in (Compile, run):= Some("HelloWorld")

// append options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked")