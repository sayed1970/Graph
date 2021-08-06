package JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.sugarcrm.com/request-demo/");
		
		WebElement s =driver.findElement(By.xpath("//*[@id=\"field27\"]/div/select"));
		
		Select t = new Select(s);
		t.selectByIndex(10);
		Thread.sleep(2000);
		t.selectByValue("level1");
		Thread.sleep(2000);
		t.selectByVisibleText("1,001 - 2,500 employees");
		System.out.println(t.getOptions().size());
	}

}
