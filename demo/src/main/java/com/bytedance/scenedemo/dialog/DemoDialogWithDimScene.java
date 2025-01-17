package com.bytedance.scenedemo.dialog;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.bytedance.scene.Scene;
import com.bytedance.scenedemo.utility.ColorUtil;

/**
 * Created by JiangQi on 8/9/18.
 */
public class DemoDialogWithDimScene extends Scene {
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FrameLayout layout = new FrameLayout(getActivity());
        layout.setBackgroundColor(Color.parseColor("#99000000"));

        TextView textView = new TextView(getActivity());
        textView.setText(getNavigationScene().getStackHistory());
        textView.setBackgroundColor(ColorUtil.getMaterialColor(getResources(), 1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(600, 600);
        layoutParams.gravity = Gravity.CENTER;

        layout.addView(textView, layoutParams);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNavigationScene().pop();
            }
        });

        return layout;
    }
}
