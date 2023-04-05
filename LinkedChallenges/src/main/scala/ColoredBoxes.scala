package edu.linkedin.challenges

import cats.effect.unsafe.implicits.global
import doodle.image.Image
import doodle.core.Color
import doodle.image.syntax.all.*
import doodle.java2d.*

import scala.annotation.tailrec

object ColoredBlocks {

  private val block = Image.square(40).fillColor(Color.blue)
  private var stackOfBlocks: Image = Image.empty

  @tailrec
  private def stack(count: Int): Image =
    if (count == 0) stackOfBlocks
    else
      stackOfBlocks = stackOfBlocks above(block)
      stack(count - 1)

  @main def drawBlocks(): Unit =
    stack(5).draw()
}

