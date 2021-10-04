package com.onlyme.theinthanhlaing.library.Listener;

import android.view.View;
import android.widget.EditText;


import com.onlyme.theinthanhlaing.library.Enums.ActionEnum;
import com.onlyme.theinthanhlaing.library.NumberPicker;

public class ActionListener implements View.OnClickListener {
    NumberPicker layout;
    ActionEnum action;
    EditText display;

    public ActionListener(NumberPicker layout, ActionEnum action, EditText display) {
        this.layout = layout;
        this.action = action;
        this.display = display;
    }

    @Override
    public void onClick(View view) {

        try {

            int newValue = Integer.parseInt(this.display.getText().toString());

            if (!this.layout.valueIsAllowed(newValue)) {
                return;
            }

            this.layout.setValue(newValue);

        } catch (NumberFormatException e) {
            this.layout.refresh();
        }

        switch (this.action) {
            case INCREMENT:
                this.layout.increment();
                break;
            case DECREMENT:
                this.layout.decrement();
                break;
        }
    }

}
