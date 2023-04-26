package UIAutomation.CommonFolder;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
    public WebDriver driver;

    public Utility(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void takesacreenshot() throws IOException {
        Date date = new Date();
        DateFormat d = new SimpleDateFormat("dd-m-yy&hh-mm-ss");
        String Newdate = d.format(date);

        TakesScreenshot s= (TakesScreenshot) driver;
        File source = s.getScreenshotAs(OutputType.FILE);
        File dest = new File(".//screenshots//"+Newdate+".jpg");
        FileHandler.copy(source,dest);
    }
}
