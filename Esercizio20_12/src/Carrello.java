
public class Carrello {
	
	private int amount;
	private int sum;
	private String modifica_remota;
	
	public Carrello() {
		amount=0;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void insertOneProduct() {
		amount++;
	}
	
	public void removeOneProduct() {
		if (amount>0)
		amount--;
	}
	
}
