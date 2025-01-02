/*
Array Search
Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.


 */

package ArraySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraySearch {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int x = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.search(nums, x));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    static int search(int arr[], int x) {

        // Your code here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
}