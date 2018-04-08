package javaPrograms;

public final class Parser {

    public static int getAttention(final String json) {
        final String[] strings = json.split(",");
        final String firstString = strings[0];
        final String[] substrings = firstString.split(":");
        if (substrings.length > 2){
            final String attention = substrings[2];
            System.out.println(attention);
            return Integer.parseInt(attention);
        }
        return 0;
    }

    public static int getMeditation(final String json) {
        final String[] strings = json.split(",");
        if (strings.length > 2){
            final String firstString = strings[1];
            final String[] substrings = firstString.split(":");
            if (substrings.length > 1){
                final String meditation = substrings[1];
                System.out.println(meditation);
                return Integer.parseInt(meditation.substring(0, meditation.length() - 1));
            }
            return 0;
        }
        return 0;
    }
}
