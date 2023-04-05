package edu.linkedin.challenges

import scala.sys.SystemProperties
object SystemPropertiesAccessor {

  private val systemProperties = new SystemProperties()

  private def printAllSystemProperties(): Unit =
    systemProperties.foreach(println)

  @main def main: Unit = printAllSystemProperties()
}
