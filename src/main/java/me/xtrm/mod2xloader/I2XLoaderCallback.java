package me.xtrm.mod2xloader;

@FunctionalInterface
public interface I2XLoaderCallback {

    I2XLoaderCallback STD_OUT = new I2XLoaderCallback() {
        @Override
        public void onLog(int level, String logMessage) {
            System.out.println("[Mod2XLoader] " + logMessage + " (Level: " + level + ")");
        }

        @Override public void onFinish() {}
    };

    default void onLog(int level, String logMessage) {}

    void onFinish();

}
