package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {

WebDriver driver;
    @Before
    public  void initializeTest() {
        String getOsNameFromSystem = System.getProperty("os.name");
        System.out.println("Opening the browser : Chrome");
        if(getOsNameFromSystem.contains("Mac")){
            System.setProperty("webdriver.chrome.driver", "/Users/Paru/Desktop/BDD/AlibabaCucumber/AlibabaBDD/driver/chromedriver");
        }else if(getOsNameFromSystem.contains("Windows")){
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        }
        driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); //35
        driver.get("https://www.alibaba.com/");
        // driver.manage().window().maximize();
    }
    @After
    public void tearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : Chrome");
        driver.quit();
    }

}
