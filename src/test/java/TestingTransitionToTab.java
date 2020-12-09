import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestingTransitionToTab {
    String website = "https://healthunify.com/";
    String websiteCalculator = "https://healthunify.com/bmicalculator/";

    String expectedResultHome = "https://healthunify.com/";
    String expectedResultDiet = "https://healthunify.com/category/health-and-wellness/diet/";
    String expectedResultFitness = "https://healthunify.com/category/health-and-wellness/fitness/";
    String expectedResultJuice = "https://healthunify.com/category/health-and-wellness/juice/";
    String expectedResultBMICalculator = "https://healthunify.com/bmicalculator/";
    String expectedResultQuiz = "https://healthunify.com/quiz/";


    @Test
    public void testDiet(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dkwr2\\IdeaProjects\\TestingHealthunifyCom\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(website);
        // Click to tab of Diet
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/category/health-and-wellness/diet/']")).click();
        // Get actual result
        String actualResultDiet = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultDiet, expectedResultDiet, "the values don't match");

        driver.close();
    }
    @Test
    public void testHome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dkwr2\\IdeaProjects\\TestingHealthunifyCom\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/bmicalculator/
        driver.get(websiteCalculator);
        // Click to tab of Home
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/']")).click();
        // Get actual result
        String actualResultHome = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultHome, expectedResultHome, "the values don't match");

        driver.close();
    }
    @Test
    public void testFitness(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dkwr2\\IdeaProjects\\TestingHealthunifyCom\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(website);
        // Click to tab of Fitness
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/category/health-and-wellness/fitness/']")).click();
        // Get actual result
        String actualResultFitness = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultFitness, expectedResultFitness, "the values don't match");

        driver.close();
    }
    @Test
    public void testJuice(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dkwr2\\IdeaProjects\\TestingHealthunifyCom\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(website);
        // Click to tab of Juice
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/category/health-and-wellness/juice/']")).click();
        // Get actual result
        String actualResultJuice = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultJuice, expectedResultJuice, "the values don't match");

        driver.close();
    }
    @Test
    public void testBMICalculator(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dkwr2\\IdeaProjects\\TestingHealthunifyCom\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(website);
        // Click to tab of BMICalculator
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/bmicalculator/']")).click();
        // Get actual result
        String actualResultBMICalculator = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultBMICalculator, expectedResultBMICalculator, "the values don't match");

        driver.close();
    }
    @Test
    public void testQuiz(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dkwr2\\IdeaProjects\\TestingHealthunifyCom\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open Website https://healthunify.com/
        driver.get(website);
        // Click to tab of Quiz
        driver.findElement(By.xpath("//a[@href='https://healthunify.com/quiz/']")).click();
        // Get actual result
        String actualResultQuiz = driver.getCurrentUrl();
        // Compare actual result and expected result
        Assert.assertEquals(actualResultQuiz, expectedResultQuiz, "the values don't match");

        driver.close();
    }
}
