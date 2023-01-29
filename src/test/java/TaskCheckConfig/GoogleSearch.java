package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        //*System.setProperty("webdriver.gecko.driver",
               // "src/main/resources/drivers/geckodriver");

       // WebDriver driver = new FirefoxDriver(); ustawienia pod fire foxa

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe"); // ustawienie property systemowego


        WebDriver driver = new ChromeDriver(); // chrome wybranie drivera
        driver.manage().window().maximize(); //maksymalizujemy okno
        driver.get("http://www.google.com"); // nawigujemy do strony googla
        WebElement acceptCookiesButton = driver.findElement(By.id("L2AGLb")); // lokalizujemy element zakceptuj ccokies
        acceptCookiesButton.click();  // klikamy element
        WebElement element = driver.findElement(By.name("q")); //lokalizujemy elemen search bar
        element.clear(); // usuwamy tex z wyszukiwarki
        element.sendKeys("Coderslab"); // przesyłamy text dp searchBara
        element.submit(); //zatwierdzamy wyszukiwanie
        driver.quit();
    }
}
