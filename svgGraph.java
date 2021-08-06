package JavaPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class svgGraph {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String Vxpath ="//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		String textxPath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		List<WebElement> gPath =driver.findElements(By.xpath(Vxpath));
		System.out.println(gPath.size());
		Actions act= new Actions(driver);
		for(WebElement e: gPath) {
			act.moveToElement(e).perform();
			Thread.sleep(500);
			String txt =driver.findElement(By.xpath(textxPath)).getText();
			System.out.println(txt);
			Thread.sleep(500);
			//driver.close();



		}

	}

}
