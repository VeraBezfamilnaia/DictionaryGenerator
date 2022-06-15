import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dictionary {
    private List<String> foreignWords = new ArrayList<>();

    public Dictionary(String phrase) {
        String[] words = Splitter.split(phrase);
        addWords(words);
    }

    private void addWords(String[] words) {
        foreignWords = Arrays.stream(words)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> getForeignWords() {
        return foreignWords;
    }
}
