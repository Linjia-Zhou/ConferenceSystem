package DatabaseTest;

import gateway.Database;
import gateway.UserUpdater;
import org.junit.jupiter.api.Test;
import users.base.UserManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    @Test
    public void test() {
        Database database = new Database();
        UserManager userManager = new UserManager();
        UserUpdater userUpdater = new UserUpdater(userManager, database);
        userUpdater.loadUsers();
        assertEquals(0, userManager.getUsers().get(0).getId());
        assertEquals(1, userManager.getUsers().get(1).getId());
    }

}
