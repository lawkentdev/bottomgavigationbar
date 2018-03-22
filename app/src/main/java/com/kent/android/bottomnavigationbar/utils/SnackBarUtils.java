package com.kent.android.bottomnavigationbar.utils;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.kent.android.bottomnavigationbar.R;

public class SnackBarUtils {
    public static void showSnackBar(View view, String string, Context context) {
        Snackbar snackbar = Snackbar.make(view, string, Snackbar.LENGTH_SHORT);
        snackbar.getView().setBackgroundColor(ContextCompat.getColor(context, R.color.amber));
//        setSnackbarMessageTextColor(snackbar, R.color.white);
        snackbar.show();
    }

    public static void setSnackbarMessageTextColor(Snackbar snackbar, int color) {
        View view = snackbar.getView();
        TextView textView = (TextView) view.findViewById(R.id.snackbar_text);
        textView.setTextColor(color);
    }

}
