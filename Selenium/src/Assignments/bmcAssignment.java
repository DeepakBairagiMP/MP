package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bmcAssignment {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Mine\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("amazon");

		List<WebElement> list = driver.findElements(By.xpath("(//*[@class='OBMEnb'])[1]//descendant::li[@role='presentation']"));
		for (WebElement sugg : list) {
			System.out.println(sugg.getText());
		}
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//*[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell computers");
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.name("low-price")).sendKeys("30000");
		driver.findElement(By.name("high-price")).sendKeys("50000");
		driver.findElement(By.className("a-button-input")).click();
		List<WebElement> page1=driver.findElements(By.partialLinkText("<a aria-disabled=\"true\" class=\"a-link-normal 5star\" title=\"5 stars represent 100% of rating\" href=\"/product-reviews/B09GVLX25B/ref=acr_search_hist_5?ie=UTF8&amp;filterByStar=five_star&amp;reviewerType=all_reviews#reviews-filter-bar\">\r\n"));
		for(WebElement print : page1) {
			System.out.println(print.getText());
		}
	}
}
