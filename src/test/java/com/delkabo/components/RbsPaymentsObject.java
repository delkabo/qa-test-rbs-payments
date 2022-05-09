package com.delkabo.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RbsPaymentsObject {

    private SelenideElement
            wrapTitle = $(".wrap-page-title"),
            wrapLine = $(".wrap-cart-no-line"),
            getTitle = $(".wrap-page-title");



    public RbsPaymentsObject openPage() {
        open("https://rbs-payments.ru/");
        return this;
    }

    public RbsPaymentsObject clickVacancies() {
        $(byText("Вакансии")).click();
        return this;
    }

    public RbsPaymentsObject haveVacancies(String title) {
        wrapTitle.shouldHave(text(title));
        return this;
    }

    public RbsPaymentsObject clickSpec(String name) {
        wrapLine.$(byText(name)).click();
        return this;
    }

    public RbsPaymentsObject haveTitle(String name) {
        getTitle.shouldHave(text(name));
        return this;
    }

}
