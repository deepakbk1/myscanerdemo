package org.opencv.android;

import android.content.Context;

/*Deepak*/
public class OpenCVLoader
{
    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_2 = "2.4.2";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_3 = "2.4.3";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_4 = "2.4.4";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_5 = "2.4.5";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_6 = "2.4.6";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_7 = "2.4.7";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_8 = "2.4.8";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_9 = "2.4.9";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_10 = "2.4.10";

    /*Deepak*/
    public static final String OPENCV_VERSION_2_4_11 = "2.4.11";

    /*Deepak*/
    public static final String OPENCV_VERSION_3_0_0 = "3.0.0";

    /*Deepak*/
    public static final String OPENCV_VERSION_3_1_0 = "3.1.0";


    /*Deepak*/
    public static boolean initDebug()
    {
        return StaticHelper.initOpenCV(false);
    }

    /*Deepak*/
    public static boolean initDebug(boolean InitCuda)
    {
        return StaticHelper.initOpenCV(InitCuda);
    }

    /*Deepak*/
    public static boolean initAsync(String Version, Context AppContext,
            LoaderCallbackInterface Callback)
    {
        return AsyncServiceHelper.initOpenCV(Version, AppContext, Callback);
    }
}
