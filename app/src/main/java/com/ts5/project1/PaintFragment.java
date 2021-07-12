package com.ts5.project1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class PaintFragment extends Fragment implements StaggeredImageAdapter.OnImageListener {

    private View view;
    private RecyclerView recyclerView;
    StaggeredImageAdapter imageAdapter;
    List<Post> postPaint;

    public PaintFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = (ViewGroup)inflater.inflate(R.layout.fragment_paint, container, false);

        recyclerView = view.findViewById(R.id.paint_recycler);

        postPaint = new ArrayList<>();
        postAdd();
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(3, 15, false));
        imageAdapter = new StaggeredImageAdapter(postPaint, this);
        recyclerView.setAdapter(imageAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }

    public void postAdd(){
        postPaint.add(new Post(R.drawable.paint1, "계속", "구스",
                "2021-04-16", "#그라폴리오 #드로잉 #그림"));
        postPaint.add(new Post(R.drawable.paint2, "NO.212", "Designer JD",
                "2021-06-21", "#그라폴리오 #플루이드아트 #아크릴푸어링"));
        postPaint.add(new Post(R.drawable.paint3, "NO.215", "Designer JD",
                "2021-06-28", "#그라폴리오 #플루이드아트 #아크릴푸어링"));
        postPaint.add(new Post(R.drawable.paint4, "NO.219", "Designer JD",
                "2021-07-07", "#그라폴리오 #플루이드아트 #아크릴푸어링"));
        postPaint.add(new Post(R.drawable.paint5, "NO.220", "Desinger JD",
                "2021-07-09", "#그라폴리오 #플루이드아트 #아크릴푸어링"));
        postPaint.add(new Post(R.drawable.paint6, "투비", "구스",
                "2020-09-26", "#그라폴리오 #드로잉 #그림"));
        postPaint.add(new Post(R.drawable.paint7, "응", "구스",
                "2021-06-10", "#그라폴리오 #드로잉 #그림"));
        postPaint.add(new Post(R.drawable.paint8, "응 맞아", "구스",
                "2020-10-12", "#그라폴리오 #드로잉 #그림"));
        postPaint.add(new Post(R.drawable.paint9, "꿈의 징검다리", "한붓시인 박혜정",
                "2021-06-08", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint10, "나 지금 예민중", "한붓시인 박혜정",
                "2021-06-03", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint11, "집중이 안돼", "한붓시인 박혜정",
                "2021-07-01", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint12, "잠이 필요해", "한붓시인 박혜정",
                "2021-05-29", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint13, "우뇌와 좌뇌의 토론", "한붓시인 박혜정",
                "2021-05-03", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint14, "우아한 자세", "한붓시인 박혜정",
                "2021-05-06", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint15, "그대(봄)와 춤을", "한붓시인 박혜정",
                "2021-04-19", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint16, "십자가 위의 예수님", "한붓시인 박혜정",
                "2021-03-25", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint17, "고릴라", "한붓시인 박혜정",
                "2021-03-19", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint18, "머리가 무거워", "한붓시인 박혜정",
                "2021-03-05", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint19, "중년의 변화", "한붓시인 박혜정",
                "2021-02-18", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint20, "깊은 잠", "한붓시인 박혜정",
                "2021-02-10", "#그라폴리오 #한붓시인 #hantouch"));
        postPaint.add(new Post(R.drawable.paint21, "예쁜 청춘", "한붓시인 박혜정",
                "2021-01-27", "#그라폴리오 #한붓시인 #hantouch"));
    }

    @Override
    public void onImageClick(int position) {
        Post post = postPaint.get(position);
        Intent intent = new Intent(getActivity(), ImageinfoActivity.class);
        intent.putExtra("post", post);
        startActivity(intent);
    }
}