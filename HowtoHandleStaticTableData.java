package tableHandling;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowtoHandleStaticTableData {
	WebDriver driver;
	
	@BeforeTest
	public void SetUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\All Driver\\chromedriver.exe" );
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/WebSite/table1.html");
		Thread.sleep(3000);
	}
	@Test
	public void getAllDataFromTable() {
		List<WebElement>element=driver.findElements(By.xpath("html/body/table/tbody/tr/td"));
		int totalElement=element.size();
		System.out.println("Total data is : " +totalElement);
		for(int i=0; i<totalElement; i++) {
			System.out.println(element.get(i).getText());
		}
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
