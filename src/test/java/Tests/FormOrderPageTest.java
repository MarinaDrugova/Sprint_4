package Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.FormOrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class FormOrderPageTest {
    private static final String URL = "https://qa-scooter.praktikum-services.ru/order";
    public WebDriver driver;
    private final int numberOfButton;
    private final String name;
    private final String surname;
    private final String station;
    private final String address;
    private final String phone;
    private final String date;
    private final String time;
    private final String color;
    public FormOrderPageTest(int numberOfButton, String name,
                             String surname, String station, String address,
                             String phone, String date, String time, String color) {
        this.numberOfButton = numberOfButton;
        this.name = name;
        this.surname = surname;
        this.station = station;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.time = time;
        this.color = color;
    }
    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static  Object[] [] getOrderData(){
        return new  Object[][]{
                {0, "Анна", "Иванова", "Бульвар Рокоссовского", "Мира 2", "+79149350291", "12.02.2023", "сутки", "черный жемчуг"},
                {1, "Марина", "Гук", "Черкизовская", "Весенняя 1", "+79149348473", "13.02.2023", "сутки", "черный жемчуг"},
        };
    }
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void OrderScooter(){
        driver.get(FormOrderPageTest.URL);
        FormOrderPage formOrderPage = new FormOrderPage(driver);
        formOrderPage.clickCookieButton();
        formOrderPage.clickSearchOrderButton(numberOfButton);
        formOrderPage.dataForm(name,surname,address);
        formOrderPage.selectSubwayStationField(station);
        formOrderPage.enterFieldPhoneInput(phone);
        formOrderPage.clickSearchNextButton();
        formOrderPage.selectFieldDateBringScooter(date);
        formOrderPage.selectFieldTimeRent(time);
        formOrderPage.selectFieldColorScooter(color);
        formOrderPage.clickFinishOrderButton();
        formOrderPage.clickSearchYesButton();
        boolean isOrderNumberImageDisplayed = formOrderPage.isOrderNumberImageDisplayed();
        assertTrue("Номер заказа не появился", isOrderNumberImageDisplayed);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}