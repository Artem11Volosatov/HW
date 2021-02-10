import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoneyTransactionTest {

	private static final int NEGATIVE_MONEY = -1;
	private static final String MESSAGE = "Money amount should be greater than 0";
	
	MoneyTransactionService testInstance;
	 
	
	@BeforeEach
	 void setUp() {
		testInstance = new MoneyTransactionService();
	}
	
	@Test
	void shouldThrowIllegakArgumentException() {
		Account accountFrom = new Account();
		Account accountTo = new Account();
		
		var e = assertThrows(IllegalArgumentException.class, () -> {
			testInstance.transferMoney(accountFrom, accountTo, NEGATIVE_MONEY);
		});
		assertEquals(MESSAGE, e.getMessage());
	}
	
}
