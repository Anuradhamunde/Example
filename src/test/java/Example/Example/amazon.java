package Example.Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	@Test
	public void table() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	Thread.sleep(5000);
		List<WebElement> course=	driver.findElements(By.xpath("(//div[@class=\"navFooterLinkCol navAccessibility\"])[2]/ul/li"));
		for(  int i=0;i<course.size();i++) {
			System.out.println(course.get(i).getText()) ;
		}
}

}
