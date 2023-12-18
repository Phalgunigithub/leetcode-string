class Solution {
    public int getMaximumGenerated(int n) {
        
        /*if (n == 0) return 0;

when n is equal to 0.
 arr[0] = 0.  when the input n is 0, the array has only one element (0), and the maximum value in the array is also 0. By returning 0 immediately, it avoids unnecessary calculations 
 
if (n == 1) return 1;
 When n is 1, the array has two elements ([0, 1]). The maximum value in the array is 1. Returning 1 immediately for this case saves unnecessary computations 
 
 creates an array  holding n + 1 integers. n + 1 because the sequence includes numbers from 0 to n
 
 int maxi = Integer.MIN_VALUE; is like starting with the smallest possible number. It helps when finding the maximum value in an array because any actual number in the array will be bigger than this initial value.
 
  starts from i = 2 because the array arr has already been initialized with values at indices 0 and 1. 
  
  
  Even Indices (i % 2 == 0):

For even indices, the pattern dictates that nums[2 * i] should be equal to nums[i].
Odd Indices (i % 2 != 0):

For odd indices, the pattern dictates that nums[2 * i + 1] should be the sum of nums[i] and nums[i + 1].

For even indices (i % 2 == 0), set arr[i] to the value at half of the index (arr[i / 2]).
For odd indices (i % 2 != 0), set arr[i] to the sum of values at half and half + 1 indices (arr[i / 2] + arr[(i / 2) + 1]).
 
 Return the maximum value found in the array.
 
 Let's take n = 7 as an example:

Initialize arr as [0, 1, 0, 0, 0, 0, 0, 0].
Loop starts at i = 2:
For i = 2 (even), set arr[2] = arr[2 / 2] → arr[2] = arr[1] → arr[2] = 1.
For i = 3 (odd), set arr[3] = arr[3 / 2] + arr[(3 / 2) + 1] → arr[3] = arr[1] + arr[2] → arr[3] = 1 + 1 → arr[3] = 2.
Continue similarly for i = 4, i = 5, i = 6, i = 7.
After the loop, arr becomes [0, 1, 1, 2, 1, 3, 2, 3].
The maximum value in the array is 3.
So, for n = 7, the output is 3.

 compares the current elem with the current value of maxi. It updates maxi to be the larger of the two values.

*/
        
        //base case arr[o]==0 so max =0 so return 0
        if(n==0)
            return 0;
        
        //arr[1]=[0,1] max=1;so return 1
        if(n==1)
            return 1;
        
        int[] arr=new int[n+1];
        
        arr[0]=0;
         arr[1]=1;
        int maxi= Integer.MIN_VALUE;
        
        for(int i=2;i<=n;i++){
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i / 2] + arr[(i / 2) + 1];
            }
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
}