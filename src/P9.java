import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P9 {

        public static void main(String[] args) {
                // String str = "ilovejav";
                // Map<String, List<String>> collect = Arrays.stream(str.split(""))
                // .collect(Collectors.groupingBy(x -> x));

                // System.out.println(collect);

                // Map<String, Long> collect2 = Arrays.stream(str.split(""))
                // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                // System.out.println(collect2);

                // Arrays.stream(str.split(""))
                // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                // .entrySet().stream()
                // .filter(x -> x.getValue() > 1)
                // .map(Map.Entry::getKey)
                // .collect(Collectors.toList());

                String[] votes = { "john", "johnny", "jackie", "johnny", "john", "jackie", "jamie", "jamie", "john",
                                "johnny",
                                "jamie", "johnny", "john" };
                winner(votes);

        }

        public static void winner(String[] candidates) {
                Map<String, Integer> voteCount = new HashMap<>();

                for (String candidate : candidates) {
                        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
                }
                int maxVotes = 0;
                String winner = "";
                for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
                        String candidate = entry.getKey();
                        int votesCount = entry.getValue();

                        // **Compare the current candidate's votes with the current maximum votes
                        // **If the candidate has more votes, or if there is a tie,
                        // **but the candidate's name is lexicographically smaller, update the maxVotes
                        // and winner variables

                        if (votesCount > maxVotes || (votesCount == maxVotes && candidate.compareTo(winner) < 0)) {
                                maxVotes = votesCount;
                                winner = candidate;
                        }

                }
                System.out.println("Winner: " + winner + " " + maxVotes);
        }
}