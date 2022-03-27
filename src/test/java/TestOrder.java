import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class TestOrder {
    private String incorrectOrderNum = "5";
   @Test
   public void checkingOrderStatus() {
       //Перейти по адресу
       Selenide.open("https://qa-scooter.praktikum-services.ru/");
       //Найти кнопку заказ и нажать на нее
       $(byClassName("Header_Link__1TAG7")).click();
       //Нажать на поле  "ввести номер заказа"
       $(byXpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")).click();
       //ввести номер закаа в поле "ввести номер заказа"
       $(byXpath("//input[@value='']")).sendKeys("10");
       // Нажать кнопку GO
       $(byXpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']")).click();
       //
       assertTrue($(byClassName("Track_NotFound__6oaoY")).isDisplayed());
   }
/*
    @Test
    public void checkingOrderStatus1() {


       //Перейти по адресу
        MainPage page =Selenide.open(MainPage.URL,MainPage.class);
        //Найти кнопку заказ и нажать на нее
      page.btnShowInputField.click();
        //Нажать на поле  "ввести номер заказа"
      page.inputOrderNum.click();
        //ввести номер закаа в поле "ввести номер заказа"
      page.btnFindOrder.sendKeys(incorrectOrderNum);
        // Нажать кнопку GO для поиска заказа.
//
   assertTrue($(byClassName("Track_NotFound__6oaoY")).isDisplayed());

  //  CheckStatusPage errorPage = new CheckStatusPage();
 //   assertTrue(errorPage.popupError.isDisplayed());
    }
*/
    @Test
    public void checkingOrderStatus2() {
        String incorrectOrderNum = "5";
        //Перейти по адресу
        MainPage page =Selenide.open(MainPage.URL,MainPage.class);
        //Найти кнопку заказ и нажать на нее
        page.clickShowInputField();
        //Нажать на поле  "ввести номер заказа"
        //ввести номер закаа в поле "ввести номер заказа"
        page.inputOrderNum(incorrectOrderNum);
        // Нажать кнопку GO для поиска заказа.
        page.clickFindOrder();
      //assertTrue($(byClassName("Track_NotFound__6oaoY")).isDisplayed());
        CheckStatusPage errorPage = new CheckStatusPage();
      assertTrue(errorPage.popupError.isDisplayed());
    }

    /*
    Тест на отбражение не существующего заказа
    Ожидаемый результат:
    Заказ ненайден.
    */
    @Test
    public void checkingOrderStatus3() {
        //Перейти по адресу
        boolean isErrorMessageDisplayed=Selenide.open(MainPage.URL,MainPage.class)
        //Найти кнопку заказ и нажать на нее
        .clickShowInputField()
        //Нажать на поле  "ввести номер заказа"
        //ввести номер закаа в поле "ввести номер заказа"
        .inputOrderNum(incorrectOrderNum)
        // Нажать кнопку GO для поиска заказа.
        .clickFindOrder()
        //Проверить сообщение
        .isErrorMessageDisplayed();
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isErrorMessageDisplayed);
    }
}
