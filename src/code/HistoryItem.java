package code;

public class HistoryItem {
	private int amount;
	private String description;
	
	public HistoryItem(int amount, String description) {
		this.amount = amount;
		this.description = description;
	}
	
	public int getAmount() {
		return amount;
	}
	@Override
	public String toString(){
		return amount;
	}
}
