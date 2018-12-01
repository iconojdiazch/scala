echo Creando proyecto %1
mkdir %1
cd %1
mkdir src\main\scala
mkdir src\main\java
mkdir src\main\resources
mkdir src\test\scala
mkdir src\test\java
mkdir src\test\resources
echo name := "%1" > build1.sbt
echo. >> build1.sbt
echo version := "1.0" >> build1.sbt
echo. >> build1.sbt
echo scalaVersion := "2.12.7" >> build1.sbt
echo. >> build1.sbt
echo scalacOptions := Seq("-unchecked", "-deprecation", "-language:_","-target:jvm-1.8","-encoding", "UTF-8", "-Xcheckinit") >> build1.sbt
echo. >> build1.sbt
echo libraryDependencies ++= Seq("org.scalatest" $$ "scalatest" $ "3.0.1" $ "test") >> build1.sbt
echo. >> build1.sbt
echo EclipseKeys.withSource := true >> build1.sbt
echo. >> build1.sbt
echo fork in run := true >> build1.sbt
type "build1.sbt" | ..\findrepl "\$" "%%" >"build.sbt"
del build1.sbt
echo object Principal extends App{ > src\main\scala\Principal.scala
echo. >> src\main\scala\Principal.scala
echo println("Fin") >> src\main\scala\Principal.scala
echo. >> src\main\scala\Principal.scala
echo } >> src\main\scala\Principal.scala
sbt run eclipse