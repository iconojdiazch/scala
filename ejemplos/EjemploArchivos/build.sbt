name := "EjemploArchivos" 
 
version := "1.0" 
 
scalaVersion := "2.12.1" 
 
scalacOptions := Seq("-unchecked", "-deprecation", "-language:_","-target:jvm-1.8","-encoding", "UTF-8", "-Xcheckinit") 
 
libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.1" % "test") 
 
EclipseKeys.withSource := true 
 
fork in run := true 
