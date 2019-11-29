package com.liliana.facebook2.RecyclerViewForPerson;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterForPerson extends RecyclerView.Adapter<AdapterForPerson.PersonViewHodel> {
    @NonNull
    @Override
    public PersonViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHodel holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    static class PersonViewHodel extends RecyclerView.ViewHolder {
            private ImageView img;
            public PersonViewHodel(@NonNull View itemView) {
                super(itemView);
            }
        }

}
