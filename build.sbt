name := "sparklens"
organization := "com.qubole"

scalaVersion := "2.12.10"


spName := "qubole/sparklens"

sparkVersion := "2.4.8"

spAppendScalaVersion := true

libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion.value % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion.value % "provided"

libraryDependencies +=  "org.apache.hadoop" % "hadoop-client" % "2.10.2" % "provided"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.6" % "provided"

libraryDependencies += "org.apache.httpcomponents" % "httpmime" % "4.5.6" % "provided"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % "test"

test in assembly := {}

testOptions in Test += Tests.Argument("-oF")

scalacOptions ++= Seq("-target:jvm-1.8")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

publishMavenStyle := true
