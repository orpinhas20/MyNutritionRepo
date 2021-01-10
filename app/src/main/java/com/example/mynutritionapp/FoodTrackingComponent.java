package com.example.mynutritionapp;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodTrackingComponent extends RecyclerView.ViewHolder {

    private TextView textView ;
    private LinearLayout linearLayout_3;

    public FoodTrackingComponent(@NonNull View v) {
        super(v);
        textView = v.findViewById(R.id.FoodTracking_LBL_test);
        linearLayout_3 = v.findViewById(R.id.linearlayout_3);
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
        return linearLayout_3;
    }

    public void setLinearLayout(LinearLayout linearLayout_3) {
        this.linearLayout_3 = linearLayout_3;
    }
}

