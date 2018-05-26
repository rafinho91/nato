package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class NatoDecoder {
    public String decode(String textToDecode) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Alpha", "A");
        dictionary.put("Bravo", "B");
        dictionary.put("Charlie", "C");
        dictionary.put("Delta", "D");
        dictionary.put("Echo", "E");
        dictionary.put("Foxtrot.", "F");
        dictionary.put("Golf", "G");
        dictionary.put("Hotel", "H");
        dictionary.put("India", "I");
        dictionary.put("Juliett", "J");
        dictionary.put("Kilo", "K");
        dictionary.put("Lima", "L");
        dictionary.put("Mike", "M");
        dictionary.put("November", "N");
        dictionary.put("Oscar", "O");
        dictionary.put("Papa", "P");
        dictionary.put("Quebec", "Q");
        dictionary.put("Romeo", "R");
        dictionary.put("Sierra", "S");
        dictionary.put("Tango", "T");
        dictionary.put("Uniform", "U");
        dictionary.put("Victor", "V");
        dictionary.put("Whiskey", "W");
        dictionary.put("X-Ray", "X");
        dictionary.put("Yankee", "Y");
        dictionary.put("Zulu", "Z");
        dictionary.put("/", " ");

        String[] letters = textToDecode.split(" ");
        StringBuffer result = new StringBuffer();
        for (String letter : letters) {
            result.append(dictionary.get(letter));
        }
        return result.toString();

    }
}
