import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> alphabet = new ArrayList<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        alphabet.add(' ');

        String word = "tuncay celikkanat";
        String result = "";

        for (int i = 0; i < word.length();i++){
            for (Character character : alphabet) {
                if (character == word.charAt(i)) {
                    result += word.charAt(i);
                    break;
                } else
                    System.out.println(result + character);
            }
        }
        System.out.println(result);


    }
}