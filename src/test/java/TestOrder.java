import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class TestOrder {

   @Test
   public void checkingOrderStatus() {
       // Перейти по адресу
       Selenide.open("https://qa-scooter.praktikum-services.ru/");
       //Найти кнопку заказ  и нажать на нее
       $(byClassName("Header_Link__1TAG7")).click();
       //Нажать на поле  "ввести номер заказа"
       $(byXpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")).click();
       // $(byXpath("//input[@value='']")).click();
       //ввести номер закаа в поле "ввести номер заказа"
       $(byXpath("//input[@value='']")).sendKeys("10");
       // Нажать кнопку GO
       $(byXpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']")).click();

       assertTrue($(byClassName("Track_NotFound__6oaoY")).isDisplayed());
   }
}
