package implimentation;

import com.xworkz.interface1.internal.BankRule;

public class BankAccount implements BankRule {

	@Override
	public String AccountClosureRules() {
   System.out.println("running accountCLOsureRules in bankaccount");
		return null;
	}

	@Override
	public String CustomerGrievanceRedressal() {
		   System.out.println("running CustomerGrievanceRedressal in bankaccount");
		return null;
	}

	@Override
	public boolean PrivacyandDataProtection() {
		   System.out.println("running PrivacyandDataProtection in bankaccount");
		return false;
	}

	@Override
	public int FeesandCharges() {
		   System.out.println("running FeesandCharges in bankaccount");
		return 0;
	}

	@Override
	public int ChequeClearance() {
		   System.out.println("running ChequeClearance in bankaccount");
		return 0;
	}

	@Override
	public String AccountHolderName() {
		   System.out.println("running accountCLOsureRules in bankaccount");
		return null;
	}

	@Override
	public int CorrectAccountNumber() {
		   System.out.println("running CorrectAccountNumber( in bankaccount");
		return 0;
	}

	@Override
	public String SeeAccountHolderName() {
		   System.out.println("running SeeAccountHolderName in bankaccount");
		return null;
	}

	@Override
	public int LoanEligibility() {
		   System.out.println("running LoanEligibility in bankaccount");
		return 0;
	}

	@Override
	public boolean FraudDetectionandAlerts() {
		   System.out.println("running FraudDetectionandAlerts in bankaccount");
		return false;
	}

	@Override
	public String OverdraftProtection() {
		   System.out.println("running OverdraftProtection in bankaccount");
		return null;
	}

	@Override
	public String AccountDormancy() {
		   System.out.println("running AccountDormancy in bankaccount");
		return null;
	}

	@Override
	public int InterestCalculation() {
		   System.out.println("running InterestCalculation in bankaccount");
		return 0;
	}

}
