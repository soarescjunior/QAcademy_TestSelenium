import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSelenium {

    WebDriver driver = new ChromeDriver();

    @Before
    public void abreBrowser() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/Claudio%20Soares%20Jr/Documents/Frames.html");
    }

    @Test
    public void testeIframe(){
        WebElement iframe =  driver.findElement(By.cssSelector("#singleframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.tagName("input")).sendKeys("TESTE IFRAME");

        //https://www.selenium.dev/documentation/webdriver/browser/frames/

    }

    @After
    public void fecharBrowser()  {
        driver.quit();
    }


}
