package geco;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by bah on 22/11/16.
 */
public class LoginServiceTest {
    @Test
    public void addLogin() throws Exception {
        //Given
        String[] loginsExistants = {"abdoulaye bah", "siesa marlon"};
        LoginService loginService = new LoginService(loginsExistants);
        //when and then
        assertTrue("login: abdoulaye bah existe", loginService.loginExists("abdoulaye bah"));
        loginService.addLogin("petit bah");
        assertTrue("login: petit bah existe", loginService.loginExists("petit bah"));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        //Given
        String[] loginsExistants = {"abdoulaye bah", "siesa marlon", "abdoulaye diallo"};
        LoginService loginService = new LoginService(loginsExistants);
        //When and then
        assertEquals("Il existe 2 prefix commancçant par abdoualaye", 2, loginService.findAllLoginsStartingWith("abd").size());
        assertEquals("Il existe un pefix commençant par siesa", 1, loginService.findAllLoginsStartingWith("sie").size());

    }

    @Test
    public void findAllLogins() throws Exception {
        //Given
        String[] loginsExistants = {"abdoulaye bah", "siesa marlon", "abdoulaye diallo"};
        LoginService loginService = new LoginService(loginsExistants);
        //When and then
        assertEquals("Contient 3 login service", 3, loginService.findAllLogins().size());
    }

}