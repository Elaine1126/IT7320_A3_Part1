public class Employee {

	int amount;
	double KiwiSaverRate;
	
	public income(int amount, int KiwiSaverRate) {
		this.amount = amount;
		this.KiwiSaverRate = KiwiSaverRate;
	}
	
	public double getKiwiSaver() { 
		return (KiwiSaverRate * amount);
	}

	//generated getters and setters for amount and KiwiSaverRate
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getKiwiSaverRate() {
		return KiwiSaverRate;
	}
	public void setKiwiSaverRate(double kiwiSaverRate) {
		KiwiSaverRate = kiwiSaverRate;
	}
	
}
