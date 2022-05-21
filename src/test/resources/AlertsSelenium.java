import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsSelenium {

    WebDriver driver = new ChromeDriver();

    @Before
    public void abrirBrowser() throws InterruptedException {

        // driver.get("http://demo.automationtesting.in/Register.html");
        driver.get("file://C:/Users/Claudio%20Soares%20Jr/Documents/Alerts.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testDeAlertsSimples() {

        driver.findElement(By.xpath("//*[contains(text(),'SwitchTo')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
        driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        String txt = driver.switchTo().alert().getText();
        Assert.assertEquals(txt, "I am an alert box!");
        driver.switchTo().alert().accept();
    }

    @Test
    public void testDeAlertsCompostoCancelar() {

        driver.findElement(By.xpath("//*[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'click the button to display a confirm box ')]")).click();
        String txt = driver.switchTo().alert().getText();
        Assert.assertEquals(txt, "Press a Button !");
        driver.switchTo().alert().dismiss();
    }

    @Test
    public void testDeAlertsCompostoInserirConteudo()  {

        driver.findElement(By.xpath("//*[contains(text(),'Alert with Textbox ')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'click the button to demonstrate the prompt box')]")).click();
        driver.switchTo().alert().sendKeys("Texto");
        driver.switchTo().alert().accept();
        String TextoDaTela;
        TextoDaTela = "Hello Texto How are you today";
        Assert.assertEquals(TextoDaTela, "Hello Texto How are you today");
    }

    @After
    public void fecharBroweser() {
        driver.quit();

    }

}
