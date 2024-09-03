package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ExcelReader {

	static  XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static WebDriver driver;
	static String  projectpath;
	public static Properties  prop;


		public static void main(String[] args) throws InterruptedException, IOException {


//
//	@Test @BeforeMethod
//	public static void excelConfig() throws InterruptedException, IOException
//	{


		projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);

		workbook = new XSSFWorkbook(projectpath+File.separator+"src\\test\\java\\Configuration"+File.separator+"Config2.xlsx");
		sheet = workbook.getSheet("Configuration");
		int  rowCount = sheet.getPhysicalNumberOfRows();
		for (int rowNumber =1;  rowNumber<rowCount;  rowNumber++) {

			String username = sheet.getRow(rowNumber).getCell(0).getStringCellValue();
			String password = sheet.getRow(rowNumber).getCell(1).getStringCellValue();
			String browser = sheet.getRow(rowNumber).getCell(2).getStringCellValue();
			String url = sheet.getRow(rowNumber).getCell(3).getStringCellValue();
			System.out.println(username + "  " + password);

			//			if(prop.getProperty("browser").equalsIgnoreCase("edge")  ) {


			driver = new ChromeDriver();
			driver.get(url);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("i0116")).sendKeys(username);
			Thread.sleep(3000);
			driver.findElement(By.id("idSIButton9")).click();
			Thread.sleep(5000);

			driver.findElement(By.id("passwordInput")).sendKeys(password);
			Thread.sleep(5000);

			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(10000);

		}
		//			else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))  {

		//				driver = new EdgeDriver();
		//				//				driver.get(url);
		//				Dimension desiredSize2 = new Dimension(1296, 696);
		//
		//				driver.manage().window().setSize(desiredSize2);
		//				Dimension windowSize3 = driver.manage().window().getSize();
		//				int width3 = windowSize3.getWidth();
		//				int height3 = windowSize3.getHeight();
		//				System.out.println("Window size : " + width3 + "x" + height3);
		//				driver.get(url);
		//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));






	}


}



//			if(prop.getProperty("browser").equalsIgnoreCase("edge")  ) {

//				EdgeOptions edgeOptions = new EdgeOptions();
//				edgeOptions.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//				driver =new EdgeDriver(edgeOptions);
//				//			driver = new EdgeDriver();
//				//			driver.manage().window().maximize();
//				Dimension desiredSize2 = new Dimension(1296, 696);
//				driver.manage().window().setSize(desiredSize2);
//				Dimension windowSize3 = driver.manage().window().getSize();
//				int width3 = windowSize3.getWidth();
//				int height3 = windowSize3.getHeight();
//				System.out.println("Window size : " + width3 + "x" + height3);
//				driver.get(url);
//
//
//			}
//
////			else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))  {
//
//				ChromeOptions options =new ChromeOptions();
//				options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
//				driver =new ChromeDriver(options);
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				Dimension desiredSize2 = new Dimension(1296, 696);
//
//				driver.manage().window().setSize(desiredSize2);
//				Dimension windowSize3 = driver.manage().window().getSize();
//				int width3 = windowSize3.getWidth();
//				int height3 = windowSize3.getHeight();
//				System.out.println("Window size : " + width3 + "x" + height3);
//				driver.get(url);
//				driver.findElement(By.id("i0116")).sendKeys(username);
//				Thread.sleep(3000);
//				driver.findElement(By.id("idSIButton9")).click();
//				Thread.sleep(5000);
//
//				driver.findElement(By.id("passwordInput")).sendKeys(password);
//				Thread.sleep(5000);
//
//				driver.findElement(By.id("submitButton")).click();
//				Thread.sleep(10000);
//}
//
//		}
//		
//	
//}
























