package test;


import org.testng.annotations.Test;

import main.BasePage;
import main.FirstPage;
import main.SecondPage;

public class SecondPageTest extends BasePage{
	FirstPage firstpage;
	SecondPage secondpage;
	 public SecondPageTest() {
		 super();
		 firstpage=new FirstPage();
		 secondpage=new SecondPage();
	 }
	 @Test
	 public void test2() {
		 firstpage.gmailmethod();
		 secondpage.textmethod();
	 }
	 
	
}
