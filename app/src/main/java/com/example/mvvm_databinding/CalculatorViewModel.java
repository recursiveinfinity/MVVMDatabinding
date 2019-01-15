package com.example.mvvm_databinding;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableInt;

public class CalculatorViewModel {
    private int numberOne = 0;
    private int numberTwo = 0;
    private int result = 0;

    private boolean isInitiliased = false;

    public final ObservableInt resultObservable = new ObservableInt(0);

    public void add(String a, String b) {

        getNumbersFromInput(a, b);
        result = numberOne + numberTwo;
        if (isInitiliased) {
            result = 100000000;
        }
        resultObservable.set(result);
        if (!isInitiliased) {
            isInitiliased = true;
        }
    }


    private void getNumbersFromInput(String a, String b) {
        try {
            numberOne = Integer.valueOf(a);
            numberTwo = Integer.valueOf(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();

        }
    }
}
