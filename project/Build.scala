import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "emls1"
    val appVersion      = "0.1"

  val appDependencies = Seq(
    "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
    "org.clapper" %% "markwrap" % "0.5.3",
    "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
    resolvers ++= Seq(
      "repo.novus rels" at "http://repo.novus.com/releases/",
      "repo.novus snaps" at "http://repo.novus.com/snapshots/")
  )


}
