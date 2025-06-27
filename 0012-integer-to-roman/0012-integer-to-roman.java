class Solution {
    private static final int[]    VAL  =
        {1000, 900, 500, 400, 100,  90,  50,  40,  10,   9,   5,   4,   1};
    private static final String[] SYM  =
        {"M",  "CM","D", "CD","C", "XC","L", "XL","X", "IX","V", "IV","I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < VAL.length && num > 0; i++) {
            while (num >= VAL[i]) {      // fits into the remaining value
                sb.append(SYM[i]);       // append its Roman glyph(s)
                num -= VAL[i];           // reduce the remainder
            }
        }
        return sb.toString();
    }
}
