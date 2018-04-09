package javaPrograms.neuroData;

public final class PoorSignal {

    private static int POOR_SIGNAL_LEVEL;

    private PoorSignal(){}

    public static int getPoorSignalLevel() {
        return POOR_SIGNAL_LEVEL;
    }

    public static void setPoorSignalLevel(int poorSignalLevel) {
        POOR_SIGNAL_LEVEL = poorSignalLevel;
    }
}
