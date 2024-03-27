package test;


import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testframework1
{
    @Test
    public void shouldAnswerWithTrue()throws Exception
    {
        File f=new File("C:\\Users\\PRIYA\\Documents\\CC@TEST.xls");
        FileInputStream i=new FileInputStream(f);
        Workbook wb=new HSSFWorkbook(i);
        Sheet s=wb.getSheet("Sheet1");   
            Row r=s.getRow(0);
            String uname=r.getCell(0).getStringCellValue();
            String pass=r.getCell(1).getStringCellValue();
            WebDriverManager.chromedriver().setup();
            WebDriver w=new ChromeDriver();
            w.get("http://dbankdemo.com/bank/login/");
            Thread.sleep(5000);
            w.manage().window().maximize();
            w.findElement(By.id("username")).sendKeys(uname);
            w.findElement(By.id("password")).sendKeys(pass);
            Thread.sleep(2000);
            w.findElement(By.xpath("//*[@id=\"submit\"]")).click();
              WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("http://dbankdemo.com/bank/home"));
            System.out.println(w.getCurrentUrl());
        wb.close();
    }
    @Test
    public void A()throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver w=new ChromeDriver();
        w.get("http://dbankdemo.com/bank/login/");
        Thread.sleep(5000);
        w.manage().window().maximize();
        w.findElement(By.id("username")).sendKeys("S@gmail.com");
        w.findElement(By.id("password")).sendKeys("P@ssword12");
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("http://dbankdemo.com/bank/home"));
        System.out.println(w.getCurrentUrl());
        w.findElement(By.id("deposit-menu-item")).click();
        Select s=new Select(w.findElement(By.id("selectedAccount")));
        s.selectByVisibleText("Individual Checking (Standard Checking)");
        w.findElement(By.id("amount")).sendKeys("5000");
        w.findElement(By.id("submit")).click();
        JavascriptExecutor j=(JavascriptExecutor)w;
        j.executeScript("window.scrollBy(0,250)","");
    }
    @Test
    public void B()throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver w=new ChromeDriver();
        w.navigate().to("http://dbankdemo.com/bank/login/");
        Thread.sleep(5000);
        w.manage().window().maximize();
        w.findElement(By.id("username")).sendKeys("S@gmail.com");
        w.findElement(By.id("password")).sendKeys("P@ssword12");
        Thread.sleep(2000);
        w.findElement(By.xpath("//*[@id=\"submit\"]")).click();
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.urlContains("http://dbankdemo.com/bank/home"));
        System.out.println(w.getCurrentUrl());
        w.findElement(By.id("withdraw-menu-item")).click();
        Select s=new Select(w.findElement(By.id("selectedAccount")));
        s.selectByVisibleText("Individual Checking (Standard Checking account for Withdrawl)");
        w.findElement(By.id("amount")).sendKeys("3000");
        w.findElement(By.id("submit")).click();
        JavascriptExecutor j=(JavascriptExecutor)w;
        j.executeScript("window.scrollBy(0,250)","");
    }
}
