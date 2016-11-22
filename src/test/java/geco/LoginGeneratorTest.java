package geco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bah on 22/11/16.
 */
public class LoginGeneratorTest {
    LoginService loginService;
    @Test
    public void generateLoginForNomAndPrenom_PDUR() throws Exception {
        //Given
        loginService = new LoginService(new String[] {"JROL", "BPER","CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertTrue("Le login de Paul Durand est: PDUR", "PDUR".equals(loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul")));
    }


}