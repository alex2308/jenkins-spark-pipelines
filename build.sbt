name := "jenkins-test"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq("org.typelevel" %% "cats-core" % "2.0.0",
  "org.apache.spark" %% "spark-core" % "2.3.4",
  "org.apache.spark" %% "spark-sql" % "2.3.4",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test")