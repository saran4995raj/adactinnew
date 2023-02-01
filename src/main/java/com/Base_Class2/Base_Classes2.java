package com.Base_Class2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Classes2 {

	public static WebDriver driver;
	
	 public static void browserlaunch(String browser) {
		 
		 if(browser.equalsIgnoreCase("edge")) {
			 System.setProperty("webdriver.edge.driver", ".src\\resource\\java\\driver\\msedgedriver.exe");
			 driver= new EdgeDriver();
		 }
		 else if(browser.equalsIgnoreCase("chrome"))
			 System.setProperty("webdriver.chrome.driver", ".\\src\\resource\\java\\driver\\chromedriver.exe");
			 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	 
	 public static void window_max() {
		 try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	 public static void getUrl(String url) {
		 try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	 
	 public static boolean elementIsDisplayed(WebElement element) {
     boolean displayed=false;
     try {
		displayed=element.isDisplayed();
	} catch (Exception e) {
		System.out.println("Element not displayed:"+e.getMessage());
	}
     return displayed;
	}
	 
	 public static boolean elementIsEnabled(WebElement element) {
		 boolean enabled=false;
                try {
					enabled = element.isEnabled();
				} catch (Exception e) {
					System.out.println("Element not Enabled:"+e.getMessage());
				}
				return enabled;
	}
	 
	 
	 
	 
	 public static void elementSendKeys(WebElement element, String value) {
		 
		 try {
			WebDriverWait wb=new WebDriverWait(driver, 20);
			 wb.until(ExpectedConditions.visibilityOfAllElements(element));
			 if(elementIsDisplayed(element)&&elementIsEnabled(element)) {
				 elementClear(element);
				 element.sendKeys(value);
			 }
			 else {
				 System.err.println("Unable to the sendkeys");
			 }
		} catch (Exception e) {
			System.out.println("Unable to pass the value:"+e.getMessage());
	}

	}

	  public static void elementClear(WebElement element) {
		  
		  try {
			element.clear();
		} catch (Exception e) {
			
		}

	}
	 public static void elementClick(WebElement element) {
		 try {
				WebDriverWait wb=new WebDriverWait(driver, 20);
				wb.until(ExpectedConditions.elementToBeClickable(element)).click();
			} catch (Exception e) {
				System.out.println("Unable to Click : "+e.getMessage());
		 
			}
	 }
	 
	 public static boolean elementSelected(WebElement element) {
			try {
				boolean selected = element.isSelected();
				return selected;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();

			}
		}
	

	 public static void getTitle(WebElement element) {
		   
		   try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	   
	   //getCurrenturl method
	   
	   public static void getCurrenturl(WebElement element) {
		   
		   try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
	}
	   
	   //getPageSource method
	   
	   public static void getPageSource(WebElement element) {
		   
		   try {
			driver.getPageSource();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	   
	   //getText method
	   
	   public static String   getText(WebElement element) {
    
		   String text=null;
		   try {
			text=element.getText();
			  
		} catch (Exception e) {
			e.printStackTrace();
		} return text;
	}
	   
	  
	   //window handles method
	   public static void windowhandle(String Exp_Title) { //get the title(ignore duplicate value)
		   
       Set<String> windowHandles= driver.getWindowHandles();
       for (String id :windowHandles ) {
     	  String Act_title=driver.switchTo().window(id).getTitle();
     	  if(Act_title.equals(Exp_Title)) {
     		  break;
     	  }
			
		}
	}
	   
	   //thread sleep method
	   
	   public static void ThreadSleepForMin(int sec) throws InterruptedException {
		   try {
			TimeUnit.MINUTES.sleep(sec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       
	}
	   
	   //Drop down method
	   
	   public static void SelectDropdown(WebElement element, String option,String value) {
		   Select sc=new Select(element);
		   if(option.equals("value")) {
			   sc.selectByValue(value);
		   }
		   else if(option.equals("text")) {
			   sc.selectByVisibleText(value);
		   }
		   else if(option.equals("index")) {
			   sc.selectByIndex(Integer.parseInt(value));
		   }
           
		   
	}
	   
	   public static void dragAndDrop(WebElement Source,WebElement Target) {
		   
		   Actions ac= new Actions(driver);
		   try {
			ac.dragAndDrop(Source,Target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
       
	}
	   
	   public static void RightClick(WebElement element) {
        
		   Actions ac=new Actions(driver);
		   try {
			ac.contextClick(element).build().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	   
	   //mousehover method
	   
	   public static void mousehover(WebElement element ) {
		
		   Actions act= new Actions(driver);
		   try {
			act.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
		   
	   }
	 
	   //element is selected method
	   
	   public static void elementisselected(WebElement element) {

		   boolean selected = element.isSelected();
		   
	    }
	   
	   //element is enabled method
	   
	   public static void elementisenabled(WebElement element) {
		   
          boolean enabled = element.isEnabled();
	    }
	   
	  
	
	   
	   //Robot method
	  public static void Robot_Down(int down) throws AWTException {
		  
		  Robot r=new Robot();
		  for(int i=0; i<down;i++) {
			  r.keyPress(KeyEvent.VK_DOWN);
			  r.keyRelease(KeyEvent.VK_DOWN);
		  }

	} 
	  
	  //alert methods
	  
	  public static void alert(WebElement element,String option,String value) {
		 try {
			 
		  if(option.equals("accept")) {
			   driver.switchTo().alert().accept();
		  }
		  else if(option.equals("dismiss")){
			   driver.switchTo().alert().dismiss();
		  }
		  
		  else if(option.equals("sendKeys")) {
		       element.sendKeys(value);
		  }
		  
		  else {
			  driver.switchTo().alert().getText();
		  
		  }
		  
		 }
		 catch(Exception e) {
			 System.out.println("Couldn't handle alert:"+e.getMessage());
		 } 
	  }
	   
	   public static  void mouse_Actions( WebElement element,String option) {
		   
		  
	}
	   
	   public static void moveToElement(WebElement element) {
		   
		    Actions ac= new Actions(driver);
		    try {
				ac.moveToElement(element).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	   
	   
	   //navigate methods
	   public static void navigate_to(String url) {
        
		   try {
			driver.navigate().to(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	   
	    public static void navigate_Back() {
	    	
	    	try {
				driver.navigate().back();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	    
	    public static void navigate_Forword() {
	    	
	    	try {
				driver.navigate().forward();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
 	    
	    public static void navigate_Refresh() {
	    	
	    	try {
				driver.navigate().refresh();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	    
	    //screenshot method
	    public static void screenshot(String path) throws IOException {
	    	
         TakesScreenshot ts=(TakesScreenshot) driver;
	    	File source = ts.getScreenshotAs(OutputType.FILE);
	    	File destination=new File(path);
	    	FileHandler.copy(source, destination);
		}
	    
	    
	    //wait method
	 public static void waitmethod() throws InterruptedException {
       
		 try {
			driver.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
	     }	    
	 
	 
	    
	    //close method
	    
	   public static void close() {
		   
		   driver.close();
	    }
	   
	    //quit method
	   
	   public static void quit() {
		   
		   driver.quit();
	     
}
}
	   


	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


