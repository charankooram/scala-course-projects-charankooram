name := "untitled3"

version := "1.0"

scalaVersion := "2.11.8"

val akkaVersion = "2.4.12"

val akkaV       = "2.4.3"

libraryDependencies ++= {

  Seq(
    "com.typesafe.akka" %% "akka-stream-kafka" % "0.13",
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "org.slf4j" % "log4j-over-slf4j" % "1.7.12",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "net.manub" %% "scalatest-embedded-kafka" % "0.7.1"
    exclude("log4j", "log4j"),
"com.typesafe.akka" %% "akka-http-experimental" % akkaV,
"com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaV

)
}

cancelable in Global := true