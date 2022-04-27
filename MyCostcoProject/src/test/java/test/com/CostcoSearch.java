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
public class CostcoSearch {

    private WebDriver driver;
    private String baseUrl;

    public CostcoSearch() {
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
    // @Test
    // public void hello() {}
    @Test
    public void testCostcoSearch() throws Exception {

        System.setProperty("webdriver.chrome.driver", "c:\\\\data\\\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";

// Search
        driver.get("https://www.costco.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("search-field")).click();
        driver.findElement(By.id("search-field")).clear();
        driver.findElement(By.id("search-field")).sendKeys("dell laptop");
        driver.findElement(By.id("formcatsearch")).submit();
        Thread.sleep(4000);
    }
//Add to cart

    @Test
    public void testAddToCart() throws Exception {
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 200)");
        driver.findElement(By.xpath("//a[@automation-id=\"productDescriptionLink_0\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@automation-id=\"addToCartButton\"]")).click();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//div[@id='costcoModal']/div/div/div/button/span")).click();

        //Go to cart        
        driver.findElement(By.xpath("//a[@id=\"cart-d\"]")).click();

        js.executeScript("window.scrollTo(0, 400)");
        driver.findElement(By.xpath("//input[@automation-id=\"shopCartCheckoutButton\"]")).click();
        Thread.sleep(8000);
    }
// Login   

    @Test
    public void testLogIn() throws Exception {
        driver.findElement(By.id("signInName")).sendKeys("liliana4.d.s@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Infotek123@");
        driver.findElement(By.xpath("//button[@id=\"next\"]")).click();
        Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 200)");

        driver.findElement(By.xpath("//input[@id=\"shopAsNonMemberBtn\"]")).click();
        Thread.sleep(3000);
        driver.close();

    }

}
