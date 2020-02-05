import hsa.*;
public class ChallengeQuestionMortgage {
    /*public static void initialMonthlyBalance(double p, double i, double t) {
	double monthlyPayment = (p * i)/ (12 * (1 - Math.pow(1+(i/12), (-12) * t)));
	for (int k = 0; k <= t * 12; k++) {
	    if (k == 0) {
		System.out.println("month 1: " + p);
	    }
	    else {
		p = p + (p * i / 12) - monthlyPayment;
		System.out.println("month " + (k+1) + ": " + p);
	    }
	}
    }*/
    public static double balance(double p,double i, double t, int month){
	double balance = p;
	if (month == 1) {
	    return balance;   
	}
	else {
	    double monthlyPayment = (p *i )/(12*(1 - Math.pow(1+(i / 12),(-12)* t)));
	    for (int k = 1; k <= month ; k++){
		balance +=((i/12)*balance);
		balance -= monthlyPayment;
	    }
	    return balance;
	}
    } 
    public static void calculateMonthlyPayment(double p, double i, double t) {
	double monthlyPayment = (p * i)/ (12 * (1 - Math.pow(1+(i/12), -12 * t)));
	System.out.println(monthlyPayment);
	}
    public static void main (String[] args ) {
	double p = Stdin.readDouble();
	double i = Stdin.readDouble();
	double t = Stdin.readDouble();
	int month = Stdin.readInt();
	
	System.out.println(balance(p,i,t,month));
   }
}
