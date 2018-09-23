import java.util.Scanner;

public class A3Part1Implementation implements IA3Part1 {

	public double computeTax(int amount) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // object of the class scanner --> ref: p147 javabook
		double tax;
		System.out.println("Enter your taxable amount: \n" + "Numbers only.");
		amount = scan.nextInt();

		// 2017-2018 tax rates
		if (amount <= 70000) {
			double[] taxBracket = { 0, 14000, 48000, 70000 }; // ,no notification rate}; to be added
			double[] taxRate = { 0, 0.105, 0.175, 0.30 }; // ,0.48}; to be added
			double in = amount;
			tax = 0.0d;
			for (int i = 1; i < taxBracket.length && in > 0; i++) {
				double diff = Math.min(taxBracket[i] - taxBracket[i - 1], in);
				tax += taxRate[i] * diff;
				in -= diff;
			}
		} else {
			tax = (amount * 0.33);
		}
		System.out.printf("Tax is: $%.2f", tax);
	}

	public double weeklySalary(Employee income) {
		// TODO Auto-generated method stub
		return (income.getAmount() / 52);
	}

	public double Salaryfortnight(Employee income) {
		// TODO Auto-generated method stub
		return (income.getAmount() / 26);
	}

	public double computeKiwiSaver(Employee kiwiOption) {
		// TODO Auto-generated method stub
		return (kiwiOption.getKiwiSaver());
	}

}
