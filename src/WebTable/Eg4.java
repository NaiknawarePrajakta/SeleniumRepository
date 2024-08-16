package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?q=ind+vs+aus+scorecard&oq=ind+vs+aus+scorecard&gs_lcrp=EgZjaHJvbWUqBwgAEAAYgAQyBwgAEAAYgAQyCggBEAAYsQMYgAQyBwgCEAAYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEAAYgAQyBwgGEAAYgAQyBwgHEAAYgAQyBwgIEAAYgAQyBwgJEAAYgATSAQg3MDIxajBqN6gCALACAA&sourceid=chrome&ie=UTF-8#sie=m;/g/11lctdvt3z;5;/m/026y268;cms;fp;1;;;");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		System.out.println("");
		int sizeOfBatting = driver.findElements(By.xpath("(//table[contains(@class,'imspo_tps__tb')])[3]/thead/tr/th")).size();
		System.out.println("Size of Batting Order "+sizeOfBatting);
		System.out.println("");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		for(int i=1;i<=7;i++) 
		{
          String mytext = driver.findElement(By.xpath("(//table[contains(@class,'imspo_tps__tb')])[3]/thead/tr/th["+i+"]")).getText();
          System.out.print(mytext+" ");
		}
		System.out.println();
		System.out.println("");
    
		int BattingSize = driver.findElements(By.xpath("(//table[contains(@class,'imspo_tps__tb')])[3]/tbody")).size();
		System.out.println(BattingSize);
		
		for(int j=1;j<=4;j++) 
	    {
			String Warner = driver.findElement(By.xpath("(//table[contains(@class,'imspo_tps__tb')])[3]/tbody[1]/tr["+j+"]")).getText();
		    System.out.print(Warner);
	    }
	    System.out.println();
	    System.out.println("");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	    for(int i=1;i<=sizeOfBatting;i++) 
	    {
	    	String alltext = driver.findElement(By.xpath("(//table[contains(@class,'imspo_tps__tb')])[3]/tbody["+i+"]")).getText();
	    	 System.out.println(alltext);
	    }
	    System.out.println();





        

	}

}
