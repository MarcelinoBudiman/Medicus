package org.meicode.medicus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdaptor extends BaseAdapter {
    private String[] text;
    private int[] image;
    private Context context;
    private LayoutInflater layoutInflater;

    public GridAdaptor(Context c, String[] text, int[] image) {
        this.text = text;
        this.image = image;
        this.context = c;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view == null){
            view = layoutInflater.inflate(R.layout.activity_individualmenu,parent, false);
        }

        TextView txtView = view.findViewById(R.id.textView);
        ImageView imgView = view.findViewById(R.id.imageView);

        txtView.setText(text[position]);
        imgView.setImageResource(image[position]);


        return view;
    }

}
