import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderPage {
///Найти кнопку заказ  и нажать на нее
   @FindBy(how = How.CLASS_NAME,using = "Button_Button__ra12g")
   public static SelenideElement orderButtonOnMainPageTop;
    //Имя
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Имя']")
    public static SelenideElement nameField;
    //Фамилия
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Фамилия']")
    public static SelenideElement surnameField;
    //ввести адрес
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Адрес: куда привезти заказ']")
    public static SelenideElement deliveryAddressField;
    //* Станция метро
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Станция метро']")
    public static SelenideElement MetroStationField;
    //
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Телефон: на него позвонит курьер']")
    public static SelenideElement PhoneNumberField;
    //Кнопка Далее
    @FindBy(how = How.XPATH,using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    public static SelenideElement nextButton;
    // Заполнение  поля дата
    //Дата получения самоката
    @FindBy(how = How.XPATH,using = "//input[@placeholder='* Когда привезти самокат']")
    public static SelenideElement dateReceiptScooter;
    //Заполнить данные в выпадающем списке
    @FindBy(how = How.XPATH,using = "//*/text()[normalize-space(.)='* Срок аренды']/parent::*")
    public static SelenideElement scooterRentalPeriod;
    //Спрок аренды Двое суток
    @FindBy(how = How.XPATH,using = "//*/text()[normalize-space(.)='двое суток']/parent::*")
    public static SelenideElement number2DaysScooterRental;
    // Установить  значение чет бокса
    @FindBy(how = How.XPATH,using = "//input[@id='black']")
    public static SelenideElement checkboxBoxBlack;
   //Комментарий для курьера
    @FindBy(how = How.XPATH,using = "//input[@placeholder='Комментарий для курьера']")
    public static SelenideElement comment;
    //Нажать на кнопку заказать
    @FindBy(how = How.XPATH,using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    public static SelenideElement orderButton;
    //Нажать "Да" на кнопку в окне оформить заказ
    @FindBy(how = How.XPATH,using = "//*/text()[normalize-space(.)='Да']/parent::*")
    public static SelenideElement yesButton;
    //Заказ оформлен , Проверяем что заказ оформлен ищем в окне текст
    @FindBy(how = How.XPATH,using = "//*[normalize-space(text()) = 'Заказ оформлен']")
    public static SelenideElement findTextTheOrderHasBeenIssued;
}
