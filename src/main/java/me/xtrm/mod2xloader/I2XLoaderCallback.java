package me.xtrm.mod2xloader;

public interface I2XLoaderCallback {

    void onOutputLog(int level, String logMessage);
    void onFinish();

}
