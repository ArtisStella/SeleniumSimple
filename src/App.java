public class App {

    public static void main(String[] args) throws Exception {
        
        HelperMethods.initiateWebBrowserSession();
        HelperMethods.navigateToURL(SeleniumParameters.TEST_URL);

        //  Title Test
        HelperMethods.verifyTitle("Swag Labs");
        
        LoginTest test = new LoginTest();
        test.Execute();
    }
}



