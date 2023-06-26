package UIAutomation.BR_MGR;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class uploadfile {

    @Test
    public void setup() {
        String MemberId = "011442304";


            String expectedTitles[] = {"011400318","011442304"};
            List<String> expectedTitlesList = Arrays.asList(expectedTitles);
            assertTrue(expectedTitlesList.contains((MemberId)));






        }



    }
