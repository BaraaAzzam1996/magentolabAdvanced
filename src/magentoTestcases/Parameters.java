package magentoTestcases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {
	SoftAssert softassert=new SoftAssert();
	
 static WebDriver driver = new ChromeDriver();
    Random rand =new Random();
	int RandomIndexForTheEmail=rand.nextInt(999);

 static String LogInPage="https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/";
 static String TheWebSite ="https://magento.softwaretestingboard.com/";
 static String SignUpPage="https://magento.softwaretestingboard.com/customer/account/create/";
 static String LogoutPage="https://magento.softwaretestingboard.com/customer/account/logout/";
 static String UrlAfterLogin="https://magento.softwaretestingboard.com/customer/account/";

 static String [] firstNames= {"dana","mira","danya"};
 static String [] lastNames= {"omar","anas","yazan"};
	int RandomIndexForTheNames=rand.nextInt(3);
	String firstName=firstNames[RandomIndexForTheNames];
	String lastName=lastNames[RandomIndexForTheNames];
	String Email=firstName+lastName+RandomIndexForTheEmail+"@gmail.com";
	String Password="ASDasd123!";


 
}
