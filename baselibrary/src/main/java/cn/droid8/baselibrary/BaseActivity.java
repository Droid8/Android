package cn.droid8.baselibrary;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import cn.droid8.baselibrary.klog.KLog;


/**
 * Created by admin on 2016/11/4.
 */

public class BaseActivity extends AppCompatActivity {
    // used as TAG or MSG
    private String TAG_MSG = "@" + this.getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        KLog.i(TAG_MSG, "saved: " + savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        KLog.i(TAG_MSG);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        KLog.i(TAG_MSG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        KLog.i(TAG_MSG);
    }

    @Override
    protected void onPause() {
        super.onPause();
        KLog.i(TAG_MSG);
    }

    @Override
    protected void onStop() {
        super.onStop();
        KLog.i(TAG_MSG);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        KLog.i(TAG_MSG, intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        KLog.i(TAG_MSG);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        KLog.i(TAG_MSG);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        KLog.i(TAG_MSG, "@level-" + level);
    }

    @Override
    public void finish() {
        super.finish();
        KLog.i(TAG_MSG);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        KLog.i(TAG_MSG, newConfig);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        KLog.i(TAG_MSG);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        KLog.i(TAG_MSG, "outState: " + outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        KLog.i(TAG_MSG, "save: " + savedInstanceState);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        KLog.i(TAG_MSG, "requestCode = " + requestCode + ", resultCode = " + resultCode + ", data = " + data);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        KLog.i(TAG_MSG);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        KLog.i(TAG_MSG, ev);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        KLog.i(TAG_MSG, event);
        return super.onTouchEvent(event);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        KLog.i(TAG_MSG);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        KLog.i(TAG_MSG);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        KLog.i(TAG_MSG);
    }
}