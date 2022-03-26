import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestQuestion3 {

    @Test
    public void test() {
// создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-scooter.praktikum-services.ru/");
        //Открыть первый запрос
        $(byId("accordion__heading-2")).scrollTo().click();
        // Проверяем соответствует ли текст  вопроса
        $(byId("accordion__panel-2")).shouldHave(text("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.")).click();

    }
}

