package com.onlyme.theinthanhlaing.library.Listener;

import android.util.Log;

import com.onlyme.theinthanhlaing.library.Enums.ActionEnum;
import com.onlyme.theinthanhlaing.library.Interface.ValueChangedListener;

public class DefaultValueChangedListner implements ValueChangedListener {

    @Override
    public void valueChanged(int value, ActionEnum action) {

        String actionText = action == ActionEnum.MANUAL ? "manually set" : (action == ActionEnum.INCREMENT ? "incremented" : "decremented");
        String message = String.format("NumberPicker is %s to %d", actionText, value);
        Log.v(this.getClass().getSimpleName(), message);

    }
}
