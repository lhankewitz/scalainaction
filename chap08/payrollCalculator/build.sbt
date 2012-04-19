name := "PayrollCalculator"

version := "1.0"

organization := "Scala in Action"

scalaVersion := "2.9.1" 

resolvers ++= Seq(
	"Sonatype repository Releases" at  "http://oss.sonatype.org/content/repositories/releases"
	, "Sonatype repository Snapshots" at  "http://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
	   "org.specs2" %% "specs2" % "1.9" % "test"
)
