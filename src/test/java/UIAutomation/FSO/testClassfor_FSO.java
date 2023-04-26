package UIAutomation.FSO;

import UIAutomation.BR_MGR.BR_MGR_Methods;
import UIAutomation.CommonFolder.AccssPOM;
import UIAutomation.CommonFolder.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class testClassfor_FSO {
    WebDriver driver;
    public AccssPOM ap;
    public Utility ut;
     public FSO_methdos mt;

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
    public void ViewClient_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.viewClient();
        ut  = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test(priority = 0)
    public void viewTask_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.viewTask();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 15)
    public void editTask_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.editTask();
        mt.Logout();
    }
    @Test(priority = 2)
    public void createTask_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.CreateTask();
        mt.Logout();
    }
    @Test(priority = 8)
    public void deleteClient_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.deleteClient();
        mt.Logout();
    }
    @Test(priority = 3)
    public void undoStateClient_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.undoStateClient();
        mt.Logout();
    }

    @Test(priority = 4)
    public void rejectClient_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.rejectClient();
        mt.Logout();
    }
    @Test(priority = 6)
    public void blacklistClient_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        ut = new Utility(driver);
        mt.Logout();
    }
    @Test(priority = 7)
    public void exitClient_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.exitClient();
        mt.Logout();
    }

    @Test(priority = 5)
    public void approveClient_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt= new FSO_methdos(driver);
        mt.approveClient();
        mt.Logout();
    }
    @Test(priority = 9)
    public void ClientState_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new FSO_methdos(driver);
        mt.ClientState();
        mt.Logout();
    }
    @Test(priority = 10)
    public void viewGroupDetails_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new FSO_methdos(driver);
        mt.viewGroupDetails();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test(priority = 11)
    public void editGroupDetails_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new FSO_methdos(driver);
        mt.editGroupDetails();
        mt.Logout();
    }
    @Test(priority = 12)
    public void deleteGroupDetails_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new FSO_methdos(driver);
        mt.deleteGroupDetails();
        mt.Logout();
    }
    @Test(priority = 13)
    public void createGroupDetails_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new FSO_methdos(driver);
        mt.createGroupDetails();
        mt.Logout();
    }
    @Test(priority = 16)
    public void historicalReport_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new FSO_methdos(driver);
        mt.historicalReport();
        mt.Logout();
    }
    @Test(priority = 17)
    public void viewlReport_FSO() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new FSO_methdos(driver);
        mt.viewReport();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();
    }

    }


