import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    public List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            String sortedWord = sortString(word);

            if (anagramMap.containsKey(sortedWord)) {
                List<String> anagramList = anagramMap.get(sortedWord);
                anagramList.add(word);
            } else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(word);
                anagramMap.put(sortedWord, anagramList);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (String key : anagramMap.keySet()) {
            result.add(anagramMap.get(key));
        }
        return result;
    }

    public String sortString(String word) {
        char[] charArray = word.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        StringBuilder sortedWord = new StringBuilder();
        for (char c : charArray) {
            sortedWord.append(c);
        }

        return sortedWord.toString();
    }
}