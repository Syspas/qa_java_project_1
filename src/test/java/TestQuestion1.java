import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Condition.*;

import static org.junit.Assert.assertTrue;

public class TestQuestion1 {

    @Test
    public void test1() {
// создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        MainPage page =Selenide.open(MainPage.URL,MainPage.class);
        //
        page.question0.scrollTo();
        //Открыть первый запрос
        page.question0.should(exist).shouldBe(visible).click();
        // Проверяем соответствует ли текст  вопроса
        page.answer0.should(exist).shouldBe(visible).shouldHave(text("Сутки — 400 рублей. Оплата курьеру — наличными или картой.")).click();

        assertTrue((page.answer0).isDisplayed());
    }
}

