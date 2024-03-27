package extentreport;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.Table.Cell;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
// public class AppTest 
// {
   //  FileInputStream fi;
   //  Workbook wb;
   //  Sheet sh;
   //  @Test
   //  public void shouldAnswerWithTrue()throws Exception
   //  {
   //      File f=new File("C:\\Users\\kruth\\OneDrive\\Documents\\extentreportsxls.xls");
   //       fi=new FileInputStream(f);
   //       wb=new HSSFWorkbook(fi);
   //       sh=wb.getSheet("Sheet1");
   //      int rowcnt=sh.getLastRowNum()-sh.getFirstRowNum()+1;
   //      //writing(false);
   //      WebDriverManager.chromedriver().setup();
   //      WebDriver dri=new ChromeDriver();
   //      dri.get("https://placement.skcet.ac.in/login");
   //      Thread.sleep(3000);
   //      for(int i=1;i<rowcnt;i++)
   //      {
   //       Row r=sh.getRow(i);
   //       for(int j=0;j<r.getLastCellNum();j+=2)
   //       {
   //       String user=r.getCell(j).getStringCellValue();
   //       System.out.println(user);
   //       String pass=r.getCell(j+1).getStringCellValue();
   //       System.out.println(pass);
   //       dri.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user);
   //       Thread.sleep(8000);
   //       dri.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div[1]/app-button/button")).click();
   //       Thread.sleep(8000);
   //       dri.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pass);
   //       Thread.sleep(8000);
   //       dri.findElement(By.xpath("//*[@id=\"formFieldsID\"]/div[3]/div/div/div/app-button/button")).click();
   //       Thread.sleep(10000);
   //       String cuurl=dri.getCurrentUrl();
   //       if(cuurl.equals("https://placement.skcet.ac.in/dashboard"))
   //       {
   //          writing(false);
   //       }
   //       else
   //       {
   //          dri.navigate().refresh();
   //       }
   //      }

   //  }
        
   //  }
   //  public void writing(boolean str)throws Exception
   //  {
   //       File ff=new File("C:\\Users\\kruth\\OneDrive\\Documents\\extentreportsxls.xls");
   //       FileInputStream fii=new FileInputStream(ff);
   //       Workbook wbb=new HSSFWorkbook(fii);
   //       Sheet she=wb.getSheet("Sheet1");   
   //       Row ro=she.getRow(0);
   //       if(str==false)
   //       {
   //          HSSFCell cel=(HSSFCell)ro.createCell(2);
   //          cel.setCellValue("Status");
   //      }
   //     try(FileOutputStream fo=new FileOutputStream("C:\\Users\\kruth\\OneDrive\\Documents\\extentreportsxls.xls"))
   //     {
   //      wbb.write(fo);
   //     }
   //     catch(IOException ee)
   //     {
   //      ee.printStackTrace();
   //     }
   //  }

// }
public class AppTest
{
   static ExtentReports re;
   static ExtentTest te;
   @BeforeClass
   public static void strt()
   {
       re=new ExtentReports("AppTest.html");
       te=re.startTest("Test2");
   }
   @Test
   public void Testcase2()
   {
       WebDriverManager.chromedriver().setup();
       WebDriver dri=new ChromeDriver();
       dri.get("https://www.google.com");
       if(dri.getTitle().equals("Google"))
       {
        te.log(LogStatus.PASS,"Passed");
       }
       else
       te.log(LogStatus.ERROR,"Failed");
       re.endTest(te);
       re.flush();
       dri.close();
   }
   
}
