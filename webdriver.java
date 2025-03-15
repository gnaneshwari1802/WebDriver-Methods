package day26; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class GetMethods { 
public static void main(String[] args) { 
WebDriver driver-new ChromeDriver(); 
//get(url) opens the url on the browser 
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
//getTitle() returns title of the page System.out.println(driver.getTitle()); //OrangeHRM 
//getCurrentUrl() returns URL of the page System.out.println(driver.getCurrentUrl()); 
/getPageSource() returns source code of the page 
//System.out.println(driver.getPageSource()); 
//getWindowHandle() returns ID of the single Browser window 
//String windowid-driver.getWindowHandle(); 
//System.out.println("Window ID:"+ windowid); //2C12CA3BA6309819A03E4C8C98D55F7C 
//6C7FDFF673002182158E1A2D0A4FA0A4 
//getWindowHandles() retuns ID's of the multiple browser windows 
driver.findElement(By.LinkText("OrangeHRM, Inc")).click(); // this will opens new browser window 
Set<String> windowids-driver.getWindowHandles(); 
System.out.println(windowids);

} 
}
