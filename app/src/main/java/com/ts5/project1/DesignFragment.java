package com.ts5.project1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class DesignFragment extends Fragment implements ImageAdapter.OnImageListener {

    private View view;
    private RecyclerView recyclerView;
    ImageAdapter imageAdapter;
    List<Post> designPosts;

    public DesignFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = (ViewGroup)inflater.inflate(R.layout.fragment_design, container, false);

        designPosts = new ArrayList<>();
        postAdd();
        recyclerView = view.findViewById(R.id.design_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(3, 15, false));
        imageAdapter = new ImageAdapter(designPosts, this);
        recyclerView.setAdapter(imageAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }

    public void postAdd(){
        designPosts.add(new Post(R.drawable.design1, "Cloud Store", "아티스트태이",
                "2020-09-14", "#그라폴리오 #아트워크 #디자인"));
        designPosts.add(new Post(R.drawable.design2, "여름방학", "아티스트태이",
                "2021-07-03", "#그라폴리오 #아트워크 #디자인"));
        designPosts.add(new Post(R.drawable.design3, "마법의 성", "아티스트태이",
                "2020-07-07", "#그라폴리오 #몽환적인 #예쁜"));
        designPosts.add(new Post(R.drawable.design4, "밤 여행", "아티스트태이",
                "2021-07-04", "#그라폴리오 #art #일러스트레이터"));
        designPosts.add(new Post(R.drawable.design5, "아이유", "아티스트태이",
                "2021-07-01", "#그라폴리오 #드로잉 #예쁜"));
        designPosts.add(new Post(R.drawable.design6, "섬-낮과 밤", "소나",
                "2021-01-29", "#그라폴리오 #섬 #artwork"));
        designPosts.add(new Post(R.drawable.design7, "토요일 아침", "소나",
                "2021-03-12", "#그라폴리오 #주말 #포근포근"));
        designPosts.add(new Post(R.drawable.design8, "페르소나", "소나",
                "2021-03-05", "#그라폴리오 #페르소나 #가면"));
        designPosts.add(new Post(R.drawable.design9, "도시의 별", "아티스트태이",
                "2021-07-09", "#그라폴리오 #디자인 #몽환적인"));
        designPosts.add(new Post(R.drawable.design10, "달의익사", "소나",
                "2021-02-26", "#그라폴리오 #심해 #바닷속"));
        designPosts.add(new Post(R.drawable.design11, "코로나 없는 세상", "소나",
                "2021-04-16", "#그라폴리오 #코로나 #마스크"));
        designPosts.add(new Post(R.drawable.design12, "야광 오르골", "소나",
                "2021-01-06", "#그라폴리오 #몽환적인 #예쁜"));
        designPosts.add(new Post(R.drawable.design13, "인연은 가까이", "제이자크",
                "2020-09-26", "#그라폴리오 #인연 #사랑"));
        designPosts.add(new Post(R.drawable.design14, "치유", "제이자크",
                "2020-09-27", "#그라폴리오 #일러스트 #감성"));
        designPosts.add(new Post(R.drawable.design15, "고민", "제이자크",
                "2020-06-25", "#그라폴리오 #달 #달빛"));
        designPosts.add(new Post(R.drawable.design16, "나의기억", "제이자크",
                "2020-05-09", "#그라폴리오 #앨범커버 #감성"));
        designPosts.add(new Post(R.drawable.design17, "노을빛", "제이자크",
                "2020-07-03", "#그라폴리오 #노을빛 #핑크"));
        designPosts.add(new Post(R.drawable.design18, "우리 무슨사이야?", "제이자크",
                "2020-05-06", "#그라폴리오 #썸 #연인"));
        designPosts.add(new Post(R.drawable.design19, "노을", "제이자크",
                "2020-05-06", "#그라폴리오 #노을 #시티팝"));
        designPosts.add(new Post(R.drawable.design20, "잠못이루는밤", "제이자크",
                "2020-05-09", "#그라폴리오 #잠못이루는밤 #아픔"));
        designPosts.add(new Post(R.drawable.design21, "언제그칠지", "제이자크",
                "2020-05-05", "#그라폴리오 #시티팝 #레트로"));
    }

    @Override
    public void onImageClick(int position) {
        Post post = designPosts.get(position);
        Intent intent = new Intent(getActivity(), ImageinfoActivity.class);
        intent.putExtra("post", post);
        startActivity(intent);
    }
}