import javax.swing.JOptionPane;

public class InsurancePremium {

	public static void main(String[] args) {
		//Declare variables
		int currentYear, birthYear, prem;
		
		//User Input
		currentYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the current year: "));
		birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your birth year: "));
		
		prem = calculatePremium(currentYear, birthYear);
		
		JOptionPane.showMessageDialog(null, "Your premium is $" + prem);
	
	}	
		public static int calculatePremium(int cy, int by) {
		int age = cy-by;
		int decade = age/10;
		int premium = (decade + 15) * 20;
		return premium;
		
		
		
	}

}
