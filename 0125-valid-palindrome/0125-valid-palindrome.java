class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Not a palindrome
            }

            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car"));                    // false
        System.out.println(sol.isPalindrome("0P"));                            // false
        System.out.println(sol.isPalindrome(""));                              // true (empty is valid)
        System.out.println(sol.isPalindrome("No lemon, no melon"));           // true
    }
}
