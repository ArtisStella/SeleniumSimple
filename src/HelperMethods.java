import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperMethods {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static String DRIVER_NAME = "webdriver.gecko.driver";
    public static String DRIVER_PATH = "src\\driver\\geckodriver.exe";
    public static int SLEEP_TIME = 2000;

    public static WebDriver driver;

    public static void waitForTime (int ms) throws Exception {
        Thread.sleep(ms);
    }

    public static void initiateWebBrowserSession() {
        System.setProperty(DRIVER_NAME, DRIVER_PATH);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public static void navigateToURL(String url) {
        driver.get(SeleniumParameters.TEST_URL);
    }

    public static void verifyTitle(String expectedTitle) {
        System.out.println("\nTitle Test");
        String actualTitle = driver.getTitle();
        
        if (actualTitle.equals(expectedTitle)) {
            System.out.println(ANSI_GREEN + "√" + ANSI_RESET + " Test Passed");
        } else {
            System.out.println(ANSI_RED + "x Test Failed" + ANSI_RESET);
        }
    }
    
    public static void enterText(String id, String testData) {
        WebElement element = driver.findElement(By.id(id));
        element.sendKeys(testData);
    }

    public static void clickElement(String id) {
        driver.findElement(By.id(id)).click();
    }
}

