import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestQuestion  extends BaseTest {
    @Test
    public void TestQuestion1() {
        boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question0,
                MainPage.answer0,
                MainPage.answerText0
        );

        assertTrue(checkAnswer);
    }

    @Test
    public   void TestQuestion2() {

      boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question1,
                MainPage.answer1,
              MainPage.answerText1
      );

        assertTrue(checkAnswer);
  }

    @Test
    public   void TestQuestion3() {

        boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question2,
                MainPage.answer2,
                MainPage.answerText2
        );

        assertTrue(checkAnswer);
    }

    @Test
    public   void TestQuestion4() {

        boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question3,
                MainPage.answer3,
                MainPage.answerText3
        );

        assertTrue(checkAnswer);
    }

    @Test
    public   void TestQuestion5() {

        boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question4,
                MainPage.answer4,
                MainPage.answerText4
        );

        assertTrue(checkAnswer);
    }

    @Test
    public   void TestQuestion6() {

        boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question5,
                MainPage.answer5,
                MainPage.answerText5
        );

        assertTrue(checkAnswer);
    }

    @Test
    public   void TestQuestion7() {

        boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question6,
                MainPage.answer6,
                MainPage.answerText6
        );

        assertTrue(checkAnswer);
    }

    @Test
    public   void TestQuestion8() {

        boolean checkAnswer = Selenide.open(MainPage.URL,MainPage.class).checkAnswer(
                MainPage.question7,
                MainPage.answer7,
                MainPage.answerText7
        );

        assertTrue(checkAnswer);
    }
}

