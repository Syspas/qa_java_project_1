import com.codeborne.selenide.Selenide;
import model.Customer;
import org.junit.Test;
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

        boolean result = Selenide.open(OrderPage.URL, OrderPage.class)
                .clickOrderButtonOnMainPageTop().check(
                customer1.getName(),
                customer1.getSurname(),
                customer1.getAddress(),
                customer1.getPhoneNumber(),
                customer1.getDateReceipt(),
                customer1.getComment()
                );
        assertTrue(result);
    }

    /*
   Тест на создание заказка  с использование кпопки создать  по центру преложения.
    */
    @Test
    public void CheckingOrderTest2() {

        boolean result = Selenide.open(OrderPage.URL, OrderPage.class)
                .clickOrderButtonOnMainPageCenter().check(
                customer2.getName(),
                customer2.getSurname(),
                customer2.getAddress(),
                customer2.getPhoneNumber(),
                customer2.getDateReceipt(),
                customer2.getComment()
        );
        assertTrue(result);
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