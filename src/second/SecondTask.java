package second;

public class SecondTask {
    public static void main(String[] args) {
        wordsCount("    I love   Java      ");
        String word = "eye   ";
        if (isWordPalindrome(word.toLowerCase())) {
            System.out.println(word.toLowerCase() + " -> palindrome");
        } else {
            System.out.println(word.toLowerCase() + " -> is not a palindrome");
        }
    }

    public static int wordsCount(String name) {
        int count = 1;
        name = name.trim();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ' && name.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println(name + " -> " + count + " words");
        return count;
    }

    public static boolean isWordPalindrome(String name) {
        char[] word = name.toCharArray();
        name = name.trim();
        int left = 0;
        int right = name.length() - 1;
        while (left != right) {
            if (word[left] != word[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}