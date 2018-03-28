import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account BankAcc;
	@Before
	public void setUp() throws Exception {
		BankAcc = new Account("mr U",1000,10000);
	}

	@Test
	public void testGetAccNo() {
		//fail("Not yet implemented");
	
	}

	@Test
	public void testGetBal() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDeposit() {
		//fail("Not yet implemented");
		BankAcc.deposit(1000);
		assertEquals(11000,BankAcc.bal);
	}

	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		BankAcc.withdraw(5000);
		assertEquals(5000,BankAcc.bal);
	}

}
