class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentVal = getValue(s.charAt(i));

            if (i + 1 < length && currentVal < getValue(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }


    public static int getValue(char r) {
        return switch (r) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}