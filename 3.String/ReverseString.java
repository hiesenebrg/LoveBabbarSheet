public class ReverseString {
    public String reverseWords(String s) {
        // Split the String 's' using regex " ".
        String[] words = s.split(" ");

        // Reverse each word in the 'words' array.
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        // Build a new String using the " " delimiter and return result.
        return String.join(" ", words);
    }
}
