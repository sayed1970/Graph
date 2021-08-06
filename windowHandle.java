package JavaPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window :"+parent);
		driver.findElement(By.id("newWindowBtn")).click();
		Set <String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println(handle);
			if(!handle.equals(parent)) {
			driver.switchTo().window(handle);	
			driver.findElement(By.id("firstName")).sendKeys("Sayed");
			Thread.sleep(5000);
			driver.close();
			
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("Siddeque");	
		Thread.sleep(2000);
		//driver.quit();
	}

}
}