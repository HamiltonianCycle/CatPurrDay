package com.catpurrday;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class CatFetcher extends AsyncTask<String, String, Bitmap> {

    private Bitmap mBitmap;
    private ImageView mCatImage;

    public CatFetcher(ImageView catImage) {
        mCatImage = catImage;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Bitmap doInBackground(String... args) {
        try {
            mBitmap = BitmapFactory.decodeStream((InputStream) new URL(args[0]).getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mBitmap;
    }

    @Override
    protected void onPostExecute(Bitmap image) {
        if(image != null) {
            mCatImage.setImageBitmap(image);
        }
    }

}
