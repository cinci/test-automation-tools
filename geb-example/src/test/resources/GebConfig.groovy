import org.openqa.selenium.firefox.FirefoxDriver

/**
 * Created by jcincera on 09/11/15.
 */

driver = { new FirefoxDriver() }

waiting {
    timeout = 10
}

baseUrl = "http://localhost:8080"
