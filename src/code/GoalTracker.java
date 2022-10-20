package code;

import java.util.ArrayList;

public class GoalTracker {
	private int goal;
	private int currTotal = 0;
	private ArrayList<HistoryItem> historyItems = new ArrayList<HistoryItem>();
	private String description;
	
	public GoalTracker(int goal, String description) {
		this.goal = goal;
		this.description = description;
	}
	
	public boolean goalIsMet() {
		return currTotal >= goal;
	}
	
	public int getGoal() {
		return goal;
	}
	
	public int getCurrTotal() {
		return currTotal;
	}
	
	public void addHistoryItem(HistoryItem historyItem) {
		historyItems.add(historyItem);
		currTotal += historyItem.getAmount();
	}
	public int getDeficit() {
		return goal - currTotal;
	}
}
