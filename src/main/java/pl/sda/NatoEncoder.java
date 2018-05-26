package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class NatoEncoder {
    public String encode(String textToEncode){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("A", "Alpha");
        dictionary.put("B", "Bravo");
        dictionary.put("C", "Charlie");
        dictionary.put("D", "Delta");
        dictionary.put("E", "Echo");
        dictionary.put("F", "Foxtrot");
        dictionary.put("G", "Golf");
        dictionary.put("H", "Hotel");
        dictionary.put("I", "India");
        dictionary.put("J", "Juliett");
        dictionary.put("K", "Kilo");
        dictionary.put("L", "Lima");
        dictionary.put("M", "Mike");
        dictionary.put("N", "November");
        dictionary.put("O", "Oscar");
        dictionary.put("P", "Papa");
        dictionary.put("Q", "Quebec");
        dictionary.put("R", "Romeo");
        dictionary.put("S", "Sierra");
        dictionary.put("T", "Tango");
        dictionary.put("U", "Uniform");
        dictionary.put("V", "Victor");
        dictionary.put("W", "Whiskey");
        dictionary.put("X", "X-Ray");
        dictionary.put("Y", "Yankee");
        dictionary.put("Z", "Zulu");

        StringBuffer result = new StringBuffer();

        String[] wordsToEncode = textToEncode.toUpperCase().split(" ");

        for (int i = 0; i < wordsToEncode.length; i++) {
            StringBuffer encodedWord = new StringBuffer();
            String wordToEncode = wordsToEncode[i];
            for (int j = 0; j < wordToEncode.length(); j++) {
                Character character = wordToEncode.toCharArray()[j];
                encodedWord.append(dictionary.get(character.toString()));
                encodedWord.append(" ");
            }
            result.append(encodedWord.toString().trim());
            if (i < wordsToEncode.length - 1) {
                result.append(" / ");
            }
        }

        return result.toString();
    }
}
