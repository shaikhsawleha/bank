import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class bankAccTest {

	@Test
	public void testGetAccNo() {
		//fail("Not yet implemented");
	 SavingBankAcc BankAcc = new SavingBankAcc("Mr.white",999,10000);
	 assertEquals(999,BankAcc.getAccNo());
	}

	@Test
	public void testSetBal() {
		//fail("Not yet implemented");
		 SavingBankAcc BankAcc = new SavingBankAcc("Mr.white",999,10000);
		 assertEquals(10000,BankAcc.getBal());
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		SavingBankAcc BankAcc = new SavingBankAcc("Mr.white",999,10000);
		BankAcc.deposit(1000);
		assertEquals(11000,BankAcc.bal);
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		SavingBankAcc BankAcc = new SavingBankAcc("Mr.white",999,10000);
		BankAcc.withdraw(5000);
		assertEquals(5000,BankAcc.bal);
	}
}
