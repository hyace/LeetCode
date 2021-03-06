package leetcode.gasStation;

/**
 * Problem: Gas Station
 * Description: There are N gas stations along a circular route, where the
 * amount of gas at station i is gas[i].
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
 * travel from station i to its next station (i+1). You begin the journey with
 * an empty tank at one of the gas stations. Return the starting gas station's
 * index if you can travel around the circuit once, otherwise return -1.
 * 
 * Note:
 * The solution is guaranteed to be unique.
 * 
 * @author Chyace
 * 
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0) return -1;
        int n = gas.length;
        int sum = gas[0] - cost[0];
        int min = sum, start = 0;
        for (int i = 1; i < n; i++) {
            int t = gas[i] - cost[i];
            sum += t;
            if (sum < min) {
                min = sum;
                start = i;
            }
        }
        return sum > 0 ? (start + 1) % n : -1;
    }
}
