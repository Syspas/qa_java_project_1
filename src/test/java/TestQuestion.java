import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestQuestion  extends BaseTest {


    @Test
    public void TestQuestion1() {

        boolean isGoodTest = Selenide.open(MainPage.URL, MainPage.class)
                //Открыть первый запрос
                .scroll(MainPage.getQuestion0())
                //Проверяем соответствует ли текст  вопроса
                 .check(MainPage.getQuestion0(),MainPage.getAnswer0(),MainPage.getAnswerText0());

        //Запускаем проверку  если переменная true то тест пройден
                 assertTrue(isGoodTest);


    }

    @Test
    public void TestQuestion2() {

        boolean isGoodTest = Selenide.open(MainPage.URL, MainPage.class)
                //Открыть первый запрос
                .scroll(MainPage.getQuestion1())
                //Проверяем соответствует ли текст  вопроса
                .check(MainPage.getQuestion1(),MainPage.getAnswer1(),MainPage.getAnswerText1());

        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isGoodTest);


    }

    @Test
    public void TestQuestion3() {

        boolean isGoodTest = Selenide.open(MainPage.URL, MainPage.class)
                //Открыть первый запрос
                .scroll(MainPage.getQuestion2())
                //Проверяем соответствует ли текст  вопроса
                .check(MainPage.getQuestion2(),MainPage.getAnswer2(),MainPage.getAnswerText2());

        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isGoodTest);


    }

    @Test
    public void TestQuestion4() {

        boolean isGoodTest = Selenide.open(MainPage.URL, MainPage.class)
                //Открыть первый запрос
                .scroll(MainPage.getQuestion3())
                //Проверяем соответствует ли текст  вопроса
                .check(MainPage.getQuestion3(),MainPage.getAnswer3(),MainPage.getAnswerText3());

        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isGoodTest);


    }

    @Test
    public void TestQuestion5() {

        boolean isGoodTest = Selenide.open(MainPage.URL, MainPage.class)
                //Открыть первый запрос
                .scroll(MainPage.getQuestion5())
                //Проверяем соответствует ли текст  вопроса
                .check(MainPage.getQuestion5(),MainPage.getAnswer5(),MainPage.getAnswerText5());

        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isGoodTest);


    }

    @Test
    public void TestQuestion6() {

        boolean isGoodTest = Selenide.open(MainPage.URL, MainPage.class)
                //Открыть первый запрос
                .scroll(MainPage.getQuestion5())
                //Проверяем соответствует ли текст  вопроса
                .check(MainPage.getQuestion5(),MainPage.getAnswer5(),MainPage.getAnswerText5());

        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isGoodTest);


    }

    @Test
    public void TestQuestion7() {

        boolean isGoodTest = Selenide.open(MainPage.URL, MainPage.class)
                //Открыть первый запрос
                .scroll(MainPage.getQuestion7())
                //Проверяем соответствует ли текст  вопроса
                .check(MainPage.getQuestion7(),MainPage.getAnswer7(),MainPage.getAnswerText7());

        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isGoodTest);


    }

}
