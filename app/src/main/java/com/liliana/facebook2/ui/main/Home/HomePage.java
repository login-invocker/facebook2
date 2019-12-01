package com.liliana.facebook2.ui.main.Home;

import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liliana.facebook2.Model.GetImage;
import com.liliana.facebook2.R;
import com.liliana.facebook2.adapter.GetImageAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Fragment {

    private HomePageViewModel mViewModel;

    public static HomePage newInstance(int index) {
        return new HomePage();
    }

    private Context context;
    private ArrayList<GetImage> linkimages;
    private RecyclerView recyclerView;

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_page_fragment, container, false);
        recyclerView = view.findViewById(R.id.rcl_get_img);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HomePageViewModel.class);
        // TODO: Use the ViewModel
        addData();
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        GetImageAdapter adapter = new GetImageAdapter(linkimages, context);
        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        linkimages=new ArrayList<>();
        linkimages.add(new GetImage("https://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg"));        linkimages.add(new GetImage("https://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg"));
        linkimages.add(new GetImage("https://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg"));
        linkimages.add(new GetImage("https://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg"));
        linkimages.add(new GetImage("https://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg"));
        linkimages.add(new GetImage("https://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg"));
        linkimages.add(new GetImage("https://anhnendep.net/wp-content/uploads/2016/02/vit-boi-roi-Psyduck.jpg"));

    }


}
