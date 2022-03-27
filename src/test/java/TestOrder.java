import com.codeborne.selenide.Selenide;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestOrder {
    private String incorrectOrderNum = "5";

    /*
    Тест на отбражение не существующего заказа
    Ожидаемый результат:
    Заказ ненайден.
    */
    @Test
    public void CheckingOrderStatus() {
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
