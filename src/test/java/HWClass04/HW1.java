package HWClass04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class HW1 {

    //HW1:
    //goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
    //select , tuesday, thursday and friday one by one

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get(" http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        driver.manage().window().maximize();

        WebElement selectListDemo = driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
        selectListDemo.click();

        Thread.sleep(2000);

        Select sel = new Select(selectListDemo);

        sel.selectByVisibleText("Sunday");
        sel.selectByVisibleText("Monday");
        sel.selectByVisibleText("Tuesday");
        sel.selectByVisibleText("Wednesday");
        sel.selectByVisibleText("Thursday");
        sel.selectByVisibleText("Friday");
        sel.selectByVisibleText("Saturday");




    }
}
