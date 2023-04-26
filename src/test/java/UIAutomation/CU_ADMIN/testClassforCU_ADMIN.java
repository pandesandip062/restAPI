package UIAutomation.CU_ADMIN;

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

public class testClassforCU_ADMIN {
    WebDriver driver;
    public AccssPOM ap;
    public Utility ut;
    public CU_ADMIN_Methods mt;

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
    public void CreaetUser_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.createUser();
        mt.Logout();

    }
    @Test
    public void editUser_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.editUser();
        mt.Logout();

    }
    @Test
    public void deleteUser_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.deleteUser();
        mt.Logout();

    }
    @Test
    public void viewUser_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.viewUser();
        mt.Logout();

    }
    @Test
    public void viewRoles_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.viewRoles();
        ut= new Utility(driver);
        ut.takesacreenshot();
        mt.Logout();

    }
    @Test
    public void editRoles_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.editRoles();
        mt.Logout();

    }
    @Test
    public void createRoles_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.createRoles();
        mt.Logout();

    }
    @Test
    public void deleteRoles_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.deleteRoles();
        mt.Logout();

    }
    @Test
    public void ViewClient_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        ut= new Utility(driver);
        mt.viewClient();
        Thread.sleep(4000);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test
    public void EditClient_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.editClient();
        mt.Logout();
    }
    @Test
    public void clientAssociation_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.clientAssociation();
        mt.Logout();
    }

    @Test(priority = 10)
    public void viewGroupDetails_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.viewGroupDetails();
        ut = new Utility(driver);
        Thread.sleep(4000);
        ut.takesacreenshot();
        mt.Logout();
    }
    @Test(priority = 11)
    public void editGroupDetails_CU_ADMIN() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mt = new CU_ADMIN_Methods(driver);
        mt.editGroupDetails();
        mt.Logout();
    }



    }


