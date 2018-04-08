val ScalatraVersion = "2.6.3"

organization := "com.nhh"

name := "arklogger"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.4"

resolvers += Classpaths.typesafeReleases

mainClass in assembly := Some("com.nhh.app.Main")

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container;compile",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.8.0"
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
