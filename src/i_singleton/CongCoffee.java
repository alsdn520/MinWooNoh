package i_singleton;

public class CongCoffee {
	int money;
	
	public void takeLatte(int money) {
		this.money += money;
	}
	
	public void soewInfo() {
    	System.out.println("콩커피의 수입은"+money);
    }
}
