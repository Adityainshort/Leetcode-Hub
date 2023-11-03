package Leetcode2251;

import java.util.HashMap;

public class leetcode2251 {
    public static int[] fullBloomFlowers(int[][] flowers, int[] people) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : people) {
            int count = 0;

            if (map.containsKey(x)) {
            } else {

                for (int i = 0; i < flowers.length; i++) {
                    int a, b;

                    a = flowers[i][0];
                    b = flowers[i][1];

                    if (x < a || x > b) {
                    } else {
                        count += 1;
                    }

                }
                map.put(x, count);
            }
        }
        int[] ans = new int[people.length];
        for (int index = 0; index < people.length; index++) {
            ans[index] = map.get(people[index]);

        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 10 }, { 3, 3 } };
        int[] a = { 3,3, 2 };
        int[] b = fullBloomFlowers(nums, a);
        for (int i : b) {
            System.out.print(i + " ");
        }

    }
}
