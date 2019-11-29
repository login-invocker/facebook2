package com.liliana.facebook2.ui.main.GeneralPage;

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

import com.liliana.facebook2.R;
import com.liliana.facebook2.list.For.Gerana.Page.ItemObject_Page_General;
import com.liliana.facebook2.list.For.Gerana.Page.RecyclerView.List_GerenaPage;

import java.util.ArrayList;
import java.util.List;

public class GeneralPage extends Fragment {
    private Context context;
    private GeneralPageViewModel mViewModel;
    private RecyclerView recyclerView;
    private RecyclerView headRecyclerView;

    public static GeneralPage newInstance(int index) {
        return new GeneralPage();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.general_page_fragment, container, false);
        headRecyclerView = view.findViewById(R.id.rcv_general);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(GeneralPageViewModel.class);
        // TODO: Use the ViewModel
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        headRecyclerView.setLayoutManager(linearLayoutManager);
        headRecyclerView.setHasFixedSize(true);
        List_GerenaPage customAdapter = new List_GerenaPage(getDataSource());
        headRecyclerView.setAdapter(customAdapter);
    }

    private List<ItemObject_Page_General> getDataSource() {
        List<ItemObject_Page_General> data = new ArrayList<>();
        data.add(new ItemObject_Page_General(R.drawable.tung_me, "Đặng Than Tùng", "Xem trang cá nhân của bạn"));
        data.add(new ItemObject_Page_General(R.drawable.ic_group, "Bạn bè", "11 lời mời"));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Nhóm", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Video Trên Watch", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Sự kiện", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Kỉ niệm", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Đã lưu", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Trang", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
        data.add(new ItemObject_Page_General(R.drawable.ic_tab_watch, "Bạn bè quanh đây", ""));
return data;
    }

}
