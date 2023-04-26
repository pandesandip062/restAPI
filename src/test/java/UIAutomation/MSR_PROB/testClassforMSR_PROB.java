package UIAutomation.MSR_PROB;

import UIAutomation.CommonFolder.AccssPOM;
import UIAutomation.CommonFolder.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class testClassforMSR_PROB {
    WebDriver driver;
    public AccssPOM ap;
    public Utility ut;
     public MSR_PROB_methdos mt;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\sandip_pande\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://intleaguedatatemp.sandbox.mambu.com/#dashboard");
        driver.manage().window().maximize();

    }
    @AfterTest
    public void TearDown(){
        driver.close();
    }

    @Test
    public void ViewClient_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new MSR_PROB_methdos(driver);
        mt.viewClient();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();
    }

    @Test(priority = 0)
    public void viewTask_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new MSR_PROB_methdos(driver);
        mt.viewTask();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 2)
    public void createTask_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new MSR_PROB_methdos(driver);
        mt.CreateTask();
        mt.Logout();
    }

    @Test(priority = 10)
    public void viewGroupDetails_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR_PROB_methdos(driver);
        mt.viewGroupDetails();
        ut = new Utility(driver);
        Thread.sleep(4000);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 15)
    public void historicalReport_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR_PROB_methdos(driver);
        mt.historicalReport();
        mt.Logout();
    }
    @Test(priority = 16)
    public void viewlReport_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR_PROB_methdos(driver);
        mt.viewReport();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();
    }


    }


