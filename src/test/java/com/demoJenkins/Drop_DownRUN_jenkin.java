package com.demoJenkins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drop_DownRUN_jenkin {
	@Test
    public void DropDownHandlingJenkins() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/mominmulla/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		WebElement firstname = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
		firstname.sendKeys("Jhalk");
		
		WebElement lastname = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
		firstname.sendKeys("Roy");
		
		WebElement adress = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"));
		adress.sendKeys("2035 powell ave");
		
		
		WebElement email = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]"));
		email.sendKeys("jhalaRoyyy@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]"));
		phone.sendKeys("623663562536");
		
		WebElement gender = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]"));
		gender.click();
		
		WebElement hobbies = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobbies.click();
		
		Thread.sleep(2000);
		
		
		
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select sel = new Select(element);
		sel.selectByVisibleText("Android");
		
		
		WebElement firstEle = sel.getFirstSelectedOption();
		System.out.println("first element =" + firstEle.getText());
		
		
		List<WebElement> listOption = sel.getOptions();
		
		for (WebElement webElement : listOption) {
			System.out.println("option" + webElement.getText());
			
			
			driver.quit();
		}
			
		}
			
}
		


