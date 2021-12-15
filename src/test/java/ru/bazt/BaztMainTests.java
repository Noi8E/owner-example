package ru.bazt;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class BaztMainTests extends TestBase {

    @Test
    public void openMainPage() {
        open(BAZT_URL);
        $(".search_button").click();
        $("#search").setValue(SEARCH_VALUE).click();
        $x("//h2[contains(text(),'Результаты поиска:')]").shouldBe(visible);
    }


}
