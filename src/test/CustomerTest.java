package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomerName() {
		assertEquals(TestConstants.CUSTOMER_NAME, TestConstants.TEST_COSTUMER.getName());
	}
	
	@Test
	public void testCustomerStatement() {
		assertNotNull(TestConstants.TEST_COSTUMER.statement());
	}
}
