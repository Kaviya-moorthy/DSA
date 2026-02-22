class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<Integer>();
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<2*nums.length;i++){
            int index=i%nums.length;
            while(!st.isEmpty() && nums[st.peek()]<nums[index]){
                    arr[st.pop()]=nums[index];
            }
            if(i<nums.length){
                st.push(index);
            }
        }
        return arr;
    }
}