package JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class registrationDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sayed");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Siddeque");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("4614 N Jupiter RD Apt-821, Garland TX-75044");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sayedsiddeque@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("888-888-9999");
		System.out.println(driver.findElement(By.xpath("//input[@type='radio']")).isSelected());
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		WebElement s= driver.findElement(By.id("Skills"));
		Select t = new Select(s);
		t.selectByVisibleText("APIs");
		WebElement country =driver.findElement(By.id("countries"));
		Select v= new Select(country);
		v.selectByVisibleText("Bangladesh");
		 
		

	}

}
