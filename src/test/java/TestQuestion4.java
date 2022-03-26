import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestQuestion4 {

    @Test
    public void test() {
// создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");
        //Открыть первый запрос
        $(byId("accordion__heading-3")).scrollTo().click();
        // Проверяем соответствует ли текст  вопроса
        $(byId("accordion__panel-3")).shouldHave(text("Только начиная с завтрашнего дня. Но скоро станем расторопнее.")).click();


    }
}

