package org.example;
import org.openqa.selenium.*;
public class FormOrderPage {
    private final WebDriver driver;
    private final By cookieButton = By.id("rcc-confirm-button");
    private final By searchOrderButtonUp = By.xpath(".//div[contains(@class,'Header_Nav')]/button[@class='Button_Button__ra12g']");
    private final By fieldNameInput = By.xpath(".//input[@placeholder = '* Имя']");
    private final By fieldSurnameInput = By.xpath(".//input[@placeholder = '* Фамилия']");
    private final By fieldAddressInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private final By subwayStationField = By.xpath(".//input[@class='select-search__input']");
    private final By fieldPhoneInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private final By searchNextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By fieldDateBringScooter = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private final By fieldTimeRent = By.xpath(".//div[@class='Dropdown-placeholder']");
    private final By fieldColorScooter = By.xpath(".//input[@id='black']");
    private final By searchOrderButtonDown = By.xpath(".//div[contains(@class,'Home_FinishButton__1_cWm')]/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By finishOrderButton = By.xpath(".//div[contains(@class,'Order_Buttons__1xGrp')]/button[text()='Заказать']");
    private final By searchYesButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and (text() = 'Да')]");
    private final  By orderNumberImage = By.xpath(".//button[@class='Order_Modal__YZ-d3']");
    public  FormOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
    public void clickSearchOrderButton
            (int numberOfButton) {//выбрать верхнюю или нижнюю кнопку "Заказать"
        if (numberOfButton == 0) {
            driver.findElement(searchOrderButtonUp).click();
        }else if (numberOfButton == 1) {
            WebElement element = driver.findElement(By.xpath(".//div[contains(@class,'Order_Buttons__1xGrp')]/button[text()='Заказать']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            driver.findElement(searchOrderButtonDown).click();
        }
    }
    public void enterFieldNameInput(String name) {//ввести имя заказчика
        driver.findElement(fieldNameInput).sendKeys(name);
    }
    public void enterFieldSurnameInput(String surname) {//ввести фамилию заказчика
        driver.findElement(fieldSurnameInput).sendKeys(surname);
    }
    public void enterFieldAddressInput(String address) {//ввести адрес заказчика
        driver.findElement(fieldAddressInput).sendKeys(address);
    }
    public void dataForm (String name, String surname,String address) {
        enterFieldNameInput(name);
        enterFieldSurnameInput(surname);
        enterFieldAddressInput(address);
    }
    public void selectSubwayStationField(String station) {//выбрать требуемую станцию метро
        driver.findElement(subwayStationField).click();
        driver.findElement(subwayStationField).sendKeys(station);
        driver.findElement(subwayStationField).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void enterFieldPhoneInput(String text) {//ввести сотовый заказчика
        driver.findElement(fieldPhoneInput).sendKeys(text);
    }
    public void clickSearchNextButton() {//нажать кнопку "Далее"
        driver.findElement(searchNextButton).click();
    }
    public void selectFieldDateBringScooter(String text) {//ввести дату привозки самоката
        driver.findElement(fieldDateBringScooter).click();
        driver.findElement(fieldDateBringScooter).sendKeys(text, Keys.ENTER);
    }
    public void selectFieldTimeRent(String time) {//на сколько суток нужен самокат
        driver.findElement(fieldTimeRent).click();
        driver.findElement(By.xpath(".//div[@class='Dropdown-menu']/div[text()='" +time+"']")).click();
    }
    public void selectFieldColorScooter(String text) {//выбрать цвет самоката
        driver.findElement(fieldColorScooter).click();
        driver.findElement(fieldColorScooter).sendKeys(text, Keys.ENTER);
    }
    public void clickFinishOrderButton() {//нажать на кнопку "Заказать"
        driver.findElement(finishOrderButton).click();
    }
    public void clickSearchYesButton() {//нажать на кнопку "Да" в окне оформления заказа
        driver.findElement(searchYesButton).click();
    }
    public  boolean isOrderNumberImageDisplayed() {//увидеть и записать номер оформленного закзаа
        return driver.findElement(orderNumberImage).isDisplayed();
    }
}
