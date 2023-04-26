package UIAutomation.MSR;

import UIAutomation.CommonFolder.AccssPOM;
import UIAutomation.CommonFolder.Utility;
import UIAutomation.LAO.LSO_methdos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class testClassforMSR {
    WebDriver driver;
    public AccssPOM ap;
    public Utility ut;
     public MSR__methods mt;

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

    @Test(priority = 1)
    public void ViewClient_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new MSR__methods(driver);
        mt.viewClient();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test(priority = 4)
    public void viewTask_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new MSR__methods(driver);
        mt.viewTask();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 3)
    public void editTask_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new MSR__methods(driver);
        mt.editTask();
        mt.Logout();
    }
    @Test(priority = 2)
    public void createTask_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new MSR__methods(driver);
        mt.CreateTask();
        mt.Logout();
    }

    @Test(priority = 10)
    public void viewGroupDetails_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR__methods(driver);
        mt.viewGroupDetails();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 11)
    public void editGroupDetails_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR__methods(driver);
        mt.editGroupDetails();
        mt.Logout();
    }
    @Test(priority = 13)
    public void createGroupDetails_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR__methods(driver);
        mt.createGroupDetails();
        mt.Logout();
    }
    @Test(priority = 15)
    public void historicalReport_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR__methods(driver);
        mt.historicalReport();
        mt.Logout();
    }
    @Test(priority = 16)
    public void viewlReport_MSR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new MSR__methods(driver);
        mt.viewReport();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();
    }


    }


