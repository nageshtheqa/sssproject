package pkg.uiautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
public static WebDriver driver;
public static Properties props;

public static WebDriver getDriver() throws IOException {
//	System.setProperty(null, null);
	props=new Properties();
	//FileInputStream finput=new FileInputStream("C:\\Users\\Nagesh.Jatti\\eclipse-workspace2021\\sssproject\\src\\test\\java\\pkg\\resources\\uiresources.properties");
	
	System.out.println(System.getProperty("user.dir"));
	FileReader read=new FileReader("src\\test\\java\\resources.properties");
	props.load(read);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagesh.Jatti\\Downloads\\chrome96\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println(props.getProperty("URL"));
	driver.get(props.getProperty("URL"));
	//driver.get("https://mvnrepository.com");
	
	return driver;
	
}

public static void closeBrowser() {
	driver.close();
}

}
