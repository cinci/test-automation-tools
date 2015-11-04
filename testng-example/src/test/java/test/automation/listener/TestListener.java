package test.automation.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by jcincera on 03/11/15.
 */
public class TestListener implements ITestListener {

    /**
     * IAnnotationTransformer (doc, javadoc)
     * IAnnotationTransformer2 (doc, javadoc)
     * IHookable (doc, javadoc)
     * IInvokedMethodListener (doc, javadoc)
     * IMethodInterceptor (doc, javadoc)
     * IReporter (doc, javadoc)
     * ISuiteListener (doc, javadoc)
     * ITestListener (doc, javadoc)
     */

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
