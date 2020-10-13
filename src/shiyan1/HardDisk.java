package shiyan1;

public class HardDisk {
	int amount;
    String type;
	public HardDisk() {

	}

	public HardDisk(int amount,String type) {
		this.amount = amount;
		this.type =type;
	}

	int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}