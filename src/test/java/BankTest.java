import junit.framework.TestCase;
import org.junit.Test;
import org.models.Bank;
import org.models.BankAccount;

public class BankTest extends TestCase {
    @Test
    public void testAddAccount() {
        Bank bank = new Bank();
        BankAccount account = new BankAccount("123456", "Senura Jayadeva", 1000);
        bank.addAccount(account);

        assertEquals(account, bank.getAccount("123456"));
    }
    @Test
    public void testGetAccount() {
        Bank bank = new Bank();
        BankAccount account = new BankAccount("123456", "Senura Jaydeva", 1000);
        bank.addAccount(account);

        assertEquals(account, bank.getAccount("123456"));
    }
}