package com.kodilla.parametrized_tests.homework7_3;

import java.util.stream.Stream;

public class PersonTestDataProvider {

    public static Stream<Object[]> provideBMIData() {
        return Stream.of(
                new Object[]{1.75, 45, "Very severely underweight"},
                new Object[]{1.75, 47, "Severely underweight"},
                new Object[]{1.75, 55, "Underweight"},
                new Object[]{1.75, 68, "Normal (healthy weight)"},
                new Object[]{1.75, 80, "Overweight"},
                new Object[]{1.75, 95, "Obese Class I (Moderately obese)"},
                new Object[]{1.75, 110, "Obese Class II (Severely obese)"},
                new Object[]{1.75, 125, "Obese Class III (Very severely obese)"},
                new Object[]{1.75, 140, "Obese Class IV (Morbidly Obese)"},
                new Object[]{1.75, 170, "Obese Class V (Super Obese)"},
                new Object[]{1.75, 185, "Obese Class VI (Hyper Obese)"}
        );
    }
}