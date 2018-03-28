
public class SavingBankAcc extends Account {

	private float interest_rate;
	
	public SavingBankAcc(String name, int AccNo, int bal) {
		super(name, AccNo, bal);
		// TODO Auto-generated constructor stub
	}
	public void GetInterest() {
		// TODO Auto-generated method stub
		System.out.println("balance="+bal);
		interest_rate=((bal/100)*10);
		
		System.out.println("Interest :- "+ interest_rate);
		bal=(int) (bal+interest_rate);
		System.out.println("Balance after interest:- "+bal );
	}

}
