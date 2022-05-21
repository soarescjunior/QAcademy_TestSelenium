import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Instant;

public class exercicioSeleniumWebDreiver {

    //elementosDaPagina elementosDaPagina = new elementosDaPagina();

    WebDriver driver = new ChromeDriver();

    @Before
    public void abrirBrowser() throws InterruptedException {

       // driver.get("http://demo.automationtesting.in/Register.html");
        driver.get("file:///C:/Users/Claudio%20Soares%20Jr/Documents/SiteDemo.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testDeInclusao() throws InterruptedException {

        //Exercicio 01
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Claudio");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ferreira");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Rua: ABC");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("text@text.com.br");
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("11984846886");

        //Exercicio 02
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        Assert.assertTrue("Selecionado", driver.findElement(By.xpath("//input[@value='Male']")).isSelected());

        //Exercicio 03
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        Assert.assertTrue("Selecionado", driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected());

        //Exercicio 04
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Portuguese')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Hobbies')]")).click();
        driver.findElement(By.id("Skills")).click();
        driver.findElement(By.xpath("//option[@value='Android']")).click();
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Hong Kong" + Keys.ENTER);
        driver.findElement(By.id("yearbox")).click();
        driver.findElement(By.xpath("//option[@value='1989']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
        driver.findElement(By.xpath("//option[@value='November']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
        driver.findElement(By.xpath("//option[@value='16']")).click();
        driver.findElement(By.id("firstpassword")).sendKeys("12345678");
        driver.findElement(By.id("secondpassword")).sendKeys("12345678");
        driver.findElement(By.id("secondpassword")).sendKeys("submitbtn");

    }
        @After

        public void fecharBroweser() {
            driver.quit();

        }


    }
