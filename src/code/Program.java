package code;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		GoalTracker goalTracker;
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter the goal amount: ");
		int goalAmount = keyboardInput.nextInt();
		keyboardInput.nextLine();
		goalTracker = new GoalTracker(goalAmount);
		while (!goalTracker.goalIsMet()) {
			System.out.println("Enter a new accomplished amount: ");
			int accomplishedAmount = keyboardInput.nextInt();
			goalTracker.addHistoryItem(new HistoryItem(accomplishedAmount));
		}
		System.out.println("Goal met");
	}

}