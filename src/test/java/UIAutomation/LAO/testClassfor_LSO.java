package UIAutomation.LAO;

import UIAutomation.BR_MGR.BR_MGR_Methods;
import UIAutomation.CommonFolder.AccssPOM;
import UIAutomation.CommonFolder.Utility;
import UIAutomation.FSO.FSO_methdos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class testClassfor_LSO {
    WebDriver driver;
    public AccssPOM ap;
    public Utility ut;
     public LSO_methdos mt;

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
    public void ViewClient_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.viewClient();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test(priority = 0)
    public void viewTask_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.viewTask();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 15)
    public void editTask_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.editTask();
        //mt.Logout();
    }
    @Test(priority = 2)
    public void createTask_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.CreateTask();
        mt.Logout();
    }
    @Test(priority = 8)
    public void deleteClient_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.deleteClient();
        mt.Logout();
    }
    @Test(priority = 3)
    public void undoStateClient_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.undoStateClient();
        mt.Logout();
    }

    @Test(priority = 4)
    public void rejectClient_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.rejectClient();
        mt.Logout();
    }
    @Test(priority = 6)
    public void blacklistClient_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.blacklistClient();
        mt.Logout();
    }
    @Test(priority = 7)
    public void exitClient_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.exitClient();
        mt.Logout();
    }

    @Test(priority = 5)
    public void approveClient_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new LSO_methdos(driver);
        mt.approveClient();
        mt.Logout();
    }
    @Test(priority = 9)
    public void ClientState_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.ClientState();
        mt.Logout();
    }
    @Test(priority = 10)
    public void viewGroupDetails_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.viewGroupDetails();
        Thread.sleep(4000);
        ut=new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 11)
    public void editGroupDetails_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.editGroupDetails();
        mt.Logout();
    }
    @Test(priority = 12)
    public void deleteGroupDetails_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.deleteGroupDetails();
        mt.Logout();
    }
    @Test(priority = 13)
    public void createGroupDetails_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.createGroupDetails();
        mt.Logout();
    }
    @Test(priority = 15)
    public void historicalReport_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.historicalReport();
        mt.Logout();
    }
    @Test(priority = 14)
    public void createReport_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.CreateReport();
        mt.Logout();
    }
    @Test(priority = 16)
    public void viewReport_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.viewReport();
        mt.Logout();
    }
    @Test(priority = 18)
    public void deleteReport_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.deleteReport();
        mt.Logout();
    }
    @Test(priority = 17)
    public void editReport_LSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new LSO_methdos(driver);
        mt.editReport();
        mt.Logout();
    }

    }


