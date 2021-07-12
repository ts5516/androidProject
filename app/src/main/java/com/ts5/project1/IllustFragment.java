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

public class IllustFragment extends Fragment implements ImageAdapter.OnImageListener {

    private View view;
    private RecyclerView recyclerView;
    ImageAdapter imageAdapter;

    List<Post> illustPost;
    public IllustFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = (ViewGroup)inflater.inflate(R.layout.fragment_illust, container, false);

        illustPost = new ArrayList<>();
        postAdd();
        recyclerView = view.findViewById(R.id.illust_recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, 15, false));
        imageAdapter = new ImageAdapter(illustPost, this);
        recyclerView.setAdapter(imageAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }

    public void postAdd(){
        illustPost.add(new Post(R.drawable.illust1, "뚜지", "문종범",
                "2020-02-09", "#그라폴리오 #오구패밀리 #뚜지"));
        illustPost.add(new Post(R.drawable.illust2, "걸레질하는 오구", "문종범",
                "2020-02-09", "#그라폴리오 #오구패밀리 #오리너구리"));
        illustPost.add(new Post(R.drawable.illust3, "이끼와 오구", "문종범",
                "2020-02-09", "#그라폴리오 #오구패밀리 #이끼"));
        illustPost.add(new Post(R.drawable.illust4, "버블과 오구", "문종범",
                "2020-02-09", "#그라폴리오 #오구패밀리 #버블"));
        illustPost.add(new Post(R.drawable.illust5, "삽질하는 뚜지", "문종범",
                "2020-09-06", "#그라폴리오 #오구패밀리 #뚜지"));
        illustPost.add(new Post(R.drawable.illust6, "뚜지와 버섯", "문종범",
                "2020-06-26", "#그라폴리오 #오구패밀리 #뚜지"));
        illustPost.add(new Post(R.drawable.illust7, "물밑", "문종범",
                "2020-06-26", "#그라폴리오 #오구패밀리 #오구"));
        illustPost.add(new Post(R.drawable.illust8, "블루", "문종범",
                "2020-02-09", "#그라폴리오 #오구패밀리 #오구"));
        illustPost.add(new Post(R.drawable.illust9, "여행", "문종범",
                "2020-06-26", "#그라폴리오 #오구패밀리 #오구"));
        illustPost.add(new Post(R.drawable.illust10, "오구", "문종범",
                "2020-09-06", "#그라폴리오 #오구패밀리 #오구"));
        illustPost.add(new Post(R.drawable.illust11, "조명아래 오구", "문종범",
                "2020-06-26", "#그라폴리오 #오구패밀리 #오구"));
        illustPost.add(new Post(R.drawable.illust12, "퍼플", "문종범",
                "2020-09-06", "#그라폴리오 #오구패밀리 #오구"));
        illustPost.add(new Post(R.drawable.illust13, "도타운 프랜즈 산책", "도타운",
                "2021-06-21", "#그라폴리오 #도타운프랜즈"));
        illustPost.add(new Post(R.drawable.illust14, "셀카 VS 남찍", "도타운",
                "2021-07-01", "#그라폴리오 #도타운프랜즈"));
        illustPost.add(new Post(R.drawable.illust15, "나른하다옹", "도타운",
                "2021-06-14", "#그라폴리오 #도타운프랜즈"));
        illustPost.add(new Post(R.drawable.illust16, "3X3 하트", "도타운",
                "2021-06-13", "#그라폴리오 #도타운프랜즈"));
        illustPost.add(new Post(R.drawable.illust17, "댕냥고사", "도타운",
                "2021-01-23", "#그라폴리오 #도타운프랜즈"));
        illustPost.add(new Post(R.drawable.illust18, "그만봐!!", "도타운",
                "2021-01-27", "#그라폴리오 #도타운프랜즈"));
        illustPost.add(new Post(R.drawable.illust19, "들숨에 건강을, 날숨에 재력을", "도타운",
                "2021-01-01", "#그라폴리오 #도타운프랜즈"));
        illustPost.add(new Post(R.drawable.illust20, "Happy New Year", "도타운",
                "2021-01-01", "#그라폴리오 #도타운프랜즈"));
    }

    @Override
    public void onImageClick(int position) {
        Post post = illustPost.get(position);
        Intent intent = new Intent(getActivity(), ImageinfoActivity.class);
        intent.putExtra("post", post);
        startActivity(intent);
    }
}