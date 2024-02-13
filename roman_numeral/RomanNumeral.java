import java.util.HashMap;

class RomanNumeral {
    public static void main(String[] args) {

        HashMap<String, Integer> romanMap = new HashMap<String, Integer>();
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
        String[] chars = num.split(num);
    }
}
