package javaPrograms;

public final class NeuroTuple {

    private final int attention;

    private final int meditation;

    public NeuroTuple(final int attention, final int meditation){
        this.attention = attention;
        this.meditation = meditation;
    }

    public final int getAttention() {
        return attention;
    }

    public final int getMeditation() {
        return meditation;
    }
}