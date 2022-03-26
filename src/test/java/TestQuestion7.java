import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestQuestion7 {

    @Test
    public void test() {
// создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");
        //Открыть первый запрос
        $(byId("accordion__heading-6")).scrollTo().click();
        // Проверяем соответствует ли текст  вопроса
        $(byId("accordion__panel-6")).shouldHave(text("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.")).click();


    }
}

