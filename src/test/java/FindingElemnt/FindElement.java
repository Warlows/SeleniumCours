package FindingElemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        //tagName[@attribute="attribute_value"]
        //button[@id='search_room_submit']
        //<button type="submit" class="btn btn-default button button-medium exclusive" name="search_room_submit"
        // id="search_room_submit" style="" xpath="1">
        //<span>Search Now</span>
        //</button>

        //CSS selectory
        //używająć id button#search_room_submit
        //używając klasy button.btn.btn-default.button.button-medium.exclusive
        //używając atrybutu button[name="search_room_submit"]

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        // Lokalizowanie elementów

        WebElement searchButtonById = driver.findElement(By.id("search_room_submit")); // lokalizacja elementu przez id
        WebElement searchButtonByName = driver.findElement(By.name("search_room_submit"));// lokalizacja elementu przez atrybut name
        WebElement searchButtonByClass = driver.findElement(By.className("exclusive"));// lokalizacja elementu przez klasę
        WebElement searchButtonByCssSelector = driver.findElement(By.cssSelector("[type=\"submit\"]"));// lokalizacja elementu przez css selector
        WebElement searchButtonByXpath = driver.findElement(By.xpath("//button[@type=\"submit\"]"));// lokalizacja elementu przez xpath
        WebElement searchButtonByTagName = driver.findElement(By.tagName("button")); // lokalizacja elementu przez nazwę znacznika

        WebElement signInLink = driver.findElement(By.linkText("Sign in")); // lokalizacja linku przez tekst zawarty w linku
        WebElement signInLinkByPartialLinkText = driver.findElement(By.partialLinkText("Sign"));// lokalizacja linku przez część tekstu zawarty w linku

        // Lokalizacja listy elementów
        List<WebElement> buttons = driver.findElements(By.tagName("button")); // znajdzie wszystkie buttony na stronie
    }
}
