package com.onlyme.theinthanhlaing.library.Listener;

import android.util.Log;

import com.onlyme.theinthanhlaing.library.Interface.LimitExceededListener;

public class DefaultLimitExceededListener implements LimitExceededListener {
    @Override
    public void limitExceeded(int limit, int exceededValue) {
        String message = String.format("NumberPicker cannot set to %d because the limit is %d.", exceededValue, limit);
        Log.v(this.getClass().getSimpleName(), message);
    }
}
