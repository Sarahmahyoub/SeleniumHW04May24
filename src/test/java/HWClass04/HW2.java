package HWClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {

    //hw2:
    //goto facebook.com
    // click on create account
    //and select the your  date of birth using select class

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com/");

        driver.manage().window().maximize();

        WebElement createNewAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAcc.click();

        Thread.sleep(2000);

        WebElement monthOfbirth = driver.findElement(By.xpath("//select[@name='birthday_month']"));

        Select sel1= new Select(monthOfbirth);
        sel1.selectByVisibleText("Jul");

        WebElement dayOfbirth = driver.findElement(By.xpath("//select[@name='birthday_day']"));

        Select sel2= new Select(dayOfbirth);
        sel2.selectByVisibleText("25");

        WebElement yearOfbirth = driver.findElement(By.xpath("//select[@name='birthday_year']"));

        Select sel3= new Select(yearOfbirth);
        sel3.selectByVisibleText("1982");




    }
}
