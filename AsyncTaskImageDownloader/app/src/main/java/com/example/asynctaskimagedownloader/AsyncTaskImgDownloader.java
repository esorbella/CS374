package com.example.asynctaskimagedownloader;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.TextView;

public class AsyncTaskImgDownloader extends AsyncTask<String, Integer, Bitmap> {

    @Override
    protected Bitmap doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        TextView tv = (TextView) myActivity.findViewById(R.id.textview_loading);
        if(values[0] == LOADING)
        {
            tv.setText("Loading...");
        }
        else
        {
            tv.setText("This is a random image!");
        }
    }
}
