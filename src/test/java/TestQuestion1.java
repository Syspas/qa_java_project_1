import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;

public class TestQuestion1 {

 //   @Test
 //   public void test() {
// создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
 //      open("https://qa-scooter.praktikum-services.ru/");
        //Открыть первый запрос
//        $(byId("accordion__heading-0")).scrollTo();
//        $(byId("accordion__heading-0")).should(exist).shouldBe(visible).click();

        // Проверяем соответствует ли текст  вопроса
  //      $(byId("accordion__panel-0")).should(exist).shouldBe(visible).shouldHave(text("Сутки — 400 рублей. Оплата курьеру — наличными или картой.")).click();


 //       assertTrue($(byId("accordion__heading-0")).isDisplayed());
//    }

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

