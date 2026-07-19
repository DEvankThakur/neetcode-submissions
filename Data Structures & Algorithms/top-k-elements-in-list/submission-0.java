
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Store answer
        int[] ans = new int[k];

        // Step 3: Find max frequency k times
        for (int i = 0; i < k; i++) {

            int maxKey = 0;
            int maxFreq = 0;

            // Find element with maximum frequency
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            ans[i] = maxKey;

            // Remove it so next highest can be found
            map.remove(maxKey);
        }

        return ans;
    }
}