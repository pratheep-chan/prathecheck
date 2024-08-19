package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Check {
	
	@Test
	public void visiting() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.mycontactform.com");
		
	
}
	@Test
	public void max() 
	{
		ChromeDriver ob = new ChromeDriver();
		ob.manage().window().maximize();
	}
}
