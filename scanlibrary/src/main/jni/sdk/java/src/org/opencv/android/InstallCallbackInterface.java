package org.opencv.android;

/*Deepak*/
public interface InstallCallbackInterface
{
    /*Deepak*/
    static final int NEW_INSTALLATION = 0;
    /*Deepak*/
    static final int INSTALLATION_PROGRESS = 1;

    /*Deepak*/
    public String getPackageName();
    /*Deepak*/
    public void install();
    /*Deepak*/
    public void cancel();
    /*Deepak*/
    public void wait_install();
};
