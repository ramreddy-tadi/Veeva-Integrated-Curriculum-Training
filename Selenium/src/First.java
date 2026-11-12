import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.cssSelector("input[id*='user']")).sendKeys("student");


		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("student");
	//	WebElement usernameEle = driver.findElement(By.id("username"));
	//	usernameEle.sendKeys("student");

		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("student");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password123");
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		driver.findElement(By.cssSelector("button.btn")).click();
		driver.findElement(By.cssSelector("input#username")).sendKeys("student");
		driver.findElement(By.partialLinkText("CO")).click();

		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.className("btn")).click();


    }
}
