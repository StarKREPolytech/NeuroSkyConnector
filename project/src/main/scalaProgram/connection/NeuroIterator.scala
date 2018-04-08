package scalaProgram.connection

import java.io.{BufferedReader, InputStreamReader, OutputStreamWriter}
import java.net.Socket

import scala.collection.generic.CanBuildFrom
import scala.collection.immutable
import scala.reflect.ClassTag
import scala.util.parsing.json.JSONObject

class NeuroIterator(rawOutput: Boolean = false, jsonFormat: Boolean = true, host: String = "127.0.0.1", port: Int = 13854) extends Iterator[String] {
  val neuroSocket = new Socket(host, port)
  val neuroInput = new BufferedReader(new InputStreamReader(neuroSocket.getInputStream))
  val neuroOutput = new OutputStreamWriter(neuroSocket.getOutputStream)

  def configure(rawOutput: Boolean = false, jsonFormat: Boolean = true): Unit = {
    val jsonConfig = JSONObject(Map("enableRawOutput" -> rawOutput,
      "format" -> (if (jsonFormat) "Json" else "BinaryPacket")))
    neuroOutput.write(jsonConfig.toString())
    neuroOutput.flush()
  }

  configure(rawOutput, jsonFormat)

  def hasNext: Boolean = true

  def next: String = {
    neuroInput.readLine()
  }

  override def toArray[A1 >: String](implicit evidence$1: ClassTag[A1]): Array[A1] = ???

  override def toIndexedSeq: immutable.IndexedSeq[String] = ???

  override def toVector: Vector[String] = ???

  override def to[Col[_]](implicit cbf: CanBuildFrom[Nothing, String, Col[String]]): Col[String] = ???
}