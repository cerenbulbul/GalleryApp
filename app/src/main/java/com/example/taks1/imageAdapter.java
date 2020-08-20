package com.example.taks1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {


    private Context mContext;

    public int[] imageArray = {
            R.drawable.list1, R.drawable.list2, R.drawable.list3,
            R.drawable.list4,R.drawable.list5, R.drawable.list6,
            R.drawable.list7, R.drawable.list8,R.drawable.list9,
            R.drawable.list10
    };

    public imageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(460,500));

        return imageView;
    }
}
