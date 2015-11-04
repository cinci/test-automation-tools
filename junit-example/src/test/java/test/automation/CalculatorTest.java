package test.automation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import test.util.HtmlUtil;

/**
 * Created by jcincera on 30/10/15.
 */
@RunWith(JUnit4.class)
public class CalculatorTest extends AbstractTest {

    @Test
    public void addTest() {
        Integer a = 5;
        Integer b = 10;

        driver.get(APP_BASE_URL + "/calculator/add?a=" + a + "&b=" + b);

        String response = HtmlUtil.getPageBodyContent(driver.getPageSource());

        Assert.assertEquals(15, Integer.valueOf(response).intValue());
    }
}
