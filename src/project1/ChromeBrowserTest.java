package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into Browser
        driver.get(baseUrl);

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is" + title);

        // Get the Current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //Get Page Source
        System.out.println("Page source : " + driver.getPageSource());

        //Find the Email Field Element
        WebElement emailField = driver.findElement(By.id("Email"));

        //Type the email address to the email field element
        emailField.sendKeys("khushi123");


        //7. Enter the password to password field
        //Find the Password Field Element
        WebElement passwordField = driver.findElement(By.name("Password"));


        //Action is to Type the password .
        passwordField.sendKeys("Khushi221@");


        //Close The Browser
        driver.close();


    }
}
