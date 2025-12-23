package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Amazon {

    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void addToCart() throws Exception {

        // 1️⃣ Search product
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();

        Thread.sleep(3000); // let page load

        // 2️⃣ Click first product (LATEST 2025 SELECTOR)
        List<WebElement> products = driver.findElements(
                By.cssSelector("h2.a-size-mini.a-spacing-none.a-color-base.s-line-clamp-2 a")
        );

        System.out.println("Products found = " + products.size());

        if (products.size() == 0) {
            System.out.println("❌ ERROR: No products found. Amazon layout changed or page not loaded.");
            return;
        }

        // Click the first product
        products.get(0).click();
        System.out.println("Clicked first product");

        // 3️⃣ Switch to new tab (Amazon opens product in new tab)
        String oldTab = driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();

        for (String t : tabs) {
            if (!t.equals(oldTab)) {
                driver.switchTo().window(t);
                break;
            }
        }

        Thread.sleep(2000);

        // 4️⃣ Click Add to Cart
        WebElement addBtn = driver.findElement(By.id("add-to-cart-button"));
        addBtn.click();
        System.out.println("Clicked Add to Cart");

        Thread.sleep(3000);

        // 5️⃣ Open Cart Page
        driver.findElement(By.id("nav-cart-count")).click();
        System.out.println("Opened Cart");

        Thread.sleep(3000);
    }
}
