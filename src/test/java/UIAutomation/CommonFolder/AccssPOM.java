package UIAutomation.CommonFolder;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import javax.sound.sampled.Line;
import javax.swing.*;
import java.io.IOException;

public class AccssPOM {
    public WebDriver driver;
    public Utility ut;

    @FindBy(xpath = "//input[@id='gwt-debug-username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='gwt-debug-password']")
    WebElement Password;
    @FindBy(xpath = "//button[@id='gwt-debug-loginButton']")
    WebElement loginCTA;
    @FindBy(xpath = "//select[@id=\"gwt-debug-deckedListBox\"]")
    WebElement branch;
    @FindBy(xpath = "//div[@id=\"gwt-debug-branchHolder\"]")
    WebElement brancholder;
    @FindBy(xpath = "//input[@id='gwt-debug-searchInput']")
    WebElement serchCTA;

    @FindBy(xpath = "//td[@id='createEntity']")
    WebElement CreateCTA;
    @FindBy(xpath = "//td[@id='createUserMenu']")
    WebElement CreateUser;
    @FindBy(xpath = "//input[@id='gwt-debug-firstNames']")
    WebElement UserFN;
    @FindBy(xpath = "//input[@id='gwt-debug-lastName']")
    WebElement UserLN;
    @FindBy(xpath = "//select[@id='gwt-debug-roleListBox']")
    WebElement UserRole;
    @FindBy(xpath = "//input[@id='gwt-debug-userName']")
    WebElement UserUserName;
    @FindBy(xpath = "//input[@id='gwt-debug-password']")
    WebElement UserPassword;
    @FindBy(xpath = "//input[@id='gwt-debug-passwordConfirm']")
    WebElement UserConfirmPassword;
    @FindBy(xpath = "//button[@id='gwt-debug-saveButton']")
    WebElement UserSave;
    @FindBy(xpath = "//input[@id='gwt-debug-dialogIdentityPassword']")
    WebElement UserPW;
    @FindBy(xpath = "//input[@id='gwt-debug-searchInput']")
    WebElement Search;
    @FindBy(xpath = "(//div[text()='ACU_Representative 005'])")
    WebElement selectUser;
    @FindBy(xpath = "//span[text()='Sandip Balaji Pandeye']")
    WebElement User;
    @FindBy(xpath = "//td[text()='Edit']")
    WebElement EditUser;
    @FindBy(xpath = "//button[@id='gwt-debug-saveButton']")
    WebElement SaveUSer;
    @FindBy(xpath = "//td[@id='administrationTab']")
    WebElement administatorCTA;
    @FindBy(xpath = "//div[@id='tasksTab']")
    WebElement TaskCTA;
    @FindBy(xpath = "//button[text()='New Task']")
    WebElement CreateTask;
    @FindBy(xpath = "//input[@id='gwt-debug-title']")
    WebElement TaskName;
    @FindBy(xpath = "//button[@id='gwt-debug-confirmButton']")
    WebElement SaveTask;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    WebElement ActionCTA;
    @FindBy(xpath = "//td[@id='editItem']")
    WebElement EditTaskCTA;
    @FindBy(xpath = "//td[@id='moreMenuItem']")
    WebElement MoreCTA;
    @FindBy(xpath = "//td[@id='editMenuItem']")
    WebElement editClientCTA;
    @FindBy(xpath = "//td[@id='deleteMenuItem']")
    WebElement DeleteClientCTA;
    @FindBy(xpath = "//td[@id='approve_client_item']")
    WebElement ApproveCTA;
    @FindBy(xpath = "//td[@id='reject_client_item']")
    WebElement RejectCTA;
    @FindBy(xpath = "//td[@id='blacklistMenuItem']")
    WebElement BlacklistCTA;
    @FindBy(xpath = "//td[@id='exitMenuItem']")
    WebElement ExitCTA;
    @FindBy(xpath = "//td[@id='undoApproveMenuItem']")
    WebElement UndoClientStateCTA;
    @FindBy(xpath = "(//select[@id='gwt-debug-deckedListBox'])[1]")
    WebElement ClientStateCTA;
    @FindBy(xpath = "//div[text()='delete group']")
    WebElement selectGroup;
    @FindBy(xpath = "//td[@id='createGroupMenu-Joint Group']")
    WebElement createGroup;
    @FindBy(xpath = "//input[@id='gwt-debug-groupName']")
    WebElement GroupName;
    @FindBy(xpath = "(//input[@id='gwt-debug-value'])[5]")
    WebElement AddressType;
    @FindBy(xpath = " //td[@id='gwt-uid-11569']")
    WebElement MailingAddress;
    @FindBy(xpath = "(//input[@id='gwt-debug-valueTextBox'])[18]")
    WebElement Line1Address;
    @FindBy(xpath = "(//input[@id='gwt-debug-value'])[6]")
    WebElement Country;
    @FindBy(xpath = "//td[text()='Andorra - AD']")
    WebElement Countryselect;
    @FindBy(xpath = "(//input[@id='gwt-debug-value'])[7]")
    WebElement primaryAddress;
    @FindBy(xpath = "//td[@id='gwt-uid-11617']")
    WebElement primaryAddressyes;
    @FindBy(xpath = "(//img[@id='gwt-debug-lockIcon'])[1]")
    WebElement Logout;
    @FindBy(xpath = "//button[@id='gwt-debug-actionButton']")
    WebElement UndoapproveClient;
    @FindBy(xpath = "//button[@id='gwt-debug-cancelButton']")
    WebElement CancelCTA;
    @FindBy(xpath = "//div[@id='gwt-debug-reports']")
    WebElement reportCTA;
    @FindBy(xpath = "//input[@id='gwt-debug-reportName']")
    WebElement ReportName;
    @FindBy(xpath = "//td[text()='Reporting']")
    WebElement ReporingCTA;
    @FindBy(xpath = "//td[@id='branchIndicatorsItem']")
    WebElement IndicatorCTA;
    @FindBy(xpath = "//button[@id='gwt-debug-createButton']")
    WebElement CreateReportCTA;
    @FindBy(xpath = "(//div[@class='GA2AKXNBAX'])[1]")
    WebElement editReport;
    @FindBy(xpath = "//span[text()='Portfolio']")
    WebElement portfolio;
    @FindBy(xpath = "//input[@id='gwt-debug-fromDate']")
    WebElement formDate;
    @FindBy(xpath = " //input[@id='gwt-debug-toDate']")
    WebElement toDate;
    @FindBy(xpath = "//span[text()='Generate Report']")
    WebElement GenrateReport;
    @FindBy(xpath = "(//div[@class='GA2AKXNBAX'])[2]")
    WebElement deleteReport;
    @FindBy(xpath = "//div[@class='gwt-Anchor']")
    WebElement viewReport;
    @FindBy(xpath = " //button[@id='gwt-debug-confirmIdentityButton']")
    WebElement confirmIdentity;
    @FindBy(xpath = "//span[text()='Access']")
    WebElement access;
    @FindBy(xpath = " //a[text()='02212334']")
    WebElement userSelect;
    @FindBy(xpath = " (//div[@class='GA2AKXNBJ-'])[1]")
    WebElement Actions;
    @FindBy(xpath = "//td[@id='deleteItem']")
    WebElement deleteUserCTA;
    @FindBy(xpath = "//button[@id='gwt-debug-addRole']")
    WebElement addRoleCTA;
    @FindBy(xpath = "//input[@id='gwt-debug-name']")
    WebElement RoleName;
    @FindBy(xpath = "(//button[@id='gwt-debug-cancelButton'])[2]")
    WebElement cancelCTAforConfrimIdentity;
    @FindBy(xpath = "//span[text()='Association']")
    WebElement clientAssociationCTA;
    @FindBy(xpath = "//a[text()='Users']")
    WebElement viewUserCTA;
    @FindBy(xpath = "//button[@id='gwt-debug-closeButton']")
    WebElement Close;
    @FindBy(xpath = "//button[@id='gwt-debug-saveAnywayButton']")
    WebElement SaveAnywayCTA;








