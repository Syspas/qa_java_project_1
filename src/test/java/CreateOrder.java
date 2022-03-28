import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CreateOrder {
    @Test
    public void CheckingOrderStatus() {
        //Перейти по адресу
        open("https://qa-scooter.praktikum-services.ru/");
        //Найти кнопку заказ  и нажать на нее
        $(byClassName("Button_Button__ra12g")).click();
        //Нажать на поле  "ввести номер заказа"
        $(byXpath( "//input[@placeholder='* Имя']")).sendKeys("Петр");
        //
        $(byXpath( "//input[@placeholder='* Фамилия']")).sendKeys("Иванов");
        //
        $(byXpath( "//input[@placeholder='* Адрес: куда привезти заказ']")).sendKeys("г Москва ул.Пушкина");
       //
       $(byXpath("//input[@placeholder='* Станция метро']")).sendKeys(Keys.DOWN);
        $(byXpath("//input[@placeholder='* Станция метро']")).pressEnter();
       //
       $(byXpath("//input[@placeholder='* Телефон: на него позвонит курьер']")).sendKeys("+79788682345");
       // Нажать на кнопку Далее
       $(byXpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
       // Заполнение  поля дата
       $(byXpath( "//input[@placeholder='* Когда привезти самокат']")).sendKeys("29.03.2022");
      $(byXpath( "//input[@placeholder='* Когда привезти самокат']")).pressEnter();
      //Заполнить данные в выпадающем списке
       // $(byXpath(  "//*/text()[normalize-space(.)='* Срок аренды']/parent::*")).click();
     // $(byXpath(  "//*/text()[normalize-space(.)='* Срок аренды']/parent::*")).setValue("сутки");
     // $(byXpath(  "//*/text()[normalize-space(.)='* Срок аренды']/parent::*")).pressEnter();
       // Установить  значение чет бокса
        $(byXpath( "//input[@id='black']" )).click();
        $(byXpath( "//input[@placeholder='Комментарий для курьера']")).sendKeys("тест комент");


        // нажать на кнопку заказать
        $(byXpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
    }


}
