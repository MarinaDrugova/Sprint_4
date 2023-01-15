package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Question;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import java.time.Duration;


public class QuestionTest {
    private static final String URL = "https://qa-scooter.praktikum-services.ru";
        public WebDriver driver;
        public String quesOneText;
    public String quesTwoText;
    public String quesThreeText;
    public String quesFourText;
    public String quesFiveText;
    public String quesSixText;
    public String quesSevenText;
    public String quesEightText;

        public void QuestionsTest(String quesOneText, String quesTwoText, String quesThreeText, String quesFourText, String quesFiveText, String quesSevenText,String quesEightText) {
            this.quesOneText = quesOneText;
            this.quesTwoText = quesTwoText;
            this.quesThreeText = quesThreeText;
            this.quesFourText = quesFourText;
            this.quesFiveText = quesFiveText;
            this.quesSixText = quesSixText;
            this.quesSevenText = quesSevenText;
            this.quesEightText = quesEightText;

        }



        @Before
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        @Test
        public void checkQuestion() {
            driver.get(QuestionTest.URL);
            Question question = new Question(driver);
            question.clickCookieButton(); //закрыть куки
            question.scrollQues();//прокрутить скролл
            question.clickQuesOne(); //кликнуть по вопрос 1
            assertEquals(question.quesOneText, question.getTextQuesOne());//сравнить соответствие вопроса и ответа 1
            question.clickQuesTwo(); //кликнуть по вопрос 2
            assertEquals(question.quesTwoText, question.getTextQuesTwo());//сравнить соответствие вопроса и ответа 2
            question.clickQuesThree(); //кликнуть по вопрос 3
            assertEquals(question.quesThreeText, question.getTextQuesThree());//сравнить соответствие вопроса и ответа 3
            question.clickQuesFour();  //кликнуть по вопрос 4
            assertEquals(question.quesFourText, question.getTextQuesFour());//сравнить соответствие вопроса и ответа 4
            question.clickQuesFive();//кликнуть по вопрос 5
            assertEquals(question.quesFiveText, question.getTextQuesFive());//сравнить соответствие вопроса и ответа 5
            question.clickQuesSix();
            assertEquals(question.quesSixText, question.getTextQuesSix());//сравнить соответствие вопроса и ответа 6
            question.clickQuesSeven();
            assertEquals(question.quesSevenText, question.getTextQuesSeven());//сравнить соответствие вопроса и ответа 7
            question.clickQuesEight();
            assertEquals(question.quesEightText, question.getTextQuesEight());//сравнить соответствие вопроса и ответа 8

        }
        @After
        public void tearDown() {
            driver.quit();
        }
    }





