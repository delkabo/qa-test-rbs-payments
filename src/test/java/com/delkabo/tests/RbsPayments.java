package com.delkabo.tests;

import com.delkabo.components.RbsPaymentsObject;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RbsPayments extends TestBase {

    RbsPaymentsObject rbsPaymentsObject = new RbsPaymentsObject();

    @Test
    @Description("Rbs-Payments search Vacancies")
    @DisplayName("Rbs-Payments")
    void titleTest() {
        rbsPaymentsObject.openPage()
                .clickVacancies()
                .haveVacancies("Вакансии")
                .clickSpec("Казань, Специалист по тестированию")
                .haveTitle("Казань, Специалист по тестированию");

    }
}