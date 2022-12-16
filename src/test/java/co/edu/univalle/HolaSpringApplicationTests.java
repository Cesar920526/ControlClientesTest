package co.edu.univalle;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class HolaSpringApplicationTests {

	private static WebDriver driver = null;

	public HolaSpringApplicationTests(){

	}

	@BeforeClass
	public static void inicializarTest(){
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void cerrarTest(){
		driver.quit();
	}

	@Test
	public void pruebasDeFuncionalidad() throws InterruptedException {
		WebElement element;
		String title, currentUrl;
		WebDriverWait wait = new WebDriverWait(driver, 20);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src, dst;

		//Carga del sistema

		driver.get("http://localhost:8086/login");
		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenInicial.png");

		cargaImagen(src, dst);

		title = driver.getTitle();
		System.out.println("El titulo de la pagina es = " + title);

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		//Prueba de ingreso login

		element = driver.findElement(By.name("username"));
		element.clear();
		element.sendKeys("admin");

		element = driver.findElement(By.name("password"));
		element.clear();
		element.sendKeys("123");

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenLogin.png");

		cargaImagen(src, dst);

		element = driver.findElement(By.id("btnLogin"));
		element.submit();

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenIngresoLogin.png");

		cargaImagen(src, dst);

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		//Prueba de agregar persona

		element = driver.findElement(By.id("btnAgregar"));
		element.click();

		element = driver.findElement(By.name("nombre"));
		element.clear();
		element.sendKeys("Keren");

		element = driver.findElement(By.name("apellido"));
		element.clear();
		element.sendKeys("Benavides");

		element = driver.findElement(By.name("email"));
		element.clear();
		element.sendKeys("keren.benavides@correounivalle.edu.co");

		element = driver.findElement(By.name("telefono"));
		element.clear();
		element.sendKeys("3164183181");

		element = driver.findElement(By.name("saldo"));
		element.clear();
		element.sendKeys("50000");

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenAgregar.png");

		cargaImagen(src, dst);

		element = driver.findElement(By.id("btnGuardar"));
		element.click();

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenAgregar2.png");

		cargaImagen(src, dst);

		title = driver.getTitle();
		System.out.println("title = " + title);

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		//Prueba de Editar

		element = driver.findElement(By.id("btnEditar"));
		element.click();

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		element = driver.findElement(By.id("nombre"));
		element.clear();
		element.sendKeys("Keren A");

		element = driver.findElement(By.name("apellido"));
		element.clear();
		element.sendKeys("Benavides");

		element = driver.findElement(By.name("email"));
		element.clear();
		element.sendKeys("keren.benavides@correounivalle.edu.co");

		element = driver.findElement(By.name("telefono"));
		element.clear();
		element.sendKeys("3164183181");

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenEditar.png");

		cargaImagen(src, dst);

		element = driver.findElement(By.id("btnGuardar"));
		element.click();

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenEditar2.png");

		cargaImagen(src, dst);

		title = driver.getTitle();
		System.out.println("title = " + title);

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		//Prueba de Eliminar

		element = driver.findElement(By.id("btnEliminar"));
		element.click();

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenEliminar.png");

		cargaImagen(src, dst);

		currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl = " + currentUrl);

		//Prueba de salir del sistema

		element = driver.findElement(By.id("btnSalir"));
		element.click();

		src = ts.getScreenshotAs(OutputType.FILE);
		dst = new File(".\\src\\main\\resources\\imagenesselenium\\imagenSalir.png");

		cargaImagen(src, dst);
	}

	private static void cargaImagen(File src, File dst){
		try {
			FileUtils.copyFile(src, dst);
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
