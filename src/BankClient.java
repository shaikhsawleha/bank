
public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean flag;
		
		/*Account receiver= new Account("Mr A",995599,5000);
		*/
		System.out.println("...............................................Saving Bank account.....................................................");
		
		SavingBankAcc s=new SavingBankAcc("Mr.white",999,10000);
		
		System.out.println("Name");
		System.out.println(s.getName());
		
		System.out.println();
		
		System.out.println("Account no");
		System.out.println(s.getAccNo());
		
		System.out.println();
		
		System.out.println("Balance");
		System.out.println(s.getBal());
		
		s.deposit(5000);
		s.withdraw(1000);
		
		//int amount;
		
		//MyAcc.transfer(receiver,500);
		
		/*
		System.out.println("Balance after transfer" );
		System.out.println(MyAcc.getBal());
		*/
		s.GetInterest();
		
		System.out.println("...............................................Bank account.....................................................");
		
		Account b= new Account("Mr.Black",888,5555); 
		System.out.println("Name");
		System.out.println(b.getName());
		
		System.out.println();
		
		System.out.println("Account no");
		System.out.println(b.getAccNo());
		
		System.out.println();
		
		System.out.println("Balance");
		System.out.println(b.getBal());
		
		b.deposit(5000);
		b.withdraw(1000);
		//b.GetInterest(); gives error
		
		System.out.println("...............................................Current account.....................................................");
		
		Current_Account c=new Current_Account("Mr.Hello",999,10000);
		
		System.out.println("Before withdraw  "+c.getBal());
		
		flag=c.withdraw(7000);
		System.out.println("Flag :- "+flag);
		System.out.println("After withdraw "+c.getBal());
		//c.getBal();
		System.out.println("balance of s "+s.getBal());
	
		c.transfer(s,500);
		
		System.out.println("after transfer "+c.getBal());
		
		System.out.println("balance of s "+s.getBal());
		System.out.println("...............................................Assignment Attempts.....................................................");
			b=c;
			b.withdraw(500);
			b=s;
			b.withdraw(500);
		
			//c=b; gives error
	
			//c=s; gives error
	
			//s=c; gives error
		
	}

}
