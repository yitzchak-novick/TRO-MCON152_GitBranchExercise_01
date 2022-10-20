package code;

public class HistoryItem {
	private int amount;
	private String description;
	private Date date;
	
	public HistoryItem(int amount, String description, Date date) {
		this.amount = amount;
		this.description = description;
		this.date = date;
	}
	
	public int getAmount() {
		return amount;
	}
	@Override
	public String toString(){
		return amount;
	}
}
