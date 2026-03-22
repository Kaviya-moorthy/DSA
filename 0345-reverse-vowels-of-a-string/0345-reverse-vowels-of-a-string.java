class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int ryt = s.length() - 1;
        char[] arr = s.toCharArray();

        while(left < ryt){

            if(arr[left] != 'A' && arr[left] != 'E' && arr[left] != 'I' &&
               arr[left] != 'O' && arr[left] != 'U' &&
               arr[left] != 'a' && arr[left] != 'e' && arr[left] != 'i' &&
               arr[left] != 'o' && arr[left] != 'u'){
                left++;
                continue; 
            }

            if(arr[ryt] != 'A' && arr[ryt] != 'E' && arr[ryt] != 'I' &&
               arr[ryt] != 'O' && arr[ryt] != 'U' &&
               arr[ryt] != 'a' && arr[ryt] != 'e' && arr[ryt] != 'i' &&
               arr[ryt] != 'o' && arr[ryt] != 'u'){
                ryt--;
                continue; 
            }

            
            char temp = arr[left];
            arr[left] = arr[ryt];
            arr[ryt] = temp;

            left++;
            ryt--;
        }

        return new String(arr);
    }
}