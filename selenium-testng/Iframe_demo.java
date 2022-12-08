import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Suraj\\Desktop\\work\\Selenium_practice\\binary\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	String mainwindow=driver.getWindowHandle();
	driver.switchTo().frame("frame1");
	
	WebElement sample=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(sample.getText());
	//driver.switchTo().parentFrame();
	driver.switchTo().window(mainwindow);
	driver.switchTo().frame("frame2");
	WebElement sample1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(sample1.getText());
	driver.switchTo().parentFrame();
	WebElement pagetext=driver.findElement(By.xpath("//div[contains(text(),'Sample ')]"));
	System.out.println(pagetext.getText());
	
	}

}
