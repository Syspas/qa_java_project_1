import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.text;



public class CreateOrder extends BaseTest {


    @Test
    public void CheckingOrder() {

        //Перейти по адресу
        OrderPage page = Selenide.open(OrderPage.URL,OrderPage.class);
        page.orderButtonOnMainPageTop.click();
        //Имя
        page.nameField.sendKeys("Петр");
        //Фамилия
        page.surnameField.sendKeys("Иванов");
        //ввести адрес
        page.deliveryAddressField.sendKeys("г Москва ул.Пушкина");
       //Выбрать станцию метро
        page.MetroStationField.sendKeys(Keys.DOWN);
        page.MetroStationField.pressEnter();
       //
        page.PhoneNumberField.sendKeys("+79788682345");
       // Нажать на кнопку Далее
        page.nextButton.click();
       // Заполнение  поля дата
        page.dateReceiptScooter.sendKeys("29.03.2022");
        page.dateReceiptScooter.pressEnter();
      //Заполнить данные в выпадающем списке
        page.scooterRentalPeriod.click();
        page.number2DaysScooterRental.click();
       // Установить  значение чет бокса
        page.checkboxBoxBlack.click();
        page.commentField.sendKeys("тест комент");
        //Нажать на кнопку заказать
        page.orderButton.click();
        //Нажать "Да" на кнопку в окне оформить заказ
        page.yesButton.click();
        //Заказ оформлен , Проверяем что заказ оформлен ищем в окне текст
        page.findTextTheOrderHasBeenIssued.shouldHave(text("Заказ оформлен"));
    }


}
