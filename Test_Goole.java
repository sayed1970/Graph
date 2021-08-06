package JavaPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Goole {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> element1 = driver.findElements(By.xpath("//*[@id='gb']"));
		for(WebElement ele2 :element1) {
			String AllEle = ele2.getText();
			System.out.println(AllEle);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='hpctaplay']"));
			System.out.println(driver.findElement(By.xpath("//div[@id='hpctaplay']")));
			driver.close();
		}
		

	}
	
	

	}


