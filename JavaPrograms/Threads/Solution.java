package Threads;

import java.util.HashSet;
import java.util.Set;

class Result {
    public static int getMinTuningOperations(int[] queryTimes) {
        int tuningOperations = 0;
        Set<Integer> evenTimesToProcess = new HashSet<>();

        for (int time : queryTimes) {
            if (time % 2 == 0) {
                evenTimesToProcess.add(time);
            }
        }

        while (!evenTimesToProcess.isEmpty()) {
            tuningOperations++;
            Set<Integer> nextEvenTimes = new HashSet<>();
            for (int currentTime : evenTimesToProcess) {
                int reducedTime = currentTime / 2;
                if (reducedTime % 2 == 0) {
                    nextEvenTimes.add(reducedTime);
                }
            }
            evenTimesToProcess = nextEvenTimes;
        }

        return tuningOperations;
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] queryTimes1 = {2, 6, 8, 16};
        System.out.println("Query Times: [2, 6, 8, 16]");
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes1));

        System.out.println("--------------------");

        int[] queryTimes2 = {3, 24};
        System.out.println("Query Times: [3, 24]");
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes2));

        System.out.println("--------------------");

        int[] queryTimes3 = {1, 3, 5};
        System.out.println("Query Times: [1, 3, 5]");
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes3));

        System.out.println("--------------------");

        int[] queryTimes4 = {100};
        System.out.println("Query Times: [100]");
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes4));
    }
}
