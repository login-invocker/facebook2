package com.liliana.facebook2.list.For.Gerana.Page.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.liliana.facebook2.MainActivity;
import com.liliana.facebook2.R;
import com.liliana.facebook2.list.For.Gerana.Page.ItemObject_Page_General;
import com.liliana.facebook2.ui.main.GeneralPage.GeneralPage;

import java.util.List;

public class List_GerenaPage extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = GeneralPage.class.getSimpleName();
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private static final int TYPE_BOTTOM = 2;
    private Context context;
    public List_GerenaPage(List<ItemObject_Page_General> objects) {
        this.objects = objects;
    }

    private List<ItemObject_Page_General> objects;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_HEADER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.head_gerena_page, parent, false);
            return new HeadViewHoldel(view);
        } else if (viewType == TYPE_ITEM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gerena_page, parent, false);
            return new ItemViewHoldel(view);
        }else if (viewType == TYPE_BOTTOM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bottom_geral_page_fragment, parent, false);
            return new bottomViewHoldel(view);
        }
        throw new RuntimeException("No match for " + viewType + ".");

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemObject_Page_General mObject = objects.get(position);
        if (holder instanceof HeadViewHoldel) {
            ((HeadViewHoldel) holder).title.setText(mObject.getTitle());
            ((HeadViewHoldel) holder).messenger.setText(mObject.getMessenger());
            ((HeadViewHoldel) holder).icon.setImageResource(mObject.getIcon());
        } else if (holder instanceof ItemViewHoldel) {
            ((ItemViewHoldel) holder).title.setText(mObject.getTitle());
            ((ItemViewHoldel) holder).messenger.setText(mObject.getMessenger());
            ((ItemViewHoldel) holder).icon.setImageResource(mObject.getIcon());
        }else if(holder instanceof bottomViewHoldel){
            ((bottomViewHoldel) holder).img.setImageResource(mObject.getIcon());
            ((bottomViewHoldel) holder).img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(v.getContext(), MainActivity.class);
                    v.getContext().startActivity(intent);
                }
            });
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (isPositionHeader(position))
            return TYPE_HEADER;
        else if(isPositionBottom(position)) return TYPE_BOTTOM;
        return TYPE_ITEM;
    }
    private boolean isPositionHeader(int position) {

        return position == 0;
    }
    private boolean isPositionBottom(int position) {

        return position == 2;
    }
    @Override
    public int getItemCount() {
        return objects.size();
    }

    static class HeadViewHoldel extends RecyclerView.ViewHolder {
        private ImageView icon;
        private TextView title;
        private TextView messenger;

        public HeadViewHoldel(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.page_general_ic_head);
            title = itemView.findViewById(R.id.title_head_general);
            messenger = itemView.findViewById(R.id.messenger_head_general);
        }
    }


    static class ItemViewHoldel extends RecyclerView.ViewHolder {
        private ImageView icon;
        private TextView title;
        private TextView messenger;

        public ItemViewHoldel(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.ic_general);
            title = itemView.findViewById(R.id.title_general);
            messenger = itemView.findViewById(R.id.messenger_general);
        }
    }
    static class bottomViewHoldel extends RecyclerView.ViewHolder {
        private ImageView img;
        public bottomViewHoldel(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.page_general_ic_bottom);
        }
    }
}
