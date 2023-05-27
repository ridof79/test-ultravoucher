import java.util.List;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String[] words = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        List<List<String>> result = anagram.groupAnagrams(words);

        System.out.println(result);
    }
}
