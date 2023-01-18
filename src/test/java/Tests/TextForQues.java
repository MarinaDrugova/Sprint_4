package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class TextForQues {
    private final WebDriver driver;
    public TextForQues(WebDriver driver) {
        this.driver = driver;
    }
    public String quesOneText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public String quesTwoText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public String quesThreeText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public String quesFourText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public String quesFiveText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public String quesSixText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public String quesSevenText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public String quesEightText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    private final By ansOne = By.xpath(".//div[@id='accordion__panel-0']/p");
    private final By ansTwo = By.xpath(".//div[@id='accordion__panel-1']/p");
    private final By ansThree = By.xpath(".//div[@id='accordion__panel-2']/p");
    private final By ansFour = By.xpath(".//div[@id='accordion__panel-3']/p");
    private final By ansFive = By.xpath(".//div[@id='accordion__panel-4']/p");
    private final By ansSix = By.xpath(".//div[@id='accordion__panel-5']/p");
    private final By ansSeven = By.xpath(".//div[@id='accordion__panel-6']/p");
    private final By ansEight = By.xpath(".//div[@id='accordion__panel-7']/p");
    public String getTextQuesOne() { // метод получения текста  вопроса 1
        return driver.findElement(ansOne).getAttribute("innerHTML");
    }
    public String getTextQuesTwo() { // метод получения текста  вопроса 2
        return driver.findElement(ansTwo).getAttribute("innerHTML");
    }
    public String getTextQuesThree() { // метод получения текста  вопроса 3
        return driver.findElement(ansThree).getAttribute("innerHTML");
    }
    public String getTextQuesFour() { // метод получения текста  вопроса 4
        return driver.findElement(ansFour).getAttribute("innerHTML");
    }
    public String getTextQuesFive() { // метод получения текста  вопроса 5
        return driver.findElement(ansFive).getAttribute("innerHTML");
    }
    public String getTextQuesSix() { // метод получения текста  вопроса 6
        return driver.findElement(ansSix).getAttribute("innerHTML");
    }
    public String getTextQuesSeven() { // метод получения текста  вопроса 7
        return driver.findElement(ansSeven).getAttribute("innerHTML");
    }
    public String getTextQuesEight() { // метод получения текста  вопроса 8
        return driver.findElement(ansEight).getAttribute("innerHTML");
    }
}