package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/rankings/content/page/211271.html");
		Thread.sleep(1000);
		System.out.println("*");
       //Total Number Of Rows
		int TotalNoOfRows = driver.findElements(By.xpath("(//table[@class='StoryengineTable'])[1]/tbody/tr")).size();
		 System.out.println(TotalNoOfRows);
		    Thread.sleep(5000);
		    System.out.println("*");
		    //TotalNoOfColumns
		    int TotalNoOfColumns = driver.findElements(By.xpath("(//table[@class='StoryengineTable'])[1]/tbody/tr[1]/th")).size();
		    System.out.println(TotalNoOfColumns);
		    Thread.sleep(1000);
		    System.out.println("*");
		    // perticular data
		    for(int i=1;i<=5;i++) 
		    {
		    	String perticular = driver.findElement(By.xpath("(//table[@class='StoryengineTable'])[1]/tbody/tr[1]/th["+i+"]")).getText();
		    	 System.out.print(perticular+" ");
		    }
		    System.out.println();
		    System.out.println("*");
		    //perticular player
		    for(int i=1;i<=5;i++) 
		    {
		    	String Aus = driver.findElement(By.xpath("(//table[@class='StoryengineTable'])[1]/tbody/tr[2]/td["+i+"]")).getText();
		    System.out.print(Aus+" ");
		    }
		    System.out.println();
		    System.out.println("*");
		    //print direct All Table
		    String DirectBody = driver.findElement(By.xpath("(//table[@class='StoryengineTable'])[1]/tbody")).getText();
		    System.out.println(DirectBody);
		    Thread.sleep(1000);
		
		

		    




	}

}
