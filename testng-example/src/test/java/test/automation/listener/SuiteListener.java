package test.automation.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by jcincera on 03/11/15.
 */
public class SuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        //suite.getAllMethods().get(0).getMethodName()...
    }

    @Override
    public void onFinish(ISuite suite) {

    }
}
