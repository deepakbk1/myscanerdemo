package com.scanlibrary;

import android.net.Uri;

/*Deepak*/
public interface IScanner {

    void onBitmapSelect(Uri uri);

    void onScanFinish(Uri uri);
}
