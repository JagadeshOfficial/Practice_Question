package Threads;
import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Solution1 {

}


class Result1 {
    public static int getMinTuningOperations(List<Integer> queryTimes) {
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

public class Solution1 {
    public static void main(String[] args) throws IOException {
        List<Integer> queryTimes1 = Arrays.asList(2, 6, 8, 16);
        System.out.println("Query Times: " + queryTimes1);
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes1));
        System.out.println("--------------------");

        List<Integer> queryTimes2 = Arrays.asList(3, 24);
        System.out.println("Query Times: " + queryTimes2);
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes2));
        System.out.println("--------------------");
        
        List<Integer> queryTimes3 = Arrays.asList(1, 3, 5);
        System.out.println("Query Times: " + queryTimes3);
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes3));
        System.out.println("--------------------");

        List<Integer> queryTimes4 = Arrays.asList(100);
        System.out.println("Query Times: " + queryTimes4);
        System.out.println("Minimum Tuning Operations: " + Result.getMinTuningOperations(queryTimes4));
        System.out.println("--------------------");
    }
}