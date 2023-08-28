import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Gunes Gulay");

        WebElement eMail = driver.findElement(By.cssSelector(".mr-sm-2[placeholder=\"name@example.com\"]"));
        eMail.click();
        eMail.sendKeys("gunes@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector(".form-control[placeholder=\"Current Address\"]"));
        currentAddress.click();
        currentAddress.sendKeys("İstanbul,Türkiye");

        JavascriptExecutor jsx =(JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450)","");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
        permanentAddress.click();
        permanentAddress.sendKeys("İstanbul,Türkiye");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();


    }
}
