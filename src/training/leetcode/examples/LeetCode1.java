package training.leetcode.examples;


/*
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    public static void main(String[] args) {

        int[] val = twoSum(new int[] {2,7,11,15}, 17);
        Arrays.stream(val).asLongStream().forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target){
        // This is brute force coding
        /*for(int i =0; i< nums.length ; i++){
            for(int j = i+1; j <nums.length; j++){
                if(nums[i] + nums[j] == target){
                return new int[] {i, j};
                }
            }
        }
        return new int[] {};*/

        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int complement = target - nums[i];
            if (hashMap.containsKey(complement)) {
                return new int[] { hashMap.get(complement), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
