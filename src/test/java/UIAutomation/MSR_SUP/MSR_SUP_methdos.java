package UIAutomation.MSR_SUP;

import UIAutomation.CommonFolder.AccssPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MSR_SUP_methdos {
    public AccssPOM ap;
    public WebDriver driver;

    public MSR_SUP_methdos(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void  createUser() throws InterruptedException {
        ap = new AccssPOM(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ap.username("LAO_User");
        ap.pass("Mambu@1234");
        ap.login();
        ap.selectBranch();
        ap.create();
        //ap.userCreate();
        Thread.sleep(2000);
       // ap.confirmCTA();
    }
    public void viewClient() throws InterruptedException, IOException {
            ap = new AccssPOM(driver);
            ap.username("LAO_User");
            ap.pass("Mambu@1234");
            ap.login();
            Thread.sleep(3000);
            ap.selectBranch();
            Thread.sleep(4000);
            ap.serchuser("dele");
            Thread.sleep(2000);
            ap.Selectuser();


        }
    public void editClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
        ap.pass("Mambu@1234");
        ap.login();
        ap.selectBranch();
        ap.serchuser("Sand");
        Thread.sleep(5000);
        ap.Selectuser();
        ap.editClient();
    }

    public void viewTask() throws InterruptedException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
        ap.pass("Mambu@1234");
        ap.login();
        Thread.sleep(5000);
        ap.selectBranch();
        Thread.sleep(5000);
        ap.serchuser("dele");
        Thread.sleep(5000);
        ap.Selectuser();
        ap.viewTask();
    }
    public void editTask() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
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
        Thread.sleep(4000);
    }
    public void CreateTask() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        Thread.sleep(9000);
        ap.cancelCTA();
        Thread.sleep(4000);
    }
    public void approveClient() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        ap.username("MSRSUP_User");
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
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        Thread.sleep(4000);

    }
    public void createGroupDetails() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        ap.username("LAO_User");
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
        Thread.sleep(2000);
        ap.genearateReport();
        Thread.sleep(8000);

       // Thread.sleep(8000);
    }
    public void viewReport() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
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
    public void deleteReport() throws InterruptedException, IOException {
        ap = new AccssPOM(driver);
        ap.username("LAO_User");
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
        ap.confirmCTA();
    }

    public void Logout() throws InterruptedException {
        ap.Logout();
        Thread.sleep(8000);
    }


    }

