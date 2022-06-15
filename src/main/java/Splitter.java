public class Splitter {
    private static final String PHRASE_DELIMITER = " ";

    public static String[] split(String phrase) {
        return phrase.split(PHRASE_DELIMITER);
    }
}
