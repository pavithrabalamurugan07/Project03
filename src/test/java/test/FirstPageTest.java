package test;

import org.testng.annotations.Test;

import main.BasePage;
import main.FirstPage;
import main.SecondPage;

public class FirstPageTest extends BasePage {

	FirstPage firstpage;
	SecondPage secondpage;
	 public FirstPageTest() {
		 super();
		 firstpage=new FirstPage();
		 secondpage=new SecondPage();
	 }
	 
	 @Test
	 public void test1() {
		 firstpage.searchboxmethod("selenium");
		 //firstpage.enterboxmethod();
		 
	 }


}
