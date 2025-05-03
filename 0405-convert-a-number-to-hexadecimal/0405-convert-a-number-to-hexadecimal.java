class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

        long n = num & 0xFFFFFFFFL; // treat as unsigned 32-bit

        while (n != 0) {
            int hexDigit = (int)(n & 0xF);  // get last 4 bits
            sb.append(hexChars[hexDigit]);  // convert to hex char
            n >>= 4;  // shift 4 bits to right
        }

        return sb.reverse().toString(); // reverse because we built it backwards
    }
}
