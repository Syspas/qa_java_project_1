import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.*;

public class MainPage {
    final static String URL = "https://qa-scooter.praktikum-services.ru/";
    //Найти кнопку Заказать
    @FindBy(how = How.CLASS_NAME,using = "Header_Link__1TAG7")
    private SelenideElement btnShowInputField;

    //Найти на поле  "ввести номер заказа"
    @FindBy(how = How.XPATH,using = "//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement inputOrderNum;
    //нажать на кнопку GO
    @FindBy(how = How.XPATH,using = "//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement btnFindOrder;

// страница с с информациео оошибке
@FindBy(how = How.CLASS_NAME,using = "Track_NotFound__6oaoY")
public SelenideElement popupError;

// Метод вызова информации  об ошибке
public boolean isErrorMessageDisplayed(){
        return popupError.isDisplayed();

    }


//

    public MainPage clickShowInputField(){
        //метод нажимает на кнопку зказать
        btnShowInputField.click();
        return this;
    }

    public MainPage inputOrderNum(String incorrectOrderNum){
    //Нажать на поле  "ввести номер заказа"
    //ввести номер закаа в поле "ввести номер заказа"
        btnFindOrder.sendKeys(incorrectOrderNum);
        return this;
    }

    public MainPage clickFindOrder(){
    btnFindOrder.click();
        return this;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    /// Вопросы
    //Обект вопрос № 1
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-0']")
    public SelenideElement question0;

    //Обект вопрос № 2
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-1']")
    public SelenideElement question1;

    //Обект вопрос № 3
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-2']")
    public SelenideElement question2;

    //Обект вопрос № 4
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-3']")
    public SelenideElement question3;

    //Обект вопрос № 5
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-4']")
    public SelenideElement question4;

    //Обект вопрос № 6
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-5']")
    public SelenideElement question5;

    //Обект вопрос № 7
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-6']")
    public SelenideElement question6;

    //Обект вопрос № 8
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-7']")
    public SelenideElement question7;

    //
    //Ответ на вопрос №1
    @FindBy(how = How.ID,using = "accordion__panel-0")
    public SelenideElement answer0;

    //Ответ на вопрос №2
    @FindBy(how = How.ID,using = "accordion__panel-1")
    public SelenideElement answer1;

    //Ответ на вопрос №3
    @FindBy(how = How.ID,using = "accordion__panel-2")
    public SelenideElement answer2;

    //Ответ на вопрос №4
    @FindBy(how = How.ID,using = "accordion__panel-3")
    public SelenideElement answer3;

    //Ответ на вопрос №5
    @FindBy(how = How.ID,using = "accordion__panel-4")
    public SelenideElement answer4;

    //Ответ на вопрос №6
    @FindBy(how = How.ID,using = "accordion__panel-5")
    public SelenideElement answer5;

    //Ответ на вопрос №7
    @FindBy(how = How.ID,using = "accordion__panel-6")
    public SelenideElement answer6;

    //Ответ на вопрос №8
    @FindBy(how = How.ID,using = "accordion__panel-7")
    public SelenideElement answer7;

    //Методы
    private void getClick(MainPage page) {
        page.answer0.should(exist).shouldBe(visible).shouldHave(text("Сутки — 400 рублей. Оплата курьеру — наличными или картой.")).click();
    }

}
