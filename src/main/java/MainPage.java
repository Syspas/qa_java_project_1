import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static com.codeborne.selenide.Condition.*;


public class MainPage {
    final static String URL = "https://qa-scooter.praktikum-services.ru/";
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    private  String answerText0= "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private  String answerText1= "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private  String answerText2= "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private  String answerText3="Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private  String answerText4="Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private  String answerText5="Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private  String answerText6="Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private  String answerText7="Да, обязательно. Всем самокатов! И Москве, и Московской области.";



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
    private  SelenideElement question0;

    //Обект вопрос № 2
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-1']")
    private  SelenideElement question1;

    //Обект вопрос № 3
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-2']")
    private  SelenideElement question2;

    //Обект вопрос № 4
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-3']")
    private  SelenideElement question3;

    //Обект вопрос № 5
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-4']")
    private  SelenideElement question4;

    //Обект вопрос № 6
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-5']")
    private  SelenideElement question5;

    //Обект вопрос № 7
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-6']")
    private  SelenideElement question6;

    //Обект вопрос № 8
    @FindBy(how = How.XPATH,using = "//div[@id='accordion__heading-7']")
    private  SelenideElement question7;

    //
    //Ответ на вопрос №1
    @FindBy(how = How.ID,using = "accordion__panel-0")
    private  SelenideElement answer0;

    //Ответ на вопрос №2
    @FindBy(how = How.ID,using = "accordion__panel-1")
    private  SelenideElement answer1;

    //Ответ на вопрос №3
    @FindBy(how = How.ID,using = "accordion__panel-2")
    private  SelenideElement answer2;

    //Ответ на вопрос №4
    @FindBy(how = How.ID,using = "accordion__panel-3")
    private  SelenideElement answer3;

    //Ответ на вопрос №5
    @FindBy(how = How.ID,using = "accordion__panel-4")
    private  SelenideElement answer4;

    //Ответ на вопрос №6
    @FindBy(how = How.ID,using = "accordion__panel-5")
    private  SelenideElement answer5;

    //Ответ на вопрос №7
    @FindBy(how = How.ID,using = "accordion__panel-6")
    private  SelenideElement answer6;

    //Ответ на вопрос №8
    @FindBy(how = How.ID,using = "accordion__panel-7")
    private  SelenideElement answer7;

///////////////////////////////////////////////////////////////////////////////////////////
public void check(SelenideElement question, SelenideElement answer, String textAnswer) {
        //Открыть первый запрос
        question.scrollTo();
       //Открыть первый запрос
        question.should(exist).shouldBe(visible).click();
        //Проверяем соответствует ли текст  вопроса
        answer.should(exist).shouldBe(visible).shouldHave(text(textAnswer)).click();

    }

////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Выбираем определенный тесткейс с параметрами и вызываем функцию
 */
    public boolean selectSet(String selectSet) {
        boolean result;
        try {
            switch (selectSet) {
                case "Вопрос №1":
                    check( question0, answer0, answerText0);
                    break;
                case "Вопрос №2":
                    check( question1, answer1, answerText1);
                    break;
                case "Вопрос №3":
                    check( question2, answer2, answerText2);
                    break;
                case "Вопрос №4":
                    check( question3, answer3, answerText3);
                    break;
                case "Вопрос №5":
                    check( question4, answer4, answerText4);
                    break;
                case "Вопрос №6":
                    check( question5, answer5, answerText5);
                    break;
                case "Вопрос №7":
                    check( question6, answer6, answerText6);
                    break;
                case "Вопрос №8":
                    check( question7, answer7, answerText7);
                    break;

            }
            return result = true;
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Тест завершен с ошибкой");
            return  result = false ;
        }


    }
////////////////////////////////////////////////////////////////////////////////////////////////////
}
