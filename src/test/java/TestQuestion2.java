import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestQuestion2 {

    @Test
    public void test() {
// создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");
        //Открыть первый запрос
        $(byId("accordion__heading-1")).scrollTo();
        $(byId("accordion__heading-1")).click();
        // Проверяем соответствует ли текст  вопроса
        $(byId("accordion__panel-1")).shouldHave(text("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.")).click();

    }
}

