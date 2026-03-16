class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            Queue<Character> q = new LinkedList<>();
            for(char ch:needle.toCharArray()){
                q.add(ch);
            }
            int j=i;
            while(!q.isEmpty()&&j<haystack.length()&& haystack.charAt(j) == q.peek()){
                q.poll();
                j++;
            }
            if (q.isEmpty()) {
                return i;
            }
        }

        return -1;
        }
    }
