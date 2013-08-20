package org.hashgeek

import sbt._
import sbt.Keys._

object PluginBuild extends Build {

  lazy val playSass = Project(
    id = "first-plugin", base = file(".")
  )

}
