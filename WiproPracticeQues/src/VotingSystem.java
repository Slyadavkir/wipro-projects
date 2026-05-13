import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        //  voters list
        String[] votes = {
            "Smita", "Manita", "Smita", "Sunita",
            "Anita", "Smita", "Manita", "Manita"
        };

        //  Map to count votes
        Map<String, Integer> voteCount = new HashMap<>();

        // Count votes
        for (String v : votes) {
            voteCount.put(v, voteCount.getOrDefault(v, 0) + 1);
        }

        // Find winner
        String winner = null;
        int max = 0;

        for (Map.Entry<String, Integer> e : voteCount.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("Vote Count: " + voteCount);
        System.out.println("Winner: " + winner + " (" + max + " votes)");
    }
}