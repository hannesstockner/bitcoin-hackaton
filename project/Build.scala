import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "bitcoin-hackaton"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.google" % "bitcoinj" % "0.8"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here 
    resolvers += "mvnrepository" at "http://repo1.maven.org/maven2/",
    resolvers += "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"     
  )

}
