package com.example.mynutritionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import static com.example.mynutritionapp.Component.ContactPosition;
import static com.example.mynutritionapp.Component.FoodTrackingPosition;
import static com.example.mynutritionapp.Component.DietDictionaryPosition;
import static com.example.mynutritionapp.Component.DailyStatusPosition;

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private ArrayList<Component> components;

    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(ArrayList<Component> components) {
        this.components = components;
    }

    @Override
    public int getItemViewType(int position) {
        switch (components.get(position).getViewType()) {
            case 0:
                return ContactPosition;
            case 1:
                return FoodTrackingPosition;
            case 2:
                return DietDictionaryPosition;
            case 3:
                return DailyStatusPosition;
            default:
                return -1;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        switch (viewType) {
            case ContactPosition:
                View contactLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact_layout, parent, false);
                return new ContactLayout(contactLayout);
            case DailyStatusPosition:
                View dailyStatusLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_status_layout, parent, false);
                return new DailyStatusLayout(dailyStatusLayout);
            case DietDictionaryPosition:
                View dietDictionaryLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diet_dictionary_layout, parent, false);
                return new DietDictionaryLayout(dietDictionaryLayout);
            case FoodTrackingPosition:
                View foodTrackingLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food_tracking_layout, parent, false);
                return new FoodTrackingLayout(foodTrackingLayout);
            default:
                return null;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case ContactPosition:
                String text_0
                        = components.get(position).getText();
                ((ContactLayout) holder).setView(text_0);
                ((ContactLayout) holder)
                        .linearLayout.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(view.getContext(), "Hello from contactLayout !", Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
            case DailyStatusPosition:
                String text_1
                        = components.get(position).getText();
                ((DailyStatusLayout) holder).setView(text_1);
                ((DailyStatusLayout) holder)
                        .linearLayout.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(view.getContext(), "Hello from DailyStatusLayout !", Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
            case DietDictionaryPosition:
                String text_2
                        = components.get(position).getText();
                ((DietDictionaryLayout) holder).setView(text_2);
                ((DietDictionaryLayout) holder)
                        .linearLayout.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(view.getContext(), "Hello from DietDictionaryLayout !", Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
            case FoodTrackingPosition:
                String text_3
                        = components.get(position).getText();
                ((FoodTrackingLayout) holder).setView(text_3);
                ((FoodTrackingLayout) holder)
                        .linearLayout.setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(view.getContext(), "Hello from FoodTrackingLayout !", Toast.LENGTH_SHORT).show();
                            }
                        });
                break;
            default:
                return;

        }

    }

    @Override
    public int getItemCount() {
        return components.size();
    }

    class ContactLayout extends RecyclerView.ViewHolder {

        private TextView textView;
        private LinearLayout linearLayout;

        public ContactLayout(@NonNull View v) {
            super(v);
            textView = v.findViewById(R.id.Contact_LBL_test);
            linearLayout = v.findViewById(R.id.linearlayout);
        }

        private void setView(String text) {
            textView.setText(text);
        }
    }

    class DailyStatusLayout extends RecyclerView.ViewHolder {

        private TextView textView;
        private LinearLayout linearLayout;

        public DailyStatusLayout(@NonNull View v) {
            super(v);
            textView = v.findViewById(R.id.DailyStatus_LBL_test);
            linearLayout = v.findViewById(R.id.linearlayout);
            //TODO: needs to be corrected
        }

        private void setView(String text) {
            textView.setText(text);
        }

    }

    class DietDictionaryLayout extends RecyclerView.ViewHolder {

        private TextView textView;
        private LinearLayout linearLayout;

        public DietDictionaryLayout(@NonNull View v) {
            super(v);
            textView = v.findViewById(R.id.DailyStatus_LBL_test);
            linearLayout = v.findViewById(R.id.linearlayout);
            //TODO: needs to be corrected
        }

        private void setView(String text) {
            textView.setText(text);
        }

    }

    class FoodTrackingLayout extends RecyclerView.ViewHolder {

        private TextView textView;
        private LinearLayout linearLayout;

        public FoodTrackingLayout(@NonNull View v) {
            super(v);
            textView = v.findViewById(R.id.DailyStatus_LBL_test);
            linearLayout = v.findViewById(R.id.linearlayout);
            //TODO: needs to be corrected
        }

        private void setView(String text) {
            textView.setText(text);
        }
    }
}


