public class question05 {
    /*
    Given an integer array nums and an integer k, return the kth largest element in the array.
   Note that it is the kth largest element in the sorted order, not the kth distinct element.
     */

    public int findKthLargest(int[] nums, int k) {

            int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
            for(int i : nums){
                max = Math.max(max,i);
                min = Math.min(min,i);
            }
            int n = max - min;
            int[] bucket = new int[n + 1];
            for(int i = 0;i < nums.length;i++){
                int tmp = nums[i] - min;
                bucket[tmp]++;
            }
            for(int i = n;i >= 0;i--){
                if(bucket[i] > 0)
                    k -= bucket[i];
                if(k <= 0)
                    return i + min;
            }
            return 0;
        }
    }


