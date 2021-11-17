package com.example.previewpicture.nine.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.blankj.utilcode.util.ScreenUtils;
import com.example.previewpicture.ImageUrlConfig;
import com.example.previewpicture.R;
import com.example.previewpicture.bean.UserViewInfo;
import com.previewlibrary.GPreviewBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * desc:
 * author: Lzj
 * date: 2021/11/17
 */
public class SingleImgActivity  extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_img);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<UserViewInfo> list=new ArrayList<>();
                Rect bounds = new Rect();
                bounds.left=ScreenUtils.getScreenWidth()/2;
                bounds.top= ScreenUtils.getScreenHeight()/2;
                bounds.right=ScreenUtils.getScreenWidth()/2;
                bounds.bottom=ScreenUtils.getScreenHeight()/2;
                UserViewInfo info=new UserViewInfo(  ImageUrlConfig.getUrls().get(0));
                info.setBounds(bounds);

                list.add(info);
                GPreviewBuilder.from(SingleImgActivity.this)
                        .setData(list)
                        .setIsScale(true)
                        .setCurrentIndex(0)
                        .setType(GPreviewBuilder.IndicatorType.Dot)
                        .start();//启动
            }
        });
    }
    /**
     * 查找信息
     * @param list 图片集合
     */
    private void computeBoundsBackward(List<UserViewInfo> list) {
//        for (int i = 0;i < mNglContent.getChildCount(); i++) {
//            View itemView = mNglContent.getChildAt(i);
//            Rect bounds = new Rect();
//            if (itemView != null) {
//                ImageView thumbView = (ImageView) itemView;
//                thumbView.getGlobalVisibleRect(bounds);
//            }
//            list.get(i).setBounds(bounds);
//            list.get(i).setUrl(list.get(i).getUrl());
//        }

    }
}
