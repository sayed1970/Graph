package JavaPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindowTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Windo :"+parent);
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> handle=driver.getWindowHandles();
		for(String handles:handle) {
			System.out.println(handles);
			if(!handles.equals(parent)) {
			driver.switchTo().window(handles);
			//driver.findElement(By.id("alertBox")).click();
			System.out.println(driver.getTitle());
			//Thread.sleep(5000);
			//driver.switchTo().alert().accept();
			driver.close();
			Thread.sleep(2000);
			
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent :"+driver.getTitle());
		//driver.close();

	}

}
}	
