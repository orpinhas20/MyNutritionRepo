package com.example.mynutritionapp;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactComponent extends RecyclerView.ViewHolder {

    private TextView textView;
    private LinearLayout linearLayout_0;

    public ContactComponent(@NonNull View v) {
        super(v);
        textView = v.findViewById(R.id.Contact_LBL_test);
        linearLayout_0 = v.findViewById(R.id.linearlayout_0);
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
        return linearLayout_0;
    }

    public void setLinearLayout(LinearLayout linearLayout_0) {
        this.linearLayout_0 = linearLayout_0;
    }
}
