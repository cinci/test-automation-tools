package test.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

/**
 * Created by jcincera on 03/11/15.
 */
public class AbstractTest {

    protected static final String APP_BASE_URL = "http://localhost:8080";
    protected WebDriver driver;

    /**
     * Native dependency injection
     * <p>
     * Any @Before method or @Test method can declare a parameter of type ITestContext.
     * Any @AfterMethod method can declare a parameter of type ITestResult, which will reflect the result of the test method that was just run.
     * Any @Before and @After methods can declare a parameter of type XmlTest, which contain the current <test> tag.
     * Any @BeforeMethod (and @AfterMethod) can declare a parameter of type java.lang.reflect.Method. This parameter will receive the test method that will be called once this @BeforeMethod finishes (or after the method as run for @AfterMethod).
     * Any @BeforeMethod can declare a parameter of type Object[]. This parameter will receive the list of parameters that are about to be fed to the upcoming test method, which could be either injected by TestNG, such as java.lang.reflect.Method or come from a @DataProvider.
     * Any @DataProvider can declare a parameter of type ITestContext or java.lang.reflect.Method. The latter parameter will receive the test method that is about to be invoked.
     */

    @BeforeSuite
    public void beforeSuite() {

    }

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
    }

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws Exception {

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @AfterSuite
    public void afterSuite() {

    }
}
