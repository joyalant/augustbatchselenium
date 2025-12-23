package Seleniumpkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Santamonica {

    ChromeDriver driver;
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
    @Before
    public void begin() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://santamonicaedu.in/");
    }

    @Test
    public void assignmentTest() throws Exception {

        // 1. Verify //logo
        WebElement logo = driver.findElement(By.xpath("//*[@id='logo-img']"));
        if (logo.isDisplayed()) {
            System.out.println("Logo displayed");
        } else {
            System.out.println("Logo NOT displayed");
        }

        // 2. Check broken links
        List<WebElement> li = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links = " + li.size());

        for (WebElement element : li) {
            String link = element.getAttribute("href");
            if (link == null || link.isEmpty()) {
                System.out.println("Skipping empty href");
                continue;
            }
            verify(link);
        }

        // 3. Click "Find a Course"
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-item-1128\"]/a")));
      
        // 4. FORCE a new tab (required)
        //((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);

        // Switch to new tab
        String mainTab = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainTab)) {
                driver.switchTo().window(handle);
            }
        }

        // 5. Verify new tab title
        System.out.println("New tab title = " + driver.getTitle());

        // 6. Close new tab and switch back
        driver.close();
        driver.switchTo().window(mainTab);

        // 7. Hover "About Us" → Click "Our Profile"
        Actions act = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement aboutUsMenu = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));

        act.moveToElement(aboutUsMenu).pause(700).perform();

        WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(),'Our Profile')]")
        ));

        profile.click();

        // 8. Verify Profile Page Title
        System.out.println("Profile Page Title = " + driver.getTitle());
    }


    private void verify(String link) {
        try {
            URI ob = new URI(link);
            HttpURLConnection conn = (HttpURLConnection) ob.toURL().openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int code = conn.getResponseCode();

            if (code == 200) {
                System.out.println("200 OK → " + link);
            } else if (code == 404) {
                System.out.println("404 Broken → " + link);
            } else {
                System.out.println("Response (" + code + ") → " + link);
            }
        } catch (Exception e) {
            System.out.println("Error checking → " + link + " | " + e.getMessage());
        }
    }
}
