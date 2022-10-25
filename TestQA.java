package PokerStars_FTC;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestQA {


        WebDriver driver;
        private String URL = "https://testpages.herokuapp.com/styled/basic-html-form-test.html";

        @BeforeAll
        static void setupClass() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        void setupTest() {
            driver = new ChromeDriver();
        }

        @AfterEach
        void teardown() {
            driver.quit();
        }

        @Test
        void test() {
            //Navigate to site
            driver.get(URL);

            //Input of username and password
            driver.findElement(By.cssSelector("input[name=username]")).sendKeys("admin");
            driver.findElement(By.cssSelector("input[name=password]")).sendKeys("password");

            //Input of comments
            WebElement textareaComment = driver.findElement(By.cssSelector("textarea[name=comments]"));
            textareaComment.clear();
            textareaComment.sendKeys("comment");

            //Clicking on checkboxes and radio buttons
            driver.findElement(By.cssSelector("input[type=checkbox][value=cb1]")).click();
            driver.findElement(By.cssSelector("input[type=checkbox][value=cb2]")).click();
            driver.findElement(By.cssSelector("input[type=checkbox][value=cb3]")).click();

            driver.findElement(By.cssSelector("input[type=radio][value=rd3]")).click();

            //Selecting dropdown values
            WebElement dropdown = driver.findElement(By.cssSelector("select[name=dropdown]"));
            dropdown.click();
            dropdown.findElement(By.cssSelector("option[value=dd4]")).click();
        }

    }




