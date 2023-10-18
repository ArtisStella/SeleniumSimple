public class LoginTest {
    private static String username = "standard_user";
    private static String password = "secret_sauce";

    public LoginTest() {}

    public void Execute () {
        System.out.println("\n  Login Test");

        //  Enter Username, Password
        HelperMethods.enterText("user-name", username);
        HelperMethods.enterText("password", password);
        
        //  Click Login
        HelperMethods.clickElement("login-button");
    }
}
