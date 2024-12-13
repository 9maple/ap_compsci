import java.util.*;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Here's your sentence in Pig Latin!");

        while (true) {
            if (sentence.indexOf(" ") == -1) {
                System.out.print(piglatin(sentence));
                break;
            }

            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);

            System.out.print(piglatin(word) + " ");
            sentence = sentence.substring(space + 1);
        }
    }

    public static String piglatin(String word) {
        if ("aeiouAEIOU".indexOf(word.substring(0, 1)) != -1) {
            return word + "-way";
        }

        int vowel = -1;
        for (int i = 0; i < word.length(); i++) {
            if ("aeiouAEIOU".indexOf(word.substring(i, i + 1)) != -1) {
                vowel = i;
                break;
            }
        }

        if (vowel > 0) {
            String consonant = word.substring(0, vowel);
            String rest = word.substring(vowel);
            return rest + consonant + "-ay";
        }

        return word + "-ay";
    }
}
