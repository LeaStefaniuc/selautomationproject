/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 18478
 */
public class AddToCartTest {

    private WebDriver driver;
    private String baseUrl;

    public AddToCartTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAddToCart() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\\\data\\\\chromedriver.exe");
        driver = new ChromeDriver();
        //baseUrl = "https://www.google.com/";

        driver.get("https://www.costco.com/CatalogSearch?dept=All&keyword=dell+laptop");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@automation-id=\"productDescriptionLink_0\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@automation-id=\"addToCartButton\"]")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//div[@id='costcoModal']/div/div/div/button/span")).click();
        driver.findElement(By.xpath("//a[@id=\"cart-d\"]")).click();

    }
}