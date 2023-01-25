package com.Cydeo.test.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 extends CommonStepsFile{
    public static void main(String[] args) throws InterruptedException {
        //        TC #2: Title and Url check
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2. Go to https://www.facebook.com/
        driver.navigate().to("https://www.facebook.com/");
//        3. Verify url contains facebook
        String expectedURL = "facebook";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL test - PASSED");
        }else{
            System.out.println("URL test - FAILED");
        }
//        4. Verify title contains Facebook
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test - PASSED");
        }else{
            System.out.println("Title test - FAILED");
        }
//        5. Navigate to https://www.google.com/
        driver.navigate().to("https://www.google.com/");
//        6. Verify url contains google
        expectedURL = "google";
        actualURL = driver.getCurrentUrl();
        if (actualURL.contains(expectedURL)){
            System.out.println("URL test - PASSED");
        }else{
            System.out.println("URL test - FAILED");
        }
//        7. Verify title contains Google
        expectedTitle = "Google";
        actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test - PASSED");
        }else{
            System.out.println("Title test - FAILED");
        }
//        8. Navigate back
        driver.navigate().back();
//        9. Verify url contains facebook
        expectedURL = "facebook";
        actualURL = driver.getCurrentUrl();
        if (!actualURL.contains(expectedURL)){
            System.err.println("FAILED - Verify url contains facebook");
            driver.close();
            System.exit(-1);
        }
//        10.Navigate forward
        driver.navigate().forward();
//        11.Verify url contains google
        expectedURL = "google";
        actualURL = driver.getCurrentUrl();
        if (!actualURL.contains(expectedURL)){
            System.err.println("FAILED - Verify url contains google");
            driver.close();
            System.exit(-1);
        }

        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.close();

    }
}
