package org.hashgeek

import sbt._
import sbt.Keys._

object MyPlugin extends Plugin {
  val newTask = TaskKey[Unit]("new-task")
  val newSetting = SettingKey[String]("new-setting")

  val newSettings = Seq(
    newSetting := "test-11",
    newTask <<= newSetting map { str => println(str) }
    
  )
}

