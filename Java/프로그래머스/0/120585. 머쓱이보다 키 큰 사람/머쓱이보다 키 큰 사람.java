import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        answer = (int)Arrays.stream(array).filter(e -> e > height).count();
        return answer;
    }
}