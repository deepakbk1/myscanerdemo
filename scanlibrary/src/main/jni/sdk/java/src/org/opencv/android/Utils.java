package org.opencv.android;

import android.content.Context;
import android.graphics.Bitmap;

import org.opencv.core.CvException;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils {

    public static String exportResource(Context context, int resourceId) {
        return exportResource(context, resourceId, "OpenCV_data");
    }

    public static String exportResource(Context context, int resourceId, String dirname) {
        String fullname = context.getResources().getString(resourceId);
        String resName = fullname.substring(fullname.lastIndexOf("/") + 1);
        try {
            InputStream is = context.getResources().openRawResource(resourceId);
            File resDir = context.getDir(dirname, Context.MODE_PRIVATE);
            File resFile = new File(resDir, resName);

            FileOutputStream os = new FileOutputStream(resFile);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            os.close();

            return resFile.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            throw new CvException("Failed to export resource " + resName
                    + ". Exception thrown: " + e);
        }
    }

    public static Mat loadResource(Context context, int resourceId) throws IOException
    {
        return loadResource(context, resourceId, -1);
    }

    public static Mat loadResource(Context context, int resourceId, int flags) throws IOException
    {
        InputStream is = context.getResources().openRawResource(resourceId);
        ByteArrayOutputStream os = new ByteArrayOutputStream(is.available());

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = is.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        is.close();

        Mat encoded = new Mat(1, os.size(), CvType.CV_8U);
        encoded.put(0, 0, os.toByteArray());
        os.close();

        Mat decoded = Imgcodecs.imdecode(encoded, flags);
        encoded.release();

        return decoded;
    }

    /*Deepak*/
    public static void bitmapToMat(Bitmap bmp, Mat mat, boolean unPremultiplyAlpha) {
        if (bmp == null)
            throw new java.lang.IllegalArgumentException("bmp == null");
        if (mat == null)
            throw new java.lang.IllegalArgumentException("mat == null");
        nBitmapToMat2(bmp, mat.nativeObj, unPremultiplyAlpha);
    }

    /*Deepak*/
    public static void bitmapToMat(Bitmap bmp, Mat mat) {
        bitmapToMat(bmp, mat, false);
    }


    /*Deepak*/
    public static void matToBitmap(Mat mat, Bitmap bmp, boolean premultiplyAlpha) {
        if (mat == null)
            throw new java.lang.IllegalArgumentException("mat == null");
        if (bmp == null)
            throw new java.lang.IllegalArgumentException("bmp == null");
        nMatToBitmap2(mat.nativeObj, bmp, premultiplyAlpha);
    }

    /*Deepak*/
    public static void matToBitmap(Mat mat, Bitmap bmp) {
        matToBitmap(mat, bmp, false);
    }


    private static native void nBitmapToMat2(Bitmap b, long m_addr, boolean unPremultiplyAlpha);

    private static native void nMatToBitmap2(long m_addr, Bitmap b, boolean premultiplyAlpha);
}
