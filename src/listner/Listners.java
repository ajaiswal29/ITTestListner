package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Browser Closed" + result.getName());

	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Browser launched" + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Title not Matched" + result.getName());
		Screenshot.capture(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

}
