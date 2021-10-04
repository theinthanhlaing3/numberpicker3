package com.onlyme.theinthanhlaing.library.Listener;

import android.view.View;
import android.widget.EditText;

import com.onlyme.theinthanhlaing.library.Enums.ActionEnum;
import com.onlyme.theinthanhlaing.library.NumberPicker;

public class DefaultOnFocusChangeListener implements View.OnFocusChangeListener {

    NumberPicker layout;

    public DefaultOnFocusChangeListener(NumberPicker layout) {
        this.layout = layout;
    }

    @Override
    public void onFocusChange(View view, boolean hasFocus) {

        EditText editText = (EditText) view;

        if (!hasFocus) {
            try {

                int value = Integer.parseInt(editText.getText().toString());
                layout.setValue(value);
                if (layout.getValue() == value) {
                    layout.getValueChangedListener().valueChanged(value, ActionEnum.MANUAL);
                } else {
                    layout.refresh();
                }

            } catch (NumberFormatException e) {
                layout.refresh();
            }
        }
    }
}
