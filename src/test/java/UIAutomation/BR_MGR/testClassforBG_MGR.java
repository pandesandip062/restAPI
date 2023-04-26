package UIAutomation.BR_MGR;

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

public class testClassforBG_MGR {
    WebDriver driver;
    public AccssPOM ap;
    public Utility ut;
    public BR_MGR_Methods mt;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\sandip_pande\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://int2leaguedata.sandbox.mambu.com/#dashboard");
        driver.manage().window().maximize();

    }
    @AfterTest
    public void TearDown(){
        driver.close();
    }
    @Test
    public void CreaetUser_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.createUser();
        mt.Logout();

    }
    @Test
    public void editUser_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.editUser();
        mt.Logout();

    }
    @Test
    public void deleteUser_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.deleteUser();
        mt.Logout();

    }
    @Test
    public void viewUser_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.viewUser();
        mt.Logout();

    }
    @Test
    public void ViewClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        ut= new Utility(driver);
        mt.viewClient();
        Thread.sleep(4000);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test
    public void EditClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.editClient();
    }
    @Test(priority = 0)
    public void viewTask_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        ut = new Utility(driver);
        mt.viewTask();
        Thread.sleep(4000);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test(priority = 15)
    public void editTask_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.editTask();
        mt.Logout();
    }
    @Test(priority = 2)
    public void createTask_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.CreateTask();
        mt.Logout();
    }
    @Test(priority = 8)
    public void deleteClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.deleteClient();
        mt.Logout();
    }
    @Test(priority = 3)
    public void undoStateClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.undoStateClient();
        mt.Logout();
    }

    @Test(priority = 4)
    public void rejectClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.rejectClient();
        mt.Logout();
    }
    @Test(priority = 6)
    public void blacklistClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.blacklistClient();
        mt.Logout();
    }
    @Test(priority = 7)
    public void exitClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.exitClient();
        mt.Logout();
    }

    @Test(priority = 5)
    public void approveClient_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.approveClient();
        mt.Logout();
    }
    @Test(priority = 9)
    public void ClientState_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.ClientState();
        mt.Logout();
    }
    @Test(priority = 10)
    public void viewGroupDetails_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.viewGroupDetails();
        ut = new Utility(driver);
        Thread.sleep(4000);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test(priority = 11)
    public void editGroupDetails_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.editGroupDetails();
        mt.Logout();
    }
    @Test(priority = 12)
    public void deleteGroupDetails_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.deleteGroupDetails();
        mt.Logout();
    }
    @Test(priority = 13)
    public void createGroupDetails_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.createGroupDetails();
        mt.Logout();
    }
    @Test(priority = 14)
    public void CreateReport_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.CreateReport();
        mt.Logout();
    }
    @Test(priority = 15)
    public void editReport_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.editReport();
        mt.Logout();
    }
    @Test(priority = 16)
    public void historicalReport_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.historicalReport();
        mt.Logout();
    }
    @Test(priority = 18)
    public void deleteReport_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.deleteReport();
        mt.Logout();
    }
    @Test(priority = 17)
    public void viewReport_Br_MGR() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new BR_MGR_Methods(driver);
        mt.viewReport();
        ut = new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }



    }


