import com.codeborne.selenide.Selenide;
import model.Customer;
import org.junit.Test;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.text;
import static org.junit.Assert.assertTrue;


public class TestOrder extends BaseTest {

    //Создаем обект покупатель с тестовыми данными
    Customer customer1 = Customer.getFirstCustomer();
    Customer customer2 = Customer.getSecondCustomer();

    /*
    Тест на создание заказка  с использование кпопки создать  вверху преложения.
     */
    @Test
    public void CheckingOrderTest1() {

        //Перейти по адресу
        OrderPage page = Selenide.open(OrderPage.URL, OrderPage.class);
        //Кнопка заказать на верху страницы
        page.orderButtonOnMainPageTop.click();
        //Имя
        page.nameField.sendKeys(customer1.getName());
        //Фамилия
        page.surnameField.sendKeys(customer1.getSurname());
        //ввести адрес
        page.deliveryAddressField.sendKeys(customer1.getAddress());
        //Выбрать станцию метро
        page.MetroStationField.sendKeys(Keys.DOWN);
        page.MetroStationField.pressEnter();
        //
        page.PhoneNumberField.sendKeys(customer1.getPhoneNumber());
        // Нажать на кнопку Далее
        page.nextButton.click();
        // Заполнение  поля дата
        page.dateReceiptScooter.sendKeys(customer1.getDateReceipt());
        page.dateReceiptScooter.pressEnter();
        //Заполнить данные в выпадающем списке
        page.scooterRentalPeriod.click();
        page.number2DaysScooterRental.click();
        // Установить  значение чет бокса
        page.checkboxBoxBlack.click();
        page.commentField.sendKeys(customer2.getComment());
        //Нажать на кнопку заказать
        page.orderButton.click();
        //Нажать "Да" на кнопку в окне оформить заказ
        page.yesButton.click();
        //Заказ оформлен , Проверяем что заказ оформлен ищем в окне текст
        page.findTextTheOrderHasBeenIssued.shouldHave(text("Заказ оформлен"));
    }

    /*
   Тест на создание заказка  с использование кпопки создать  по центру преложения.
    */
    @Test
    public void CheckingOrderTest2() {

        //Перейти по адресу
        OrderPage page = Selenide.open(OrderPage.URL, OrderPage.class);
        //прокрутить вниз и найти  кнопку "Заказать"
        page.orderButtonOnMainPageCenter.scrollTo();
        //Кнопка заказать на верху страницы
        page.orderButtonOnMainPageCenter.click();
        //Имя
        page.nameField.sendKeys(customer2.getName());
        //Фамилия
        page.surnameField.sendKeys(customer2.getSurname());
        //ввести адрес
        page.deliveryAddressField.sendKeys(customer2.getAddress());
        //Выбрать станцию метро
        page.MetroStationField.sendKeys(Keys.DOWN);
        page.MetroStationField.pressEnter();
        //
        page.PhoneNumberField.sendKeys(customer2.getPhoneNumber());
        // Нажать на кнопку Далее
        page.nextButton.click();
        // Заполнение  поля дата
        page.dateReceiptScooter.sendKeys(customer2.getDateReceipt());
        page.dateReceiptScooter.pressEnter();
        //Заполнить данные в выпадающем списке
        page.scooterRentalPeriod.click();
        page.number2DaysScooterRental.click();
        // Установить  значение чет бокса
        page.checkboxBoxBlack.click();
        page.commentField.sendKeys(customer2.getComment());
        //Нажать на кнопку заказать
        page.orderButton.click();
        //Нажать "Да" на кнопку в окне оформить заказ
        page.yesButton.click();
        //Заказ оформлен , Проверяем что заказ оформлен ищем в окне текст
        page.findTextTheOrderHasBeenIssued.shouldHave(text("Заказ оформлен"));
    }


    /*
    Тест на отбражение не существующего заказа
    Ожидаемый результат:
    Заказ ненайден.
    */
    @Test
    public void CheckingOrderStatus() {
        //Перейти по адресу
        boolean isErrorMessageDisplayed = Selenide.open(MainPage.URL, MainPage.class)
                //Найти кнопку заказ и нажать на нее
                .clickShowInputField()
                //Нажать на поле  "ввести номер заказа"
                //Ввести номер не существующего закаа в поле "ввести номер заказа"
                .inputOrderNum("5")
                //Нажать кнопку GO для поиска заказа.
                .clickFindOrder()
                //Проверить сообщение
                .isErrorMessageDisplayed();
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isErrorMessageDisplayed);


    }
}