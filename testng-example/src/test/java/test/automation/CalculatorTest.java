package test.automation;

import org.junit.Assert;
import org.testng.annotations.Test;
import test.util.HtmlUtil;

/**
 * Created by jcincera on 03/11/15.
 */
public class CalculatorTest extends AbstractTest {

    @Test
    public void testAdd() {
        Integer a = 5;
        Integer b = 10;

        driver.get(APP_BASE_URL + "/calculator/add?a=" + a + "&b=" + b);

        String response = HtmlUtil.getPageBodyContent(driver.getPageSource());

        Assert.assertEquals(15, Integer.valueOf(response).intValue());
    }
}
