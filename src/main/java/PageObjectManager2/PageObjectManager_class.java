package PageObjectManager2;

import org.openqa.selenium.WebDriver;

import com.Base_Class2.Base_Classes2;
import com.Locator.BookPage;
import com.Locator.Loginpage;
import com.Locator.Searchpage;
import com.Locator.SelectHomePage;

public class PageObjectManager_class  extends Base_Classes2{

     public PageObjectManager_class(WebDriver xdriver) {
    	 
    	 this.driver=xdriver;
	}	
     
     private Loginpage login;
     private Searchpage search;
     private SelectHomePage selecthotel;
     private BookPage bookin;
     public Loginpage getLogin()
      {
    	 if(login==null)
    		 login = new Loginpage(driver);
		return login;
	}
	
	public Searchpage getSearch() {
		if(search==null)
			search = new Searchpage(driver);
		return search;
	}
	
	public SelectHomePage getSelecthotel() {
		if(selecthotel==null)
			selecthotel = new SelectHomePage(driver);
		return selecthotel;
	}
	
	public BookPage getBookin() {
		if(bookin==null)
			bookin= new BookPage(driver);
		return bookin;
	}
	

	
	
	
}
