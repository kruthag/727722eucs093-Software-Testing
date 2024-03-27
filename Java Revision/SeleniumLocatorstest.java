package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws Exception
    {
        // WebDriverManager.edgedriver().setup();
        // WebDriver driver =new EdgeDriver();
        String FLIPKART_PATH = "https://iamneo.ai";
        // String gog="https://www.google.com";
        

        // driver.navigate().to(FLIPKART_PATH); 
        //driver.navigate().to(gog); 
    //   Thread.sleep(3000); //to make the window hold for 3 sec and refresh again
     //   driver.navigate().refresh();
        // driver.findElement(By.className("gLFyf")).sendKeys("apple");//it is to automatically open the windows with the search content available as apple (key can by found by using ctrl+shift+i);
        // driver.findElement(By.cssSelector("section#home-product-section")).click();
        //  driver.findElement(By.cssSelector("aside[class=\"gm-navigation-drawer gm-navigation-drawer--mobile gm-navigation-drawer--right\"]")).click();
        //     Thread.sleep(3000);
        // WebElement hamBurger=driver.findElement(By.xpath("//*[@id=\"gm-65f29f79a74a9\"]/div[1]/div/div[2]/div[2]/div/div"));
        // Thread.sleep(3000);
        // hamBurger.click();



        //driver.quit(); to automatically close the tab
        // driver.navigate().forward();
        // System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getTitle());
        //SELENIUM LOCATORS 
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("MacBook air")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Cart")).click();
        Thread.sleep(5000);
        String price=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[3]")).getText();
        System.out.println("price "+price);
        String title=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
        System.out.println("title "+title);

        Thread.sleep(5000);
        
        driver.close();
        // WebDriverManager.chromedriver().setup();
        // WebDriver dri=new ChromeDriver();
        // String str="https://placement.skcet.ac.in";
        // dri.manage().window().maximize();
        // dri.get(str);
        // Thread.sleep(7000);
        // dri.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("727722eucs093@skcet.ac.in");
        // dri.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div[1]/app-button/button")).click();
        // WebElement see=(new WebDriverWait(dri,Duration.ofSeconds(10))).until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
           
        // // Thread.sleep(5000);
        // // dri.findElement(By.className("cc-1rzf cc-yx2c")).click();
        // Thread.sleep(5000);
        // dri.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("appukittu");
        // boolean che=dri.findElement(By.className("p-checkbox-box")).isSelected();
        // System.out.println(che);
        // dri.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/app-form-builder/div/form/div[2]/app-field-builder/div/div/email/div/div/div/div/div[1]/p-checkbox/div/div[2]")).click();
        // Thread.sleep((10000));
        // che=dri.findElement(By.className("p-checkbox-box")).isSelected();
        // System.out.println(che);
        // if(!che)
        // {
        //     System.out.println("password is visible");
        // }
        // Thread.sleep(8000);
        // dri.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div/app-button/button")).click();
        // Thread.sleep(8000);
        // dri.close();
    

    }
}
