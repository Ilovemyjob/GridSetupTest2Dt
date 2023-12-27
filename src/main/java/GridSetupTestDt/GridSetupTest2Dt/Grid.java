package GridSetupTestDt.GridSetupTest2Dt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {

	
	
	static Capabilities chromeCapabilities = DesiredCapabilities.chrome();
	
	
	public static void main(String[] args) throws MalformedURLException {
		RemoteWebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);

	    // run against chrome
	    chrome.get("https://www.google.com");
	    System.out.println(chrome.getTitle());

	    
	    chrome.quit();
		


	}

}
