package scalaProgram.main

import java.io.{File, PrintWriter}

import scalaProgram.connection.NeuroIterator
import scalaProgram.lib.{EEG, NeuroData, Parser}

import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

object BrainWaveRecorder extends App {

  val neuroData = {
    new NeuroData
  }

  val recorder = {
    new NeuroRecorder
  }

  recorder.start()
  Thread.sleep((1 minute).toMillis)

  recorder.stop() // yeah, yeah, i know ...
  println("*** STOPPED ***")
}

class NeuroRecorder extends Thread {

  import java.text.SimpleDateFormat
  import java.util.Calendar

  val timeFormat = new SimpleDateFormat("hh:mm")

  private lazy val neuroIterator: NeuroIterator = {
    Try(new NeuroIterator) match {
      case Success(v) => v
      case Failure(e) =>
        println("Please check that ThinkGearConnector is on.")
        neuroIterator
    }
  }

  override def run() {
    val printWriter = new PrintWriter(new File("log.txt"))
    var lastMinute = "xx:xx"
    while (true) {
      val recording = neuroIterator.next
      // data looks like this: EEG(ESense(35,40),EEGPower(595473,17991,4579,4579,1673,2541,1370,1370),PoorSignalLevel(0))
      println(s"$recording")
      printWriter.write(s"$recording\n")
      if (currentMinute != lastMinute) {
        println(s"MINUTE: $currentMinute")
        lastMinute = currentMinute
      }
    }
    neuroIterator.neuroSocket.close()
    printWriter.close()
  }

  def currentMinute: String = timeFormat.format(Calendar.getInstance.getTime)
}