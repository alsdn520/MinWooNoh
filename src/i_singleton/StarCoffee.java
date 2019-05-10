package i_singleton;

public class StarCoffee {
	//String coffee;
	int money;
	
	public void takeAmericano(int money) {
		this.money += money;
	}//커피 수입.
	
    public void soewInfo() {
    	System.out.println("스타커피의 수입은"+money);
    }
}
