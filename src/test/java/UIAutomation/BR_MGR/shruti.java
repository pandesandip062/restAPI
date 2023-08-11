package UIAutomation.BR_MGR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class shruti {

    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\sandip_pande\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://nlcu1.sandbox.mambu.com/#dashboard");
        driver.manage().window().maximize();

    }


    @Test
    public void acc() throws IOException, InterruptedException {
        BR_MGR_Methods br  = new BR_MGR_Methods(driver);
        br.Shruti();
    }
}
