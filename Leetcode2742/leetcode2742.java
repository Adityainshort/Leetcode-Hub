package Leetcode2742;

import java.util.Arrays;

/**
 * leetcode2742
 */
public class leetcode2742 {
    public static int paintWalls(int[] cost, int[] time) {

        if (cost.length==1) {
            return cost[0];
        }
        // sorting cost array and also applying index respectively in time

        class Pair implements Comparable<Pair> {
            int value1;
            int value2;

            Pair(int value1, int value2) {
                this.value1 = value1;
                this.value2 = value2;
            }

            @Override
            public int compareTo(Pair other) {
                return Integer.compare(this.value1, other.value1);
            }
        }

        Pair[] pairs = new Pair[cost.length];

        for (int i = 0; i < cost.length; i++) {
            pairs[i] = new Pair(cost[i], time[i]);
        }

        Arrays.sort(pairs);

        for (int i = 0; i < pairs.length; i++) {
            cost[i] = pairs[i].value1;
            time[i] = pairs[i].value2;
        }

        // ...............................................................................................

        System.out.println(Arrays.toString(cost));
        System.out.println(Arrays.toString(time));


        int min = 0;
        int count = 0;
        for (int i = 0; i < cost.length - 1; i++) {

            if (i + count >= cost.length) {
                break;
            }
            min += cost[i];
            count += time[i];
        }
        // System.out.println(min);

        return min;

    }

    public static void main(String[] args) {
        int[] cost = { 26,53,10,24,25,20,63,51 };
        int[] time = {1,1,1,1,2,2,2,1 };
        System.out.println(paintWalls(cost, time));
    }

}