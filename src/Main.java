import java.util.*;

public class Main {
    static String CLASSICTEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        char key;
        String ClassicText = CLASSICTEXT.toLowerCase();
        for(int i = 0; i < ClassicText.length(); i++){
            if(Character.isLetter(ClassicText.charAt(i))) {
                key = ClassicText.charAt(i);
                if (map.containsKey(key)) {
                    map.put(key, (map.get(key) + 1));
                } else {
                    map.put(key, 1);
                }
            }
        }
        int minQuantity = Integer.MAX_VALUE;
        int maxQuantity= -1;
        char minValue = ' ';
        char maxValue = ' ';
        for(int i = 0; i < ClassicText.length(); i++){
            if(Character.isLetter(ClassicText.charAt(i))){
                if(maxQuantity < map.get(ClassicText.charAt(i))){
                    maxQuantity = map.get(ClassicText.charAt(i));
                    maxValue = ClassicText.charAt(i);
                }if(minQuantity > map.get(ClassicText.charAt(i))){
                    minQuantity = map.get(ClassicText.charAt(i));
                    minValue = ClassicText.charAt(i);
                }
            }
        }
        System.out.println("Встречалась чаще всего: " + maxValue + " - " + maxQuantity);
        System.out.println("Встречалась реже всего: " + minValue + " - " + minQuantity);
    }
}