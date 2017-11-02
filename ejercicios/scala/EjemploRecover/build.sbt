name := "EjemploRecover" 
 
version := "1.0" 
 
scalaVersion := "2.12.1" 
 
scalacOptions := Seq("-unchecked", "-deprecation", "-language:_","-target:jvm-1.8","-encoding", "UTF-8", "-Xcheckinit") 
 
libraryDependencies ++= Seq("ch.qos.logback" % "logback-classic" % "1.1.8","com.typesafe.akka" %% "akka-slf4j" % "2.4.16", "com.typesafe.akka" %% "akka-actor" % "2.4.16", "com.typesafe.akka" %% "akka-stream" % "2.4.16", "com.typesafe.akka" %% "akka-testkit" % "2.4.16" % "test", "org.scalatest" %% "scalatest" % "3.0.1" % "test") 
 
EclipseKeys.withSource := true 
 
fork in run := true 
