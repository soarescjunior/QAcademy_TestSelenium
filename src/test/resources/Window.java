import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

    WebDriver driver = new ChromeDriver();

    @Before
    public void abrirBrowser() throws InterruptedException {

        // driver.get("http://demo.automationtesting.in/Register.html");
        driver.get("file://C:/Users/Claudio%20Soares%20Jr/Documents/Window.html");
        driver.manage().window().maximize();
    }

    @Test
    public void abrirAba(){

        driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
        Object[] aba = driver.getWindowHandles().toArray();
        driver.switchTo().window(aba[1].toString());
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.selenium.dev/"));

    }

    @Test
    public void abrirNovaJanlea(){
        driver.findElement(By.xpath("//*[contains(text(),'Open New Seperate Windows')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Object[] janelas = driver.getWindowHandles().toArray();
        driver.switchTo().window(janelas[1].toString());
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.selenium.dev/"));
    }


    @Test
    public void abrirMultiplasJanelas(){
        driver.findElement(By.xpath("//*[contains(text(),'Open Seperate Multiple Windows')]")).click();
        driver.findElement(By.xpath("//button[@onclick='multiwindow()']")).click();
        Object[] janelas = driver.getWindowHandles().toArray();
        driver.switchTo().window(janelas[1].toString());
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.selenium.dev/"));
        driver.switchTo().window(janelas[2].toString());
        Assert.assertTrue(driver.getCurrentUrl().equals("file:///C:/Users/Claudio%20Soares%20Jr/Documents/Index.html"));

    }

    @After

    public void fecharBroweser() {
        driver.quit();

    }


}
