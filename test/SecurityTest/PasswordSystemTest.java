package SecurityTest;

import org.junit.jupiter.api.Test;
import security.CredentialManager;
import security.PasswordSystem;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordSystemTest {

    @Test
    public void testAuthenticate() {
        CredentialManager credentialManager = new CredentialManager();
        PasswordSystem passwordSystem = new PasswordSystem(credentialManager);

        char[] password = "password".toCharArray();
        passwordSystem.addCredentials(passwordSystem.hash(password));

        assertTrue(passwordSystem.authenticate(0, "password".toCharArray()));
    }
}