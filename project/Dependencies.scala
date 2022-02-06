import sbt._

object Dependencies {
  lazy val test: List[ModuleID] =
    "org.scalatest" %% "scalatest" % "3.2.11" ::
      "org.scalatestplus" %% "scalacheck-1-15" % "3.2.11.0" :: Nil

  lazy val root: List[ModuleID] =
    "io.getquill" %% "quill-jdbc-zio" % "3.16.0.Beta2.1" ::
      "dev.zio" %% "zio" % "2.0.0-RC2" ::
      "org.postgresql" % "postgresql" % "42.3.2" :: Nil
}
