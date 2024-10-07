package test;

public class LoginTest extends TestBase {

    @Override
    public void startApplication() {
        System.out.println("Starting browser");
        System.out.println("Opening application");
    }

    public void loginWithValidCredentials() {
        startApplication();
        System.out.println("Enter correct credentials");
        System.out.println("Validate that the user is signed in");
    }

    public void loginWithInvalidCredentials() {
        startApplication();
        System.out.println("Enter incorrect credentials");
        System.out.println("Validate that the error message is displayed");
    }

}
