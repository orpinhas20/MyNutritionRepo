package com.example.mynutritionapp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DailyStatusComponent extends RecyclerView.ViewHolder {

    private TextView textView;
    private LinearLayout linearLayout_1;

    public DailyStatusComponent(@NonNull View v) {
        super(v);
        textView = v.findViewById(R.id.DailyStatus_LBL_test);
        linearLayout_1 = v.findViewById(R.id.linearlayout_1);
        //TODO: needs to be corrected
    }

    public void setView(String text) {
        textView.setText(text);
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public LinearLayout getLinearLayout() {
        return linearLayout_1;
    }

    public void setLinearLayout(LinearLayout linearLayout_1) {
        this.linearLayout_1 = linearLayout_1;
    }
}