import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        stepsString("tuncay");

    }

    static void stepsString(String word){

        // alphabet, I don't know if there is lib for alphabet.
        ArrayList<Character> alphabet = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        alphabet.add(' ');

        word = word.toLowerCase();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length();i++){
            for (Character character : alphabet) {
                if (character == word.charAt(i)) {
                    result.append(word.charAt(i));
                    break;
                } else
                    System.out.println(result.toString() + character);
            }
        }
        System.out.println(result);
    }

}