package scalaProgram.lib

case class EEGPower(
  delta: Int,
  theta: Int,
  lowAlpha: Int, highAlpha: Int,
  lowBeta: Int, highBeta: Int,
  lowGamma: Int, highGamma: Int
) extends NeuroData {

  def print() {
    println(delta, theta, lowAlpha, highAlpha, lowBeta, highBeta, lowGamma, highGamma)
  }
}