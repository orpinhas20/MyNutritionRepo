package com.example.mynutritionapp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class DietDictionaryComponent extends RecyclerView.ViewHolder {

    private TextView textView;
    private LinearLayout linearLayout_2;

    public DietDictionaryComponent(@NonNull View v) {
        super(v);
        textView = v.findViewById(R.id.DietDictionary_LBL_test);
        linearLayout_2 = v.findViewById(R.id.linearlayout_2);
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
        return linearLayout_2;
    }

    public void setLinearLayout(LinearLayout linearLayout_2) {
        this.linearLayout_2 = linearLayout_2;
    }
}

