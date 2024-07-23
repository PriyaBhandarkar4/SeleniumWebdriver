package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		System.out.println("Testing......");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		String page_title = driver.getTitle();
		
		if(page_title.equals("Demo"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();
	}
	

}