    public AccssPOM(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
        ut= new Utility(driver);

    }

    public void close(){
        Close.click();
    }


    public void confirmIdentity(){
        confirmIdentity.click();
    }
    public void ViewReport() throws IOException, InterruptedException {
        viewReport.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void deleteReport() throws InterruptedException, IOException {
        deleteReport.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
        SaveTask.click();
    }

    public void genearateReport() throws IOException, InterruptedException {
        //Actions act1 = new Actions(driver);
        GenrateReport.click();
        GenrateReport.click();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(6000);
        ut.takesacreenshot();
    }
    public void toDate(){
        toDate.sendKeys("19-04-2023");
    }

    public void formDate(){
        formDate.sendKeys("04-04-2023");
    }

    public void portfolio(){
        portfolio.click();
    }
    public void editReport() throws IOException, InterruptedException {
        editReport.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
        ReportName.sendKeys("testing1");
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        SaveUSer.click();
    }
    public void Administartor(){
        administatorCTA.click();
    }
    public void ReprotingCTA(){
        ReporingCTA.click();
    }
    public void IndicatorCTA(){
        IndicatorCTA.click();
    }
    public void newReport() throws IOException, InterruptedException {
        CreateReportCTA.click();
        ReportName.sendKeys("testing");
        Thread.sleep(4000);
        ut.takesacreenshot();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        UserSave.click();
    }
    public void reportCTA(){
        reportCTA.click();
    }
    public void cancelCTA(){
        CancelCTA.click();
    }
    public void unapproveclient() throws IOException, InterruptedException {
        UndoapproveClient.click();

    }
    public void Logout(){
        Logout.click();
    }
    public void primaryAddress(){
        primaryAddress.click();
        primaryAddressyes.click();
    }
    public void selectCountry(){
        Country.click();
        Countryselect.click();
    }
    public void Line1Addres(){
        Line1Address.sendKeys("Pune");
    }
    public void addressType(){
        AddressType.click();
        MailingAddress.click();
    }
    public void groupName(){
        GroupName.click();
        GroupName.sendKeys("joint grp");
    }
    public void createGroup() throws IOException, InterruptedException {
        createGroup.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }

    public void More(){
        MoreCTA.click();
    }
    public void deleteClient() throws IOException, InterruptedException {
        DeleteClientCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void ApproveCTA() throws InterruptedException, IOException {
        ApproveCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void RejectCTA() throws IOException, InterruptedException {
        RejectCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void BlacklistCTA() throws IOException, InterruptedException {
        BlacklistCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void ExitCTA() throws IOException, InterruptedException {
        ExitCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void UndoClientStateCTA() throws IOException, InterruptedException {
        UndoClientStateCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void ClientStateCTA() throws IOException, InterruptedException {
        EditUser.click();
        Thread.sleep(4000);
        ClientStateCTA.click();
        Select s = new Select(ClientStateCTA);
        s.selectByVisibleText("Not to be use3");
        Thread.sleep(4000);
        ut.takesacreenshot();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        SaveUSer.click();
        Thread.sleep(2000);
    }

    public void viewTask(){
        TaskCTA.click();
    }
    public void createTask() throws InterruptedException, IOException {
        Thread.sleep(2000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        CreateTask.click();
        TaskName.sendKeys("new Task");
        Thread.sleep(2000);
        //JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(4000);
        ut.takesacreenshot();
        SaveTask.click();
    }
    public void confirmCTA(){
        SaveTask.click();
    }
    public void editTask() throws IOException, InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(ActionCTA).build().perform();
        ActionCTA.click();
        EditTaskCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
        SaveTask.click();
    }
    public void editClient() throws IOException, InterruptedException {
        editClientCTA.click();
       // branch.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        SaveUSer.click();
        //SaveAnywayCTA.click();


    }
    public void clientAssociation() throws InterruptedException, IOException {
        editClientCTA.click();
        Thread.sleep(2000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,15000)");
        clientAssociationCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
        //SaveTask.click();

    }
    public void editGroup() throws IOException, InterruptedException {
        EditUser.click();
        Thread.sleep(4000);
        GroupName.clear();
        GroupName.sendKeys("delete group");
        Thread.sleep(4000);
        ut.takesacreenshot();
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        SaveUSer.click();

    }
    public void viewRoles(){
        administatorCTA.click();
        access.click();
    }
    public void editRoles() throws IOException, InterruptedException {
        administatorCTA.click();
        access.click();
        ActionCTA.click();
        EditTaskCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();

    }
    public void deleteRoles() throws IOException, InterruptedException {
        administatorCTA.click();
        access.click();
        ActionCTA.click();
        deleteUserCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
        CancelCTA.click();

    }
    public void createRoles() throws InterruptedException, IOException {
        administatorCTA.click();
        access.click();
        Thread.sleep(2000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,15000)");
        Thread.sleep(4000);
        addRoleCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
        RoleName.sendKeys("delete");
        js.executeScript("window.scrollBy(0,5000)");
        SaveUSer.click();
        Thread.sleep(2000);
        cancelCTAforConfrimIdentity.click();


    }
    public void serchuser(String userName){
        Search.sendKeys(userName);
    }
    public void Selectuser(){
        selectUser.click();
    }
//    public void validateuser(){
//        String userName=User.getText();
//        //Assert.assertEquals("Sandip Balaji Pandeye",userName);
//    }
     public void serchgrp(String groupName){
    Search.sendKeys(groupName);
    }

    public void SelectGroup() throws IOException, InterruptedException {
        selectGroup.click();

    }
    public void username(String UN){
        username.sendKeys(UN);
    }
    public void pass(String PW){
        Password.sendKeys(PW);
    }
    public void login(){
        loginCTA.click();
    }
    public void selectBranch(){
        brancholder.click();
        Select s = new Select(branch);
        s.selectByVisibleText("All Branches");
    }
    public void create(){
        CreateCTA.click();
    }
    public void editUser() throws InterruptedException, IOException {
        administatorCTA.click();
        access.click();
        Thread.sleep(2000);
        Actions.click();
        Thread.sleep(2000);
        EditTaskCTA.click();
        Thread.sleep(4000);
        ut.takesacreenshot();



    }
    public void viewUser() throws InterruptedException, IOException {
        administatorCTA.click();
        access.click();
        Thread.sleep(2000);
        viewUserCTA.click();
        //userSelect.click();
        Thread.sleep(4000);
        ut.takesacreenshot();
    }
    public void deleteUser() throws InterruptedException, IOException {
        administatorCTA.click();
        access.click();
        Thread.sleep(2000);
        Actions.click();
        Thread.sleep(2000);
        deleteUserCTA.click();
        SaveTask.click();
        Thread.sleep(2000);
        UserPW.sendKeys("Mambu@1234");
        Thread.sleep(4000);
        ut.takesacreenshot();
        confirmIdentity.click();
    }

    public void userCreate() throws InterruptedException, IOException {
        CreateUser.click();
        Thread.sleep(2000);
        UserFN.click();
        Thread.sleep(2000);
        UserFN.sendKeys("Sandip");
        UserLN.click();
        Thread.sleep(2000);
        UserLN.sendKeys("Pande");
        Select s1 = new Select(UserRole);
        s1.selectByVisibleText("BR MGR (RBAC)");

        UserUserName.sendKeys("0201001");

        UserPassword.sendKeys("Spande061@");
        UserConfirmPassword.sendKeys("Spande061@");
        Thread.sleep(2000);
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
        UserSave.click();
        Thread.sleep(2000);
        //UserSave.click();
        UserPW.sendKeys("Mambu@1234");
        Thread.sleep(4000);
        ut.takesacreenshot();
        confirmIdentity.click();
    }

}
