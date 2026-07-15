class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for(int n : nums){
            if(list.contains(n)) return true;
            else list.add(n);
        }
        return false;
    }
}

//ArrayList bhi kr skte the but voh check sequentially krta 
// aur HashSet me hash fxn se fash searching kr leta.