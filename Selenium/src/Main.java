import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
class Main {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("ram");
        driver.findElement(By.id("lastName")).sendKeys("reddy");

    }
}