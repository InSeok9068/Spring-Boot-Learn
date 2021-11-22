package com.example.demo.common.util;

import java.time.LocalDate;
import java.time.Period;

public class DateUtil {

    /**
     * ■ 생년월일 기준으로 만 나이 조회 ■ 이인석 2021-11-22
     * @param birtDate
     * @return
     */
    public static int getAge(LocalDate birtDate) {
        return Period.between(birtDate, LocalDate.now()).getYears();
    }
}
