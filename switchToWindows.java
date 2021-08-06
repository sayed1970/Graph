package JavaPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newWindowBtn")).click();
		driver.getTitle();
		//System.out.println(driver.getTitle());
		Set<String> s=driver.getWindowHandles();
		for(String i:s) {
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			if(t.contains("Basic Controls - H Y R Tutorialse"))
			{
				driver.close();
			}
			
		}
		
	}

}
