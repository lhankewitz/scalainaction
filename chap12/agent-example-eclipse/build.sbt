name := "AgentExample"

scalaVersion := "2.9.1"

organization := "Scala in Action"

resolvers ++= Seq(
	"Sonatype repo" at  "https://oss.sonatype.org/content/groups/public/"
    , "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"	
	//, "Akka Repo" at "http://akka.io/repository" 
)


libraryDependencies ++= Seq(
	"org.specs2" %% "specs2" % "1.9"
	)
	
// akka libs
libraryDependencies ++= Seq(
	"com.typesafe.akka"   % "akka-actor"  % "2.0.1"
	, "com.typesafe.akka" % "akka-agent"  % "2.0.1"
	, "com.typesafe.akka" % "akka-slf4j"  % "2.0.1"
	//, "com.typesafe.akka" % "akka-stm"    % "2.0.1"
	, "com.typesafe.akka" % "akka-remote" % "2.0.1"
	//, "com.typesafe.akka" % "akka-amqp"   % "2.0.1"
	, "com.typesafe.akka" % "akka-kernel" % "2.0.1"
	)	


