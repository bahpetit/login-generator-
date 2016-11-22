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
    @Test
    public void generateLoginForNomAndPrenom_Not_JRAL2() throws Exception {
        //Given
        loginService = new LoginService(new String[] {"JROL", "BPER","CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertFalse("Le login de John Ralling n'est pas: JRAL2", !("JRAL2".equals(loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"))));
    }


    @Test
    public void generateLoginForNomAndPrenom_Not_JRAL2() throws Exception {
        //Given
        loginService = new LoginService(new String[] {"JROL", "BPER","CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertTrue("Le login de John Ralling n'est pas: JRAL2", ("JRAL2".equals(loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"))));
    }
    @Test
    public void generateLoginForNomAndPrenom_JROL1() throws Exception {
        //Given
        loginService = new LoginService(new String[] {"JROL", "BPER","CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertTrue("Le login de Paul Durand est: JROL1", "JROL1".equals(loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean")));
    }
    @Test
    public void generateLoginForNomAndPrenom_PDUR_accent() throws Exception {
        //Given
        loginService = new LoginService(new String[] {"JROL", "BPER","CGUR", "JDUP", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        assertTrue("Le login de Paul Durand est: PDUR", "PDUR".equals(loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul")));
    }
}