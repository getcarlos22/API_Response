package test.java.com.api;

import org.testng.*;

public class ListenersTestNG implements ITestListener, ISuiteListener, IInvokedMethodListener {

    @Override
    public void onTestStart(ITestResult result){}

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println(result.getTestContext().getAttribute("fileOne") + " not equals " + result.getTestContext().getAttribute("fileTwo"));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getTestContext().getAttribute("fileOne") + " equals " + result.getTestContext().getAttribute("fileTwo"));
    }

    @Override
    public void onTestSkipped(ITestResult result) {}

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

    @Override
    public void onStart(ITestContext context) {}

    @Override
    public void onFinish(ITestContext context) {}

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {}

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {}

    @Override
    public void onStart(ISuite suite) {}

    @Override
    public void onFinish(ISuite suite) {}

}
