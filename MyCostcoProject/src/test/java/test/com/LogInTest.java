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
public class LogInTest {

    private WebDriver driver;
    private String baseUrl;

    public LogInTest() {
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
    public void testLogIn() throws Exception {

        System.setProperty("webdriver.chrome.driver", "c:\\\\data\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("https://www.costco.com");
        driver.findElement(By.id("header_sign_in")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.id("signInName")).sendKeys("liliana4.d.s@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Infotek123@");
        driver.findElement(By.xpath("//button[@id=\"next\"]")).click();
        Thread.sleep(10000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 300)");

        driver.findElement(By.xpath("//input[@id=\"shopAsNonMemberBtn\"]")).click();
        Thread.sleep(3000);
        driver.close();

    }

}