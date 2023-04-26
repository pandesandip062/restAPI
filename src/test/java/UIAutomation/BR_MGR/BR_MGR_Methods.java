package UIAutomation.BR_MGR;

import UIAutomation.CommonFolder.AccssPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BR_MGR_Methods {
    public AccssPOM ap;
    public WebDriver driver;

    public BR_MGR_Methods(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void  createUser() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        ap.selectBranch();
        ap.create();
        ap.userCreate();
    }

    public void  viewUser() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        ap.selectBranch();
        ap.viewUser();

    }
    public void  editUser() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        ap.selectBranch();
        ap.editUser();


    }
    public void  deleteUser() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        ap.selectBranch();
        ap.deleteUser();

    }
    public void viewClient() throws InterruptedException {
            ap = new AccssPOM(driver);
            ap.username("BRMGR_User");
            ap.pass("Mambu@1234");
            ap.login();
            ap.selectBranch();
            Thread.sleep(2000);
            ap.serchuser("dele");
            Thread.sleep(2000);
            ap.Selectuser();


        }

    public void Logout() throws InterruptedException {
        ap.Logout();
        Thread.sleep(8000);
    }

    public void editClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        ap.selectBranch();
        Thread.sleep(4000);
        ap.serchuser("dele");
        Thread.sleep(2000);
        ap.Selectuser();
        ap.editClientCTA();
        ap.editClientCTA();
        ap.editClient();


    }

    public void viewTask() throws InterruptedException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(2000);
        ap.selectBranch();
        Thread.sleep(4000);
        ap.serchuser("dele");
        Thread.sleep(2000);
        ap.Selectuser();
        ap.viewTask();
    }
    public void editTask() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        ap.viewTask();
        Thread.sleep(5000);
        ap.editTask();
    }
    public void CreateTask() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.viewTask();
        Thread.sleep(5000);
        ap.createTask();

    }
    public void deleteClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.More();
        ap.deleteClient();
        ap.cancelCTA();
    }
    public void approveClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.More();
        ap.ApproveCTA();
        ap.unapproveclient();
    }
    public void rejectClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.More();
        ap.RejectCTA();
        ap.cancelCTA();
    }
    public void blacklistClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.More();
        ap.BlacklistCTA();
        ap.cancelCTA();
    }
    public void exitClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.More();
        ap.ExitCTA();
        ap.cancelCTA();
    }
    public void undoStateClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.More();
        ap.UndoClientStateCTA();
        ap.unapproveclient();
    }
    public void ClientState() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        Thread.sleep(5000);
        ap.editClient();
        ap.ClientStateCTA();
    }
    public void viewGroupDetails() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchgrp("dele");
        Thread.sleep(5000);
        ap.SelectGroup();
    }
    public void editGroupDetails() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchgrp("dele");
        Thread.sleep(5000);
        ap.SelectGroup();
        ap.editClient();
    }
    public void deleteGroupDetails() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchgrp("dele");
        Thread.sleep(5000);
        ap.SelectGroup();
        ap.More();
        ap.deleteClient();
        ap.cancelCTA();

    }
    public void createGroupDetails() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.create();
        Thread.sleep(5000);
        ap.createGroup();
       // Thread.sleep(5000);
//        ap.groupName();
//        Thread.sleep(5000);
//        ap.addressType();
//        Thread.sleep(5000);
//        ap.Line1Addres();
//        Thread.sleep(5000);
//        ap.selectCountry();
//        Thread.sleep(5000);
//        ap.primaryAddress();
//        Thread.sleep(5000);
//        ap.setSaveUSer();

    }

    public void CreateReport() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.ReprotingCTA();
        ap.IndicatorCTA();
        ap.newReport();
    }
    public void editReport() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.ReprotingCTA();
        Thread.sleep(2000);
        ap.IndicatorCTA();
        ap.editReport();

    }
    public void historicalReport() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.ReprotingCTA();
        Thread.sleep(2000);
        ap.IndicatorCTA();
        Thread.sleep(2000);
        ap.portfolio();
        Thread.sleep(2000);
        ap.formDate();
        Thread.sleep(2000);
        ap.toDate();
        ap.genearateReport();
    }
    public void deleteReport() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.ReprotingCTA();
        Thread.sleep(2000);
        ap.IndicatorCTA();
        Thread.sleep(2000);
        ap.deleteReport();
    }
    public void viewReport() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("BRMGR_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.ReprotingCTA();
        Thread.sleep(2000);
        ap.IndicatorCTA();
        ap.ViewReport();
    }

    }

