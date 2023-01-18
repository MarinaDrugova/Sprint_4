package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
public class Question {
    private final WebDriver driver;
    private final By cookieButton = By.id("rcc-confirm-button");// закрыть куки
    private final By searchOrderButtonUp = By.xpath(".//div[contains(@class,'Header_Nav')]/button[@class='Button_Button__ra12g']");
    private final By searchOrderButtonDown = By.xpath(".//div[contains(@class,'Home_FinishButton__1_cWm')]/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private final By quesOne = By.xpath(".//div[@aria-controls='accordion__panel-0']");
    private final By quesTwo = By.xpath(".//div[@aria-controls='accordion__panel-1']");
    private final By quesThree = By.xpath(".//div[@aria-controls='accordion__panel-2']");
    private final By quesFour = By.xpath(".//div[@aria-controls='accordion__panel-3']");
    private final By quesFive = By.xpath(".//div[@aria-controls='accordion__panel-4']");
    private final By quesSix = By.xpath(".//div[@aria-controls='accordion__panel-5']");
    private final By quesSeven = By.xpath(".//div[@aria-controls='accordion__panel-6']");
    private final By quesEight = By.xpath(".//div[@aria-controls='accordion__panel-7']");
    public Question(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }
    public void scrollQues() {//скролл до вопросов
        WebElement element = driver.findElement(By.xpath(".//div[@id='accordion__heading-0']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickQuesOne() {//кликнуть по вопросу 1
        driver.findElement(quesOne).click();
    }
    public void clickQuesTwo() {//кликнуть по вопросу 2
        driver.findElement(quesTwo).click();
    }
    public void clickQuesThree() {//кликнуть по вопросу 3
        driver.findElement(quesThree).click();
    }
    public void clickQuesFour() {//кликнуть по вопросу 4
        driver.findElement(quesFour).click();
    }
    public void clickQuesFive() {//кликнуть по вопросу 5
        driver.findElement(quesFive).click();
    }
    public void clickQuesSix() {//кликнуть по вопросу 6
        driver.findElement(quesSix).click();
    }
    public void clickQuesSeven() {//кликнуть по вопросу 7
        driver.findElement(quesSeven).click();
    }
    public void clickQuesEight() {//кликнуть по вопросу 8
        driver.findElement(quesEight).click();
    }

    private void clickSearchOrderButton(int numberOfButton) {//выбрать верхнюю или нижнюю кнопку "Заказать"
        if (numberOfButton == 0) {
            driver.findElement(searchOrderButtonUp).click();
        } else if (numberOfButton == 1) {
            WebElement element = driver.findElement(searchOrderButtonDown);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
            driver.findElement(searchOrderButtonDown).click();
        }
    }
}