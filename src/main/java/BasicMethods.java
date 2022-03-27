import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;

public class BasicMethods {
    public boolean checkAnswer(SelenideElement question, SelenideElement answer, String textAnswer) {
        //Прокрутить и найти элемент
        question.scrollTo();
        //Открыть первый запрос
        question.should(exist).shouldBe(visible).click();
        // Проверяем соответствует ли текст  вопроса
        answer.should(exist).shouldBe(visible).shouldHave(text(textAnswer)).click();
        //Вернуть true если функция успешно отработала
        return true;
    }
}
