package com.example.mynutritionapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
                return DailyStatusPosition;
            case 2:
                return DietDictionaryPosition;
            case 3:
                return FoodTrackingPosition;
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

                return new ContactComponent(contactLayout);
            case DailyStatusPosition:
                View dailyStatusLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_status_layout, parent, false);
                return new DailyStatusComponent(dailyStatusLayout);
            case DietDictionaryPosition:
                View dietDictionaryLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_diet_dictionary_layout, parent, false);
                return new DietDictionaryComponent(dietDictionaryLayout);
            case FoodTrackingPosition:
                View foodTrackingLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food_tracking_layout, parent, false);
                return new FoodTrackingComponent(foodTrackingLayout);
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

                ((ContactComponent) holder).setView(text_0);
                ((ContactComponent) holder).getLinearLayout()
                        .setOnClickListener(

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
                ((DailyStatusComponent) holder).setView(text_1);
                ((DailyStatusComponent) holder)
                        .getLinearLayout().setOnClickListener(

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

                ((DietDictionaryComponent) holder).setView(text_2);
                ((DietDictionaryComponent) holder)
                        .getLinearLayout().setOnClickListener(
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
                ((FoodTrackingComponent) holder).setView(text_3);
                ((FoodTrackingComponent) holder)
                        .getLinearLayout().setOnClickListener(

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
    }

    @Override
    public int getItemCount() {
        return components.size();
    }
}
