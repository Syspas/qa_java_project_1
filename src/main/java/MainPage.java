import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.*;


public class MainPage {
    final static String URL = "https://qa-scooter.praktikum-services.ru/";
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    private static String answerText0= "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private static String answerText1= "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private static String answerText2= "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private static String answerText3="Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private static String answerText4="Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private static String answerText5="Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private static String answerText6="Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private static String answerText7="Да, обязательно. Всем самокатов! И Москве, и Московской области.";



    //////////////////////////////////////////////////////////////////////////////////////////////////////
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
/////////////////////////////////////////////////////////////////
    // Метод вызова информации  об ошибке
public boolean isErrorMessageDisplayed(){return popupError.isDisplayed();}

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
    private static SelenideElement question0;

    //Обект вопрос № 2
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-1']")
    private static SelenideElement question1;

    //Обект вопрос № 3
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-2']")
    private static SelenideElement question2;

    //Обект вопрос № 4
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-3']")
    private static SelenideElement question3;

    //Обект вопрос № 5
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-4']")
    private static SelenideElement question4;

    //Обект вопрос № 6
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-5']")
    private static SelenideElement question5;

    //Обект вопрос № 7
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-6']")
    private static SelenideElement question6;

    //Обект вопрос № 8
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-7']")
    private static SelenideElement question7;

    //
    //Ответ на вопрос №1
    @FindBy(how = How.ID,using = "accordion__panel-0")
    private static SelenideElement answer0;

    //Ответ на вопрос №2
    @FindBy(how = How.ID,using = "accordion__panel-1")
    private static SelenideElement answer1;

    //Ответ на вопрос №3
    @FindBy(how = How.ID,using = "accordion__panel-2")
    private static SelenideElement answer2;

    //Ответ на вопрос №4
    @FindBy(how = How.ID,using = "accordion__panel-3")
    private static SelenideElement answer3;

    //Ответ на вопрос №5
    @FindBy(how = How.ID,using = "accordion__panel-4")
    private static SelenideElement answer4;

    //Ответ на вопрос №6
    @FindBy(how = How.ID,using = "accordion__panel-5")
    private static SelenideElement answer5;

    //Ответ на вопрос №7
    @FindBy(how = How.ID,using = "accordion__panel-6")
    private static SelenideElement answer6;

    //Ответ на вопрос №8
    @FindBy(how = How.ID,using = "accordion__panel-7")
    private static SelenideElement answer7;

///////////////////////////////////////////////////////////////////////////////////////////
public boolean check(SelenideElement question, SelenideElement answer, String textAnswer) {
         //Открыть первый запрос
        question.should(exist).shouldBe(visible).click();
        //Проверяем соответствует ли текст  вопроса
        answer.should(exist).shouldBe(visible).shouldHave(text(textAnswer)).click();
        return true;
    }

    public MainPage scroll(SelenideElement question) {
        //Открыть первый запрос
        question.scrollTo();
        return this;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
    public static SelenideElement getQuestion0() {return question0;}

    public static SelenideElement getQuestion1() {return question1;}

    public static SelenideElement getQuestion2() {return question2;}

    public static SelenideElement getQuestion3() {return question3;}

    public static SelenideElement getQuestion4() {return question4;}

    public static SelenideElement getQuestion5() {return question5;}

    public static SelenideElement getQuestion6() {return question6;}

    public static SelenideElement getQuestion7() {return question7;}

//////////////////////////////////////////////////////////////////////////////////////
    public static SelenideElement getAnswer0() {return answer0;}

    public static SelenideElement getAnswer1() {return answer1;}

    public static SelenideElement getAnswer2() {return answer2;}

    public static SelenideElement getAnswer3() {return answer3;}

    public static SelenideElement getAnswer4() {return answer4;}

    public static SelenideElement getAnswer5() {return answer5;}

    public static SelenideElement getAnswer6() {return answer6;}

    public static SelenideElement getAnswer7() {return answer7;}

//////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String getAnswerText0() {return answerText0;}

    public static String getAnswerText1() {return answerText1;}

    public static String getAnswerText2() {return answerText2;}

    public static String getAnswerText3() {return answerText3;}

    public static String getAnswerText4() {return answerText4;}

    public static String getAnswerText5() {return answerText5;}

    public static String getAnswerText6() {return answerText6;}

    public static String getAnswerText7() {return answerText7;}
}
