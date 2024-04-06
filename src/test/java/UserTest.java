import junit.framework.TestCase;
import org.junit.Test;
import org.models.Bank;
import org.models.BankAccount;
import org.models.User;

public class UserTest extends TestCase {

    @Test
    public void testUserOperations() {
        Bank bank = new Bank();
        BankAccount account = new BankAccount("123456", "Senura Jayadeva", 1000);
        bank.addAccount(account);

        User user = new User(bank, "123456");
        user.run();
    }

}
