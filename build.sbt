name := """my-app"""
organization := "org.inforhomex"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

//MySQL
//libraryDependencies ++= Seq( javaJdbc, javaEbean, "mysql" % "mysql-connector-java" % "5.1.29"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.12"
//MariaDB
libraryDependencies += "org.mariadb.jdbc" % "mariadb-java-client" % "2.7.2"
//Postgres
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.18"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "org.inforhomex.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "org.inforhomex.binders._"
