package BankTechTest;

import org.junit.After;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class BankAccountTest {

    BankAccount bankAccount;

    @Before
    public void setUp() {
        bankAccount = BankAccount.getInstance(0);
    }

    @Test
    public void depositMoney1() {
        String[] actualResult = bankAccount.deposit(1000, "10-01-2012");
        String[] expectedResult = {"10-01-2012", null, "1000.0", "1000.0"};
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void depositMoney2() {
        String[] actualResult = bankAccount.deposit(2000, "13-01-2012");
        String[] expectedResult = {"13-01-2012", null, "2000.0", "3000.0"};
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void withdrawMoney() {
        String[] actualResult = bankAccount.widthdraw(500, "14-01-2012");
        String[] expectedResult = {"14-01-2012", null, "", "500"};
        assertEquals(expectedResult, actualResult);
    }

    @After
    public void tearDown() {
    }
}