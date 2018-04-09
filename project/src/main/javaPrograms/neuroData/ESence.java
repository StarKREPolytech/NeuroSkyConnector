package javaPrograms.neuroData;

public final class ESence {

    private static int ATTENTION;

    private static int MEDITATION;

    private ESence(){}

    public static int getATTENTION() {
        return ATTENTION;
    }

    public static void setATTENTION(int ATTENTION) {
        ESence.ATTENTION = ATTENTION;
    }

    public static int getMEDITATION() {
        return MEDITATION;
    }

    public static void setMEDITATION(int MEDITATION) {
        ESence.MEDITATION = MEDITATION;
    }
}
