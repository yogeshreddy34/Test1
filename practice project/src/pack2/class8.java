package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class8 {
public void url() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\git\\Test1\\practice project\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://hrms.sakshi.com");
	
	
}
public static void main(String[] args) {
	class8 obj = new class8();
	obj.url();
}
}
