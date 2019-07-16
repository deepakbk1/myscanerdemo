package com.scanlibrary;

import android.os.Environment;

/*Deepak*/
public class ScanConstants {


    public final static int START_CAMERA_REQUEST_CODE = 2;
    public final static String OPEN_INTENT_PREFERENCE = "selectContent";
    public final static int OPEN_CAMERA = 4;
    public final static String SCANNED_RESULT = "scannedResult";
    public final static String IMAGE_PATH = Environment
            .getExternalStorageDirectory().getPath() + "/scanSample";

    public final static String SELECTED_BITMAP = "selectedBitmap";
}
