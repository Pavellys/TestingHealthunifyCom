import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestingTransitionToTab {
    String healthUnifyURL = "https://healthunify.com";
    String healthUnifyBmiURL = healthUnifyURL + "/bmicalculator/";

    String expectedHomeURL = healthUnifyURL;
    String expectedDietURL = healthUnifyURL + "/category/health-and-wellness/diet/";
    String expectedFitnessURL = healthUnifyURL + "category/health-and-wellness/fitness/";
    String expectedJuiceURL = healthUnifyURL + "category/health-and-wellness/juice/";
    String expectedBMICalculatorURL = healthUnifyBmiURL;
    String expectedQuizURL = healthUnifyURL + "quiz/";


    @Test
    public void testDiet(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(healthUnifyURL);
        // Click to tab of Diet
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/category/health-and-wellness/diet/']")).click();
        // Get actual result
        String actualResultDiet = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultDiet, expectedDietURL, "the values don't match");

        driver.close();
    }
    @Test
    public void testHome(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/bmicalculator/
        driver.get(healthUnifyBmiURL);
        // Click to tab of Home
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/']")).click();
        // Get actual result
        String actualResultHome = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultHome, expectedHomeURL, "the values don't match");

        driver.close();
    }
    @Test
    public void testFitness(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(healthUnifyURL);
        // Click to tab of Fitness
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/category/health-and-wellness/fitness/']")).click();
        // Get actual result
        String actualResultFitness = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultFitness, expectedFitnessURL, "the values don't match");

        driver.close();
    }
    @Test
    public void testJuice(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(healthUnifyURL);
        // Click to tab of Juice
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/category/health-and-wellness/juice/']")).click();
        // Get actual result
        String actualResultJuice = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultJuice, expectedJuiceURL, "the values don't match");

        driver.close();
    }
    @Test
    public void testBMICalculator(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(healthUnifyURL);
        // Click to tab of BMICalculator
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/bmicalculator/']")).click();
        // Get actual result
        String actualResultBMICalculator = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultBMICalculator, expectedBMICalculatorURL, "the values don't match");

        driver.close();
    }
    @Test
    public void testQuiz(){
        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(healthUnifyURL);
        // Click to tab of Quiz
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/quiz/']")).click();
        // Get actual result
        String actualResultQuiz = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultQuiz, expectedQuizURL, "the values don't match");

        driver.close();
    }
}
