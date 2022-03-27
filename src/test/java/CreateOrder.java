import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;


public class CreateOrder {
    private String incorrectOrderNum = "5";

    /*
    Тест на отбражение не существующего заказа
    Ожидаемый результат:
    Заказ ненайден.
    */
    @Test
    public void CheckingOrderStatus() {
        //Перейти по адресу
        Selenide.open("https://qa-scooter.praktikum-services.ru/");
        //Найти кнопку заказ  и нажать на нее
        $(byClassName("Button_Button__ra12g")).click();
        //Нажать на поле  "ввести номер заказа"
        $(byXpath( "//input[@placeholder='* Имя']")).sendKeys("Петр");
        $(byXpath( "//input[@placeholder='* Фамилия']")).sendKeys("Иванов");
//
         $(byXpath( "//input[@placeholder='* Адрес: куда привезти заказ']")).sendKeys("г Москва ул.Пушкина");
       //
       $(byXpath("//input[@placeholder='* Станция метро']")).setValue("Бульвар Рокоссовского").pressEnter();

      // $(byXpath("//input[@placeholder='* Телефон: на него позвонит курьер']")).sendKeys("+79788682345");

      //  Input_Input__1iN_Z Input_Responsible__1jDKN
       // Нажать на кнопку Далее
     //  $(byXpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
       //


        //
   //    $(byXpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();

       // $(byXpath("//input[placeholder='* Когда привезти самокат']")).shouldBe(visible);
      // $(byXpath("//input[placeholder='* Когда привезти самокат']")).sendKeys("27.04.2022");



        // $(byXpath("//input[@value='']")).click();
        //ввести номер закаа в поле "ввести номер заказа"
       // $(byXpath("//input[@value='']")).sendKeys("10");
        // Нажать кнопку GO
       // $(byXpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']")).click();

      //  assertTrue($(byClassName("Track_NotFound__6oaoY")).isDisplayed());
    }
}
