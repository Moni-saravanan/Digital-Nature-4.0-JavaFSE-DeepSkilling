package org.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        // Arrange
        account = new BankAccount();
        account.deposit(100);
    }

    @After
    public void tearDown() {
        account = null;
    }

    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(40);

        // Assert
        assertEquals(60, account.getBalance());
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(50);

        // Assert
        assertEquals(150, account.getBalance());
    }
}
