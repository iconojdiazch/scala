organization := "iconotc.com"

name := "ejercicio"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.7"

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-language:_",
  "-target:jvm-1.8",
  "-encoding", "UTF-8"
)

initialCommands in console := "import com.curso.scala._"