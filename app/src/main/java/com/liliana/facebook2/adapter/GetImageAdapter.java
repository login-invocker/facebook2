package com.liliana.facebook2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.Target;
import com.liliana.facebook2.Model.GetImage;
import com.liliana.facebook2.R;

import java.util.ArrayList;


import static java.security.AccessController.getContext;

public class GetImageAdapter extends RecyclerView.Adapter<GetImageAdapter.getImageViewHodler>  {
    ArrayList<GetImage> getImages;
private Context context;

    public GetImageAdapter(ArrayList<GetImage> getImages, Context context) {
        this.getImages = getImages;
        this.context = context;
    }

    @NonNull
    @Override
    public getImageViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.view_image_download,parent,false);
        view.setLayoutParams(new RecyclerView.LayoutParams(1080,800));
        return new getImageViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull getImageViewHodler holder, int position) {
    }

    @Override
    public int getItemCount() {
        return getImages==null?0:getImages.size();
    }

    static class getImageViewHodler extends RecyclerView.ViewHolder {
        private ImageView img;
            public getImageViewHodler(@NonNull View itemView) {
                super(itemView);
                img=itemView.findViewById(R.id.img_get_from_internet);
            }

        public ImageView getImage() {
        return this.img;
            }
    }
}
