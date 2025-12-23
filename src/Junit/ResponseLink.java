package Junit;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseLink {

    ChromeDriver driver;

    @Test
    public void linkCount() {
        driver = new ChromeDriver();
        driver.get("https://google.com");

        List<WebElement> li = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links=" + li.size());

        for (WebElement element : li) {
            String link = element.getAttribute("href");
            if (link == null || link.isEmpty()) {
                System.out.println("Skipping empty href");
                continue;
            }
            verify(link);
        }

        driver.quit();
    }

    private void verify(String link) {
        try {
            URI ob = new URI(link);
            HttpURLConnection con = (HttpURLConnection) ob.toURL().openConnection();
            con.setRequestMethod("GET");
            con.connect();

            int code = con.getResponseCode();

            if (code == 200) {
                System.out.println("Successful (200): " + link);
            } else if (code == 404) {
                System.out.println("Broken (404): " + link);
            } else {
                System.out.println("Other (" + code + "): " + link);
            }
        } catch (Exception e) {
            System.out.println("Error: " + link + " → " + e.getMessage());
        }
    }
}
