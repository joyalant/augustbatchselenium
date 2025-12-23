package Seleniumpkg;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonjava {

    WebDriver driver;

    @Before
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts()
//              .implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rishiherbalindia.linker.store/health?sort_by=price-asc");
    }

    @Test
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
        WebElement element = driver.findElement(By.xpath("//*[@id='footer-link-list']/li[1]/a"));
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        element.click();
    }

   
}
