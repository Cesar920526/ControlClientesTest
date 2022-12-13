package co.edu.univalle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HolaSpringApplicationTests {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement usuario;
		WebElement contrasena;
		WebElement login;
		WebDriverWait wait10 = new WebDriverWait(driver, 10);
		String title, currentUrl;

		driver.get("http://localhost:8086/login");

		title = driver.getTitle();
		System.out.println("El titulo de la pagina es = " + title);
		
		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		usuario = driver.findElement(By.name("username"));
		usuario.clear();
		usuario.sendKeys("admin");

		contrasena = driver.findElement(By.name("password"));
		contrasena.clear();
		contrasena.sendKeys("123");

		login = driver.findElement(By.id("btnLogin"));
		login.submit();
		wait10.until(
				ExpectedConditions.presenceOfElementLocated(
						By.id("btnAgregar")
				)
		);

		title = driver.getTitle();
		System.out.println("title = " + title);

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);
	}

}
