import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return arr1.length < arr2.length ? -1 : 1;
        } else {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            return sum1 < sum2 ? -1 : sum1 == sum2 ? 0 : 1;
        }
    }
}