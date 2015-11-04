package test.automation;

import org.junit.*;
import org.junit.rules.ExternalResource;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jcincera on 02/11/15.
 */
public abstract class AbstractTest {

    protected static final String APP_BASE_URL = "http://localhost:8080";

    //private Process appProcess;
    protected WebDriver driver;

    //
    // @ClassRule - only static
    //
    // @RuleChain
    //

    @Rule
    public final ExternalResource runApp = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            super.before();
            driver = new FirefoxDriver();
            //appProcess = Runtime.getRuntime().exec("../gradlew :junit-example:run");
            //Thread.sleep(10*1000);
        }

        @Override
        protected void after() {
            super.after();
            driver.quit();
            //appProcess.destroy();
        }
    };

    @Rule
    public final TestWatcher testWatcher = new TestWatcher() {
        @Override
        public Statement apply(Statement base, Description description) {
            return super.apply(base, description);
        }

        @Override
        protected void succeeded(Description description) {
            super.succeeded(description);
        }

        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);
        }

        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            super.skipped(e, description);
        }

        @Override
        protected void skipped(org.junit.internal.AssumptionViolatedException e, Description description) {
            super.skipped(e, description);
        }

        @Override
        protected void starting(Description description) {
            super.starting(description);
        }

        @Override
        protected void finished(Description description) {
            super.finished(description);
        }
    };

    @BeforeClass
    public static void beforeClass() {

    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @AfterClass
    public static void afterClass() {

    }
}
