package rezende;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigDecimal;


public class AccountTest
        extends TestCase {

    public void testBalance() {
        Account account = new Account();
        assertTrue(new BigDecimal(1000).compareTo(account.getBalance()) == 0);

        TransactionType.BUY.doTransactionOperation(account, BigDecimal.valueOf(100));
        assertEquals(899.85d, account.getBalance().doubleValue());

        TransactionType.SELL.doTransactionOperation(account, BigDecimal.valueOf(100));
        assertEquals(799.75d, account.getBalance().doubleValue());

        TransactionType.DEPOSIT.doTransactionOperation(account, BigDecimal.valueOf(100));
        assertEquals(699.70d, account.getBalance().doubleValue());

        TransactionType.WITHDRWAL.doTransactionOperation(account, BigDecimal.valueOf(100));
        assertEquals(599.50d, account.getBalance().doubleValue());
    }
}
