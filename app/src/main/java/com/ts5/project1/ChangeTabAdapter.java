package com.ts5.project1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

public class ChangeTabAdapter extends FragmentStateAdapter {
    public ChangeTabAdapter(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new IllustFragment();
            case 1:
                return new PaintFragment();
            default:
                return new DesignFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
