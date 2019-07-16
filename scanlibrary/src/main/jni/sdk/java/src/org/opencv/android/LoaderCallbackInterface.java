package org.opencv.android;

/*Deepak*/
public interface LoaderCallbackInterface
{
    /*Deepak*/
    static final int SUCCESS = 0;
    /*Deepak*/
    static final int MARKET_ERROR = 2;
    /*Deepak*/
    static final int INSTALL_CANCELED = 3;
    /*Deepak*/
    static final int INCOMPATIBLE_MANAGER_VERSION = 4;
    /*Deepak*/
    static final int INIT_FAILED = 0xff;

    /*Deepak*/
    public void onManagerConnected(int status);

    /*Deepak*/
    public void onPackageInstall(final int operation, InstallCallbackInterface callback);
};
