import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {
    @Test
    void dragAndDropTest() {
        //Открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        sleep(5000);
        //Перенести прямоугольник А на место В
        //actions().dragAndDropBy($("#column-a"), 3000, 0).perform();
        //$("#column-a").dragAndDropTo($("#column-b"));
        //actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(300,0).release().perform();
        //sleep(5000);
        //Проверить, что прямоугольники действительно поменялись
    }
}
