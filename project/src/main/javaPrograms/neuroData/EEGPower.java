package javaPrograms.neuroData;

public final class EEGPower {

    private static int DELTA;

    private static int THETA;

    private static int LOW_ALPHA;

    private static int HIGH_ALPHA;

    private static int LOW_BETA;

    private static int HIGH_BETA;

    private static int LOW_GAMMA;

    private static int HIGH_GAMMA;

    private EEGPower(){}

    public static int getDELTA() {
        return DELTA;
    }

    public static void setDELTA(int DELTA) {
        EEGPower.DELTA = DELTA;
    }

    public static int getTHETA() {
        return THETA;
    }

    public static void setTheta(int THETA) {
        EEGPower.THETA = THETA;
    }

    public static int getLowAlpha() {
        return LOW_ALPHA;
    }

    public static void setLowAlpha(int lowAlpha) {
        LOW_ALPHA = lowAlpha;
    }

    public static int getHighAlpha() {
        return HIGH_ALPHA;
    }

    public static void setHighAlpha(int highAlpha) {
        HIGH_ALPHA = highAlpha;
    }

    public static int getLowBeta() {
        return LOW_BETA;
    }

    public static void setLowBeta(int lowBeta) {
        LOW_BETA = lowBeta;
    }

    public static int getHighBeta() {
        return HIGH_BETA;
    }

    public static void setHighBeta(int highBeta) {
        HIGH_BETA = highBeta;
    }

    public static int getLowGamma() {
        return LOW_GAMMA;
    }

    public static void setLowGamma(int lowGamma) {
        LOW_GAMMA = lowGamma;
    }

    public static int getHighGamma() {
        return HIGH_GAMMA;
    }

    public static void setHighGamma(int highGamma) {
        HIGH_GAMMA = highGamma;
    }
}
