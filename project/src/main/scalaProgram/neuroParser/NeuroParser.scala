package scalaProgram.neuroParser

import javaPrograms.neuroData.{Blink, EEGPower, ESence, PoorSignal}
import org.json.JSONObject

object NeuroParser {
  def parse(recording: String): Unit ={
    val json = new JSONObject(recording)
    if (json.has("poorSignalLevel")) {
      PoorSignal.setPoorSignalLevel(json.getInt("poorSignalLevel"))
      if (json.has("eSense")) {
        val eSense = json.getJSONObject("eSense")
        ESence.setATTENTION(Integer.parseInt(eSense.get("attention").toString))
        ESence.setMEDITATION(Integer.parseInt(eSense.get("meditation").toString))
      }
      if (json.has("eegPower")){
        val eegPower = json.getJSONObject("eegPower")
        EEGPower.setDELTA(eegPower.getInt("delta"))
        EEGPower.setTheta(eegPower.getInt("theta"))
        EEGPower.setLowAlpha(eegPower.getInt("lowAlpha"))
        EEGPower.setHighAlpha(eegPower.getInt("highAlpha"))
        EEGPower.setLowBeta(eegPower.getInt("lowBeta"))
        EEGPower.setHighBeta(eegPower.getInt("highBeta"))
        EEGPower.setLowGamma(eegPower.getInt("lowGamma"))
        EEGPower.setHighGamma(eegPower.getInt("highGamma"))
      }
    }
    if (json.has("blinkStrength")) {
      Blink.setBLINK(Integer.parseInt(json.get("blinkStrength").toString))
    } else {
      Blink.setBLINK(-1)
    }
  }
}