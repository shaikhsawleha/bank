
public class Current_Account extends Account {

	public Current_Account(String name, int AccNo, int bal) {
		super(name, AccNo, bal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean withdraw(int wid)
	{
		System.out.println("Enters current_account class");
		
		if(bal-wid>=-5000){
			bal=bal-wid;
			//System.out.println("Balance after deduction");
			//System.out.println(bal);
			return true;
		
		}
		else
			System.out.println("Not sufficient, Cannot withdraw");
		return false;
	}		
}
