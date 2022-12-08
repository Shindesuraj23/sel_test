import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExicutordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Suraj\\Desktop\\work\\Selenium_practice\\binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demoqa.com/text-box'");
		//driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
		
	}

}
