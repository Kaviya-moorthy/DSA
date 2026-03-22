class Solution {
    public void reverseString(char[] s) {
        
        int ryt=s.length-1;
        int i=0;
            while(i<ryt){
                char temp=s[i];
                s[i]=s[ryt];
                s[ryt]=temp;
                i++;
                ryt--;
            }
        

    }
}