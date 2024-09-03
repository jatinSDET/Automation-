package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserBase {

	public static WebDriver driver;
	public static Properties prop;

	@Test @BeforeMethod
	public static void config() throws AWTException, InterruptedException, IOException 
	{
		
		if(prop.getProperty("browser").equalsIgnoreCase("edge"))  {
			//			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			driver =new EdgeDriver(edgeOptions);
			//			driver = new EdgeDriver();
			//			driver.manage().window().maximize();
			Dimension desiredSize2 = new Dimension(1296, 696);
			driver.manage().window().setSize(desiredSize2);
			Dimension windowSize3 = driver.manage().window().getSize();
			int width3 = windowSize3.getWidth();
			int height3 = windowSize3.getHeight();
			System.out.println("Window size : " + width3 + "x" + height3);
			driver.get(prop.getProperty("testurl"));
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("chrome"))  {
			//			WebDriverManager.chromedriver().setup();

			ChromeOptions options =new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			driver =new ChromeDriver(options);
			//			driver = new ChromeDriver();
			//			driver.manage().window().maximize();
			Dimension desiredSize2 = new Dimension(1296, 696);
			driver.manage().window().setSize(desiredSize2);
			Dimension windowSize3 = driver.manage().window().getSize();
			int width3 = windowSize3.getWidth();
			int height3 = windowSize3.getHeight();
			System.out.println("Window size : " + width3 + "x" + height3);
			driver.get(prop.getProperty("testurl"));
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys(prop.getProperty("Username"));
			System.out.println(prop.getProperty("Username"));
			driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys(prop.getProperty("Password"));
			driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
			Thread.sleep(5000);
		}
	}
	public void newWorkOrder(String S) throws InterruptedException, AWTException
	{
		//		WebDriverManager.edgedriver().setup();
		//		driver =new EdgeDriver();
		//		driver.get("https://orion2-test.nat.bt.com/");


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@class=\"sc-pdKru jgDDeG\"]")).sendKeys(S);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();
		driver.findElement(By.xpath("//button[@data-testid='createWOButton']")).click();
		String downloadsFolderPath = System.getProperty("user.home") + "/Downloads";
		System.out.println("==============================="+downloadsFolderPath);

		//		Robot robot = new Robot();
		//		for(int i = 0; i<4; i++) {
		//			robot.keyPress(KeyEvent.VK_CONTROL);
		//			robot.keyPress(KeyEvent.VK_SUBTRACT);
		//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
		//			robot.keyRelease(KeyEvent.VK_CONTROL);
		//		}
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//create WO btn --> from spilitter 
		//		driver.findElement(By.xpath("//div[contains(div/following-sibling::text(),'Create From Splitter Node')]")).click();
		//		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")).click();
		//				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[1]")).click();  //delta

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(15000);
		//		868,379--->125%
		Actions actions = new Actions(driver);

		actions.moveByOffset(684,324).click().perform();
		actions.moveByOffset(-684,-324).perform();

		System.out.println("============================its clicked=================");

		Thread.sleep(5000);
		for(int i = 0; i<1; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid='SearchBar']"));
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.DELETE);
		}
		//		for(int i = 0; i<1; i++) {
		//			WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/div/div[2]/div[4]/input"));
		//			element.sendKeys(Keys.CONTROL+"a");
		//			element.sendKeys(Keys.BACK_SPACE);
		//		}
		for(int i = 0; i<15; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid=\"workorder-name\"]"));
			element.sendKeys(Keys.BACK_SPACE);

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]")).sendKeys(AutoNameGenerator2());
		driver.findElement(By.xpath("//div[@class='sc-fznzqM kcMtBa']")).click();

		driver.findElement(By.xpath("(//div[@class='sc-fznzqM kcMtBa'])[2]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(15000);
	}
	public void cof600WO() throws InterruptedException, AWTException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@class=\"sc-pdKru jgDDeG\"]")).sendKeys("525775,183287");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();
		driver.findElement(By.xpath("//button[@data-testid='createWOButton']")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(8000);
		Actions actions = new Actions(driver);

		actions.moveByOffset(662,312).click().perform();
		actions.moveByOffset(-662,-312).perform();
		System.out.println("============================its clicked=================");

		driver.findElement(By.xpath("//input[@data-testid='workorder-name']")).sendKeys(AutoNameGenerator());
		Thread.sleep(5000);
		for(int i = 0; i<1; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid='SearchBar']"));
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.DELETE);
		}
		driver.findElement(By.xpath("//div[@class='sc-fznzqM kcMtBa']")).click();

		driver.findElement(By.xpath("(//div[@class='sc-fznzqM kcMtBa'])[2]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(15000);
	}
//	public void newWOAmber() throws InterruptedException, AWTException
//	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		driver.findElement(By.xpath("//input[@class=\"sc-pdKru jgDDeG\"]")).sendKeys("363987,189680");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();
//		driver.findElement(By.xpath("//button[@data-testid='createWOButton']")).click();
//
//		//		Robot robot = new Robot();
//		//		for(int i = 0; i<4; i++) {
//		//			robot.keyPress(KeyEvent.VK_CONTROL);
//		//			robot.keyPress(KeyEvent.VK_SUBTRACT);
//		//			robot.keyRelease(KeyEvent.VK_SUBTRACT);
//		//			robot.keyRelease(KeyEvent.VK_CONTROL);
//		//		}
//		Thread.sleep(4000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		//		driver.findElement(By.xpath("//div[@class='sc-pjUgp gDEznh']//div[2]")).click();
//		//		driver.findElement(By.xpath("//div[@class='sc-pkgFA eYGFaO']//div[2]")).click();
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
//		Thread.sleep(8000);
//		//		868,379--->125%
//		Actions actions = new Actions(driver);
//
//		actions.moveByOffset(684,324).click().perform();
//		actions.moveByOffset(-684,-324).perform();
//
//		System.out.println("============================its clicked=================");
//		Thread.sleep(5000);
//
//		for(int i = 0; i<1; i++) {
//			WebElement element = driver.findElement(By.xpath("//input[@data-testid='SearchBar']"));
//			element.sendKeys(Keys.CONTROL+"a");
//			element.sendKeys(Keys.DELETE);
//		}
//		driver.findElement(By.xpath("//div[@class='sc-fznzqM kcMtBa']")).click();
//
//		driver.findElement(By.xpath("(//div[@class='sc-fznzqM kcMtBa'])[2]")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
//		Thread.sleep(10000);
//	}
	public void openWO(String S) throws InterruptedException
	{
		//		"Pole_21042024"
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class=\"sc-pdKru jgDDeG\"]")).sendKeys(S);
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/div[1]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[5]/button[1]")).click();
		Thread.sleep(4000);

	}	
	public void EthernetWO() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys("TYSUD");
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();
		driver.findElement(By.xpath("//button[@data-testid='createWOButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='createWOButton']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/button[2]")).click();

		driver.findElement(By.xpath("//div[contains(div/following-sibling::text(),'Create Ethernet Workorder')]")).click();
		Thread.sleep(3000);

		//		377551.2, 205284.8
		for(int i = 0; i<1; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid='SearchBar']"));
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.DELETE);
		}
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys("377551,205284");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveByOffset(684,324).click().perform();
		actions.moveByOffset(-684,-324).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid=\"circuitNumber\"]")).sendKeys(AutoENameGenerator3());
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]")).sendKeys("7A");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='SET']")).click();
		for(int i = 0; i<1; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid='SearchBar']"));
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.DELETE);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys("JC:JB:G3359378");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();

		Thread.sleep(2000);
		Actions actions2 = new Actions(driver);
		actions2.moveByOffset(684,324).click().perform();
		actions2.moveByOffset(-684,-324).perform();

		Thread.sleep(4000);
		for(int i = 0; i<1; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid='SearchBar']"));
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.DELETE);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys("JC:JRF:G3353042");
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();

		Thread.sleep(2000);
		Actions actions1 = new Actions(driver);
		actions1.moveByOffset(684,324).click().perform();
		actions1.moveByOffset(-684,-324).perform();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
		Thread.sleep(5000);
	}

	public String AutoNameGenerator()
	{
		SimpleDateFormat format = new SimpleDateFormat("ddMMyymmss");
		Date date = new Date();
		String Name = format.format(date);
		//		String newName = "AccessPON"+Name;
		String newName =Name;
		return newName;	
	}

	public String AutoNameGenerator2()
	{
		SimpleDateFormat format = new SimpleDateFormat("ddMMyymmss");
		Date date = new Date();
		String Name = format.format(date);
		String newName = "YLY_V9056"+Name;
		//		String newName =Name;
		return newName;	
	}

	public String AutoENameGenerator3()
	{
		SimpleDateFormat format3 = new SimpleDateFormat("ddmmss");
		Date date = new Date();
		String Name3 = format3.format(date);
		String newName3 = "Enet"+Name3;
		//		String newName =Name;
		return newName3;	
	}
	public String AutoENameGeneratorSRedAndYellow()
	{
		SimpleDateFormat format4 = new SimpleDateFormat("ddMMyymmss");
		Date date = new Date();
		String Name4 = format4.format(date);
		String newName4 = "SecureArea01"+Name4;
		//		String newName4 =Name4;
		return newName4;	
	}

	public  String TenDigitNumberGenerator()
	{
		Random random = new Random(); 
		long randomNumber = Math.abs(random.nextLong()); 
		String randomString = Long.toString(randomNumber); 
		String tenDigitNumber = randomString.substring(0, 10); 
		//	        System.out.println(tenDigitNumber);
		return tenDigitNumber; 
	}
	public void loadProperty()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Configuration\\Config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public void deleteWorkOrder() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Delete']")).click();
		Thread.sleep(4000);
	}

	public void clickToCordinates() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveByOffset(684,324).click().perform();
		actions.moveByOffset(-684,-324).perform();
		Thread.sleep(10000);

	}
	
	public void clickToCordinates2(int a, int b, int i, int j) throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveByOffset(a,b).click().perform();
		actions.moveByOffset(i,j).click().perform();
		Thread.sleep(10000);

	}
	

	public void saveBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);

	}
	//	NETWORK CHANGED SUCCESSFULY
	public void verifySuccessfulMsg()
	{

		//*[@id="root"]/div/div[3]/span
		WebElement successMsg = driver.findElement(By.cssSelector("#root > div > div.sc-psDXd.iBA-dpN > span"));
		String ExpectedText = "NETWORK CHANGED SUCCESSFULY";
		Assert.assertEquals(ExpectedText, successMsg.getText());
		System.out.println("SUCCESSFULY SAVED  – Assert passed");
	}


	public void ethernetAccessOn() throws InterruptedException
	{
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("button[data-testid='toolsButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid='adminPageButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='usersButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid=\"UMsearchInput\"]")).sendKeys("615616368");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/button[9]/div[1]/*[name()='svg'][1]")).click();
		driver.findElement(By.xpath("//button[@data-testid='edit_ethernet']//div[@class='sc-qZtCU cDgBWM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='UMfinishEdit']//*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='goBackToOrionButton']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void ethernetAccessOff() throws InterruptedException
	{
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("button[data-testid='toolsButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid='adminPageButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='usersButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid=\"UMsearchInput\"]")).sendKeys("615616368");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/button[9]/div[1]/*[name()='svg'][1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]/button[9]/div[1]/*[name()='svg'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='UMfinishEdit']//*[name()='svg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='goBackToOrionButton']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

	public void WorkOrderName() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
	}
	public void searchBox(String S) throws InterruptedException
	{
		//		WebElement search =driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys(Keys.DELETE);


		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys(S);
		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();
		Thread.sleep(3000);
	}

	public void addSDU() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-testid='addButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='Structures']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@data-testid='BUILDING']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-testid='SDU']")).click();
		Thread.sleep(1000);
	}

	public void addMDU() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Structures']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='BUILDING']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='MDU']")).click();

	}

	public void newWOStructureAttributes() throws InterruptedException, AWTException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@class=\"sc-pdKru jgDDeG\"]")).sendKeys("486288,153522");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"sc-oTaid fpeoAN\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='createWOButton']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]")).click();

		Thread.sleep(15000);
		//		868,379--->125%
		Actions actions = new Actions(driver);

		actions.moveByOffset(684,324).click().perform();
		actions.moveByOffset(-684,-324).perform();

		Thread.sleep(5000);
		for(int i = 0; i<1; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid='SearchBar']"));
			element.sendKeys(Keys.CONTROL+"a");
			element.sendKeys(Keys.DELETE);
		}
		for(int i = 0; i<15; i++) {
			WebElement element = driver.findElement(By.xpath("//input[@data-testid=\"workorder-name\"]"));
			element.sendKeys(Keys.BACK_SPACE);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/input[1]")).sendKeys(AutoNameGenerator2());
		driver.findElement(By.xpath("//div[@class='sc-fznzqM kcMtBa']")).click();

		driver.findElement(By.xpath("(//div[@class='sc-fznzqM kcMtBa'])[2]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(15000);
	}
	public void addStructure() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@data-testid='addButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Structures']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='POLE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='WOOD LIGHT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='10M LIGHT']")).click();
		Thread.sleep(2000);
	}
	public void statusSetStructure() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='sc-pZOBi bNnzrs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='IPL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("test test test");
		Thread.sleep(2000);
	}
	public void addsSpans() throws InterruptedException
	{

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='addButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Spans']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-fznBtT ccaska']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='CONDUIT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='D54']")).click();
		Thread.sleep(2000);

	}
	public void addTrenchSpan() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='addButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Spans']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-fznBtT ccaska']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='TRENCH']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sc-fzobTh eteoFg'])[2]")).click();
		Thread.sleep(2000);

	}
	public void waitForClick(String es)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.findElement(By.xpath(es)).click();
		} catch (Exception e) {

		}
	}
	public void clickErrorBtn() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[5]/button[3]/div[1]")).click();
		Thread.sleep(2000);
	}

	public void clickToWoName() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		Thread.sleep(2000);
	}

	public void ClickToUploadBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='attachment-upload']")).click();
		//		Thread.sleep(2000);
	}
	public void chooseFile(WebElement element, String file, WebElement attachmentType, String visibletext,  String description) throws InterruptedException
	{
		Thread.sleep(3000);

		WebElement uploadFile1 = element;
		uploadFile1.sendKeys(System.getProperty("user.dir") + "\\testdata\\"+"\\Attachment-Types\\" +file);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[5]/textarea[1]")).sendKeys(description);

		Thread.sleep(3000);

		attachmentType.click();
		Thread.sleep(5000);

		String SS = ".//span[text()='"+visibletext+"']";
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(SS)));

		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@data-testid='file-upload']")).click();
		Thread.sleep(5000);
	}
	//String visibletext
	public void chooseFileEdit(WebElement element, String file, WebElement attachmentType,  String description) throws InterruptedException
	{
		Thread.sleep(3000);

		WebElement uploadFile1 = element;
		uploadFile1.sendKeys(System.getProperty("user.dir") + "\\testdata\\"+"\\Attachment-Types\\" +file);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[13]/textarea[1]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[13]/textarea[1]")).sendKeys(description);

		Thread.sleep(3000);

		attachmentType.click();
		Thread.sleep(5000);

		//		String SS = ".//span[text()='"+visibletext+"']";
		//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(SS)));
		//
		//		Thread.sleep(5000);
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//		driver.findElement(By.xpath("//button[@data-testid='file-upload']")).click();
		//		Thread.sleep(5000);
	}


	public void zoomOut() throws AWTException
	{
		Robot robot = new Robot();
		for(int i = 0; i<4; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}

	public void btnSchematic() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[5]/button[1]/*[name()='svg'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-prOVx nbRcd']//*[name()='svg']")).click();

	}

	public void submitBtn() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[@data-testid='SubmitButton']")).click();
		Thread.sleep(5000);
	}
	public void zoomOutSchematic() throws InterruptedException
	{

		for(int i = 0; i<4; i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='ol-zoom-out'])[1]")).click();
		}
	}

	public void cutWindow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/div[1]/button[1]/*[name()='svg'][1]")).click();
	}
	public void addSpilitter() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Equipment']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='SPLITTER_SCALE']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='SMALL_NODE_AS_SPN']")).click();
	}
	public void validationRow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='validation-row']")).click();
	}

	public void selectDropdown(String visibleText)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		//		waitAndClick(element);

		String SS = ".//span[text()='"+visibleText+"']";
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(SS)));
	}

	public void addReducer() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Structures']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='BURIED']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='REDUCER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[5]")).click();

	}

	public void addCPEEcTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='addButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid='Equipment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='CPE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='PostCode']")).sendKeys("N8 8NB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='sc-AxiKw bcngeR'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='nadCpeCard-A12671278405']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid='undefined']")).click();
		Thread.sleep(2000);
		selectDropdown("OR - RI01ROM - Nursing/ care home room");
		Thread.sleep(3000);
	}

	public void deleteBtn() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@data-testid='delete-element']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='delete-element']")).click();
		Thread.sleep(3000);

		//
		//		@FindBy(xpath="//span[normalize-space()='1 external span is connected to an SDU']")
		//		WebElement errorSDU;
	}

	public void addDuctTee() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Structures']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='BURIED']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='DUCT TEE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='DUCT TEE']")).click();
	}

	public void reparent() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='reparent-equipment']")).click();

	}
	public void addIJ() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Equipment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='INTERMEDIATE_JOINT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='SMALL_NODE_AS_IJ']")).click();
	}	
	public void addCBTs()
	{
		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][1]")).click();

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][4]/*[name()='g'][1]")).click();

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][5]/*[name()='g'][1]")).click();

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][6]/*[name()='g'][1]")).click();

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][7]/*[name()='g'][1]")).click();



		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][8]/*[name()='g'][1]")).click();

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][9]/*[name()='g'][1]")).click();

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][10]/*[name()='g'][1]")).click();

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][11]/*[name()='g'][1]")).click();
		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][12]/*[name()='g'][1]")).click();

		//		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][13]/*[name()='g'][1]")).click();
		//
		//		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][14]/*[name()='g'][1]")).click();

	}

	public void Reroute() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Reroute']")).click();
	}

	public void addBasement() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/button[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div/div/div[3]")).click();
		Thread.sleep(5000);
	}
	public void verifyRefreshSuccessMsg()
	{

		boolean successful = driver.findElement(By.xpath("//span[@class='sc-pjstK jsIEAM']")).isEnabled();
		boolean unsuccessful = driver.findElement(By.xpath("//span[@class='sc-pjstK jsIEAM']")).isDisplayed();
		if(successful  ) {
			System.out.println("Successful Message..!!");
		} else {
			System.out.println("UnSuccessful Message..!!");
		}
	}
	public void attachment10MBPlus() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement uploadFile4 = driver.findElement(By.xpath("//input[@name=\"attachment\"]"));
		uploadFile4.sendKeys(System.getProperty("user.dir") + "\\testdata\\"+"\\Attachment-Types\\" + "SampleJPGImage_10mbmb.jpg");
	}
	public void verifyMessage(String element, String verifyText)
	{
		WebElement successMsg = driver.findElement(By.xpath(element));  ///html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[10]/span[1]
		String ExpectedText = verifyText;
		Assert.assertEquals(ExpectedText, successMsg.getText());
		System.out.println("Given Condition – Assert Passed");
	}


	public void verifySuccessfulNGDAddress()
	{
		//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/form/div/span[2]"));

		boolean successful = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/form/div/span[2]")).isEnabled();

		boolean unsuccessful = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/form/div/span[2]")).isDisplayed();

		if(successful  ) {

			System.out.println("Successful Message..!!");

		} else {

			System.out.println("UnSuccessful Message..!!");
		}
	}
	public void byDefaultORFriendly()
	{

		boolean present = driver.findElement(By.xpath("(//div[@class='sc-fzpans iWIkxE'])[8]")).isEnabled();

		boolean notPresent = driver.findElement(By.xpath("(//div[@class='sc-fzpans iWIkxE'])[8]")).isDisplayed();


		if(present ) {
			System.out.println("------------------------By Default Present----------------------------");
		} else {
			System.out.println("------------------------Not By Default Present----------------------");
		}
	}

	public void addressFieldsDisabled()
	{
		boolean  organisationName= driver.findElement(By.xpath("//input[@id='organisationName']")).isEnabled();  //false
		System.out.println("Address Fields are Disabled .... =" + organisationName);


		Assert.assertEquals(false, organisationName);
		if(organisationName==false) {
			Assert.assertEquals(false, organisationName);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  departmentName= driver.findElement(By.xpath("//input[@id='departmentName']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + departmentName);

		Assert.assertEquals(false, departmentName);
		if(departmentName==false) {
			Assert.assertEquals(false, departmentName);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  subPremise= driver.findElement(By.xpath("//input[@id='subPremise']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + subPremise);

		Assert.assertEquals(false, subPremise);
		if(subPremise==false) {
			Assert.assertEquals(false, subPremise);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  premiseName= driver.findElement(By.xpath("//input[@id='premiseName']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + premiseName);

		Assert.assertEquals(false, premiseName);
		if(premiseName==false) {
			Assert.assertEquals(false, premiseName);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  thoroughfareNumber= driver.findElement(By.xpath("//input[@id='thoroughfareNumber']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + thoroughfareNumber);

		Assert.assertEquals(false, thoroughfareNumber);
		if(thoroughfareNumber==false) {
			Assert.assertEquals(false, thoroughfareNumber);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  dependThoroughfare= driver.findElement(By.xpath("//input[@id='dependThoroughfare']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + dependThoroughfare);

		Assert.assertEquals(false, dependThoroughfare);
		if(dependThoroughfare==false) {
			Assert.assertEquals(false, dependThoroughfare);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  thoroughfare= driver.findElement(By.xpath("//input[@id='thoroughfare']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + thoroughfare);

		Assert.assertEquals(false, thoroughfare);
		if(thoroughfare==false) {
			Assert.assertEquals(false, thoroughfare);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  dependentLocality= driver.findElement(By.xpath("//input[@id='dependentLocality']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + dependentLocality);

		Assert.assertEquals(false, dependentLocality);
		if(dependentLocality==false) {
			Assert.assertEquals(false, dependentLocality);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  doubleDependLocality= driver.findElement(By.xpath("//input[@id='doubleDependLocality']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + doubleDependLocality);

		Assert.assertEquals(false, doubleDependLocality);
		if(doubleDependLocality==false) {
			Assert.assertEquals(false, doubleDependLocality);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  locality= driver.findElement(By.xpath("//input[@id='locality']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + locality);

		Assert.assertEquals(false, locality);
		if(locality==false) {
			Assert.assertEquals(false, locality);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  poBox= driver.findElement(By.xpath("//input[@id='poBox']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + poBox);

		Assert.assertEquals(false, poBox);
		if(poBox==false) {
			Assert.assertEquals(false, poBox);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  postTown= driver.findElement(By.xpath("//input[@id='postTown']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + postTown);

		Assert.assertEquals(false, postTown);
		if(postTown==false) {
			Assert.assertEquals(false, postTown);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  county= driver.findElement(By.xpath("//input[@id='county']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + county);

		Assert.assertEquals(false, county);
		if(county==false) {
			Assert.assertEquals(false, county);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean udprn= driver.findElement(By.xpath("//input[@id='udprn']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + udprn);

		Assert.assertEquals(false, udprn);
		if(udprn==false) {
			Assert.assertEquals(false, udprn);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  parentUprn= driver.findElement(By.xpath("//input[@id='parentUprn']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + parentUprn);

		Assert.assertEquals(false, parentUprn);
		if(parentUprn==false) {
			Assert.assertEquals(false, parentUprn);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}

		boolean  postcode= driver.findElement(By.xpath("//input[@id='postcode']")).isEnabled();
		System.out.println("Address Fields are Disabled .... =" + postcode);

		Assert.assertEquals(false, postcode);
		if(postcode==false) {
			Assert.assertEquals(false, postcode);
			System.out.println("As Expected organisationName : Its Disabled");
		}
		else {
			System.out.println("As Expected organisationName : its Enabled");
		}
	}

//	public void searchBar(String S)
//	{
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys(Keys.CONTROL + "a");
//		driver.findElement(By.xpath("//input[@data-testid=\"SearchBar\"]")).sendKeys(Keys.DELETE);
//
//		driver.findElement(By.xpath("//input[@data-testid='SearchBar']")).sendKeys(S);
//		driver.findElement(By.xpath("(//div[@class='sc-oTaid fpeoAN'])[2]")).click();
//	}

	public void attachmentForOther() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement uploadFile4 = driver.findElement(By.xpath("//input[@name=\"attachment\"]"));
		uploadFile4.sendKeys(System.getProperty("user.dir") + "\\testdata\\"+"\\Attachment-Types\\" + "NewYork.jpg");
	}

	public void getText(String text)
	{
		WebElement verifyText = driver.findElement(By.xpath(text));
		System.out.println("This Text Is Present : " +verifyText);
	}

	public void expandCBTandCPE() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][22]/*[name()='g'][1]")).click();
		Thread.sleep(5000);

	}

	public void verifyLowAddress()
	{

		WebElement missingUPRN = driver.findElement(By.xpath("//span[contains(text(),'Low address accuracy')]"));
		String ExpectedText = "Low address accuracy";
		Assert.assertEquals(ExpectedText, missingUPRN.getText());
		System.out.println("CPE has Low address accuracy – Assert passed");

	}

	public void addCBTOutGoingCables()
	{
		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][3]/*[name()='g'][1]")).click();
		WebElement CBT1;

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][4]/*[name()='g'][1]")).click();
		WebElement CBT2;

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][5]/*[name()='g'][1]")).click();
		WebElement CBT3;

		driver.findElement(By.xpath("//div[@class='sc-oTmZL kfNTWi']//*[name()='svg']//*[name()='g' and @id='pointerGroup']//*[name()='g' and @id='mainGroup']//*[name()='g' and contains(@class,'nodes')]//*[name()='g'][6]/*[name()='g'][1]")).click();
		WebElement CBT4;
	}

	public void addChildren() throws InterruptedException
	{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[@class='sc-pmigq dumJaj'])[3]")).click();
		Thread.sleep(2000);
	}

	public void blueColormissingUPRNProperties()
	{
		WebElement missingUPRN = driver.findElement(By.xpath("//span[contains(text(),'Missing UPRN')]"));
		String ExpectedText = "Missing UPRN";
		Assert.assertEquals(ExpectedText, missingUPRN.getText());
		System.out.println("CPE Property in text is present – Assert passed");

	}
	public void verifyTheErrorMsgNGD()
	{
		WebElement errorMsg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/form[1]/div[1]/span[2]"));
		String ExpectedText = "Cpe does not exist with id";
		//		String ExpectedText = "Cpe does with id";
		String errorMessages = errorMsg.getText();
		System.out.println(errorMessages);

		if (errorMessages.startsWith(ExpectedText)) {

			System.out.println("As Error Message Expected :  Passed");

		} else {

			System.out.println("As Error Message Expected :  False");
		}

		Assert.assertEquals(true, errorMessages.startsWith(ExpectedText));
		System.out.println("Cpe does not exist with id – Assert passed");


	}

	public void filledAttachDiscription(String S) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@data-testid='attachment-description']")).sendKeys(S);
		Thread.sleep(2000);
	}

	public void checkOthersFieldsIsEnable()
	{
		WebElement  actual;
		actual = driver.findElement(By.xpath("//input[@id='poling.dpNumber']"));
		String expectedColor = "1px solid rgb(222, 228, 232)";
		String borderColor = actual.getCssValue("border");
		System.out.println("----------------borderColor---------------"  + borderColor);
		Assert.assertEquals(expectedColor, actual.getCssValue("border"));
		System.out.println("Other Fields should not be enable – Assert passed");

	}


	public void verifyCheckedPoleReset()
	{
		WebElement checkBox = 	driver.findElement(By.xpath("//label[normalize-space()='Pole Reset Required']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]"));
		if(checkBox.isSelected())  {
			System.out.println("Checkebox is  Checked");
		}  else {
			System.out.println("Checkebox is not Checked");
		}
	}
	
	public void clickToMap() throws InterruptedException
	{
		//1
		clickToCordinates();
		Thread.sleep(2000);
		//2
		Actions actions2 = new Actions(driver);
		actions2.moveByOffset(239,95).click().perform();
		actions2.moveByOffset(-239,-95).perform();

		Thread.sleep(2000);

		//3
		Actions actions3 = new Actions(driver);
		actions3.moveByOffset(174,287).click().perform();
		actions3.moveByOffset(-174,-287).perform();

		Thread.sleep(2000);

		//4
		Actions actions4 = new Actions(driver);
		actions4.moveByOffset(324,343).click().perform();
		actions4.moveByOffset(-324,-343).perform();

		//5
		clickToCordinates();
	}
	
	public void clickToMapTC44() throws InterruptedException
	{
		clickToCordinates();
		Thread.sleep(2000);
		
		searchBox("484408,154241");
		Thread.sleep(3000);
		
		
		//1
		Actions actions = new Actions(driver);
		actions.moveByOffset(303,176).click().perform();
		actions.moveByOffset(-303,-176).perform();
		
		Thread.sleep(2000);
		
		//2
		Actions actions2 = new Actions(driver);
		actions2.moveByOffset(174,287).click().perform();
		actions2.moveByOffset(-174,-287).perform();
		
		Thread.sleep(2000);
		
		//3
		Actions actions3 = new Actions(driver);
		actions3.moveByOffset(324,343).click().perform();
		actions3.moveByOffset(-324,-343).perform();
		
		Thread.sleep(2000);
		
		searchBox("484830,153853");
		clickToCordinates();
		Thread.sleep(2000);
	}

	public void moveStructure() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveByOffset(692, 327).clickAndHold();
		actions.moveByOffset(143, 85).release().build().perform();

	}
	
	public void moveSpan() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveByOffset(692, 327).clickAndHold();
		actions.moveByOffset(143, 85).release().build().perform();
		Thread.sleep(2000);
	}
	
	public void zoomIn8() throws AWTException
	{

		for(int i = 0; i<8; i++) {
			driver.findElement(By.xpath("//div[@class='ol-overlaycontainer-stopevent']//button[@title='Zoom in'][normalize-space()='+']")).click();
		
		}
	}
	
	public void zoomIn4()
	{
		for(int i = 0; i<4; i++) {
			driver.findElement(By.xpath("//div[@class='ol-overlaycontainer-stopevent']//button[@title='Zoom in'][normalize-space()='+']")).click();
		
		}
	}
	
	
	

	@AfterMethod
	public void teardown() {
		//		WebDriverWait wait = new WebDriverWait(driver, 20);
		//		wait.until(ExpectedConditions.visibilityOf(null)
		//		driver.quit();
	}

}
