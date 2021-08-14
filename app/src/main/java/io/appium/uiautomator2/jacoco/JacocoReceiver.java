package io.appium.uiautomator2.jacoco;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import io.appium.uiautomator2.utils.Logger;

public class JacocoReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Logger.info("JacocoReceiver Received broadcast action: " + intent.getAction());

        if ("android.intent.action.JACOCO_REPORT".equalsIgnoreCase(intent.getAction())) {
            //处理上传逻辑
            JacocoHelper.generateEcFile(true);
        }
    }
}
