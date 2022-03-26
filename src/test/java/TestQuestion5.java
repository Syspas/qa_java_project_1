import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestQuestion5 {

    @Test
    public void test() {
// создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");
        //Открыть первый запрос
        $(byId("accordion__heading-4")).scrollTo().click();
        // Проверяем соответствует ли текст  вопроса
        $(byId("accordion__panel-4")).shouldHave(text("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.")).click();


    }
}

