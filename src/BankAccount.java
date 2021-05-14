
public class BankAccount {

	int accountNumber;
	char accountType;
	double avaliableBalance;
	float minimumBalanceRequired;

	
	public void viewStatement(int accountNumber, int statementDuration) {
		
	}
	public void tranferAmount(int accountNumber, char avaliableBalance, float minimumBalanceRequired) {
		
	}
	public void viewBalance(int accountNumber) {
		
	}
	public void deposit(int accountNumber, char accountType, int amountToDeposit) {
		if(amountToDeposit > 0 && accountNumber > 0) {
		avaliableBalance = avaliableBalance + amountToDeposit;
		}else {
			avaliableBalance = avaliableBalance;
		}
	}
	public void withdraw(int accountNumber, char accountType, int amountToWithdraw) {
		if(amountToWithdraw > 0 && amountToWithdraw < avaliableBalance) {
		avaliableBalance = avaliableBalance - amountToWithdraw;
		}
	}

}
