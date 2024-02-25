import java.util.HashMap;

class RomanNumeral {
    static HashMap<String, Integer> romanMap;

    public static void main(String[] args) {

        romanMap = new HashMap<String, Integer>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        String s = "III";
        solution(s);
        s = "LVIII";
        solution(s);
        s = "MCMXCIV";
        solution(s);
    }

    public static void solution(String num) {
        System.out.println("run test");
        // split to get each number
        String[] chars = num.split("");
        for (int i = 0; i < chars.length; i++) {
            String currChar = chars[i];
            if (i != chars.length) {

                String nextChar = chars[i + 1];
                System.out.println(currChar);
                if (romanMap.get(currChar) < romanMap.get(nextChar)) {

                }
            }
        }
    }
}
