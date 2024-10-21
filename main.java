import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineVotingMachine {
    private Map<String, Integer> candidates;

    public OnlineVotingMachine() {
        candidates = new HashMap<>();
    }

    public void addCandidate(String candidateName) {
        candidates.put(candidateName, 0);
    }

    public void vote(String candidateName) {
        if (candidates.containsKey(candidateName)) {
            int currentVotes = candidates.get(candidateName);
            candidates.put(candidateName, currentVotes + 1);
            System.out.println("Your vote for " + candidateName + " has been recorded.");
        } else {
            System.out.println("Invalid candidate name. Please try again.");
        }
    }

    public void printResults() {
        System.out.println("Voting Results:");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            String candidateName = entry.getKey();
            int votes = entry.getValue();
            System.out.println(candidateName + ": " + votes + " votes");
        }
    }

    public static void main(String[] args) {
        OnlineVotingMachine votingMachine = new OnlineVotingMachine();
        votingMachine.addCandidate("Candidate 1");
        votingMachine.addCandidate("Candidate 2");
        votingMachine.addCandidate("Candidate 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Voting Machine!");

        while (true) {
            System.out.println("\n1. Cast Vote");
            System.out.println("2. View Results");
            System.out.println("3. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the candidate name: ");
                    scanner.nextLine(); // Consume the newline character
                    String candidateName = scanner.nextLine();
                    votingMachine.vote(candidateName);
                    break;
                case 2:
                    votingMachine.printResults();
                    break;
                case 3:
                    System.out.println("Thank you for using the Online Voting Machine. Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
