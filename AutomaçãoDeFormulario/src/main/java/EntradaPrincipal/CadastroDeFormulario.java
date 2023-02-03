package EntradaPrincipal;

import javax.swing.JScrollBar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class CadastroDeFormulario {

	private WebDriver driver;

	@Before
	public void PaginaWeb() {
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1552, 840));
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}

	@After
	public void Finaliza() {
//		driver.quit();
	}

	@Test
	public void Cadastro() {
//		Escrevendodentro do TextField!
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Fábio");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Souza");

//		Marcando o RadioButton!
		driver.findElement(By.id("sex-0")).click();
//		Marcando o Checkbox!
		driver.findElement(By.id("exp-1")).click();

//		Escrevendo dentro do TextArea!
		driver.findElement(By.id("datepicker")).sendKeys("Cadastro de fomulario");

//		Marcando o checkBox de Profissão!
		driver.findElement(By.id("profession-1")).click();

//		Marcando a Automação de ferramentas!
		driver.findElement(By.id("tool-2")).click();

		WebElement element = driver.findElement(By.id("continents"));
		Select continente = new Select(element);
		continente.selectByVisibleText("North America");

//		Selecão de Comandos!
		WebElement dropdown = driver.findElement(By.id("selenium_commands"));
		dropdown.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();

		// Rolagem vertical
//		js.executeScript("window.scrollTo(0,675.5555419921875)");

		// Clique em Enviar
		driver.findElement(By.id("submit")).click();

	}

}
