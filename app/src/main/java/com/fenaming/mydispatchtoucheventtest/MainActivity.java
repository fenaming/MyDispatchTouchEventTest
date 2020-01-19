package com.fenaming.mydispatchtoucheventtest;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.fenaming.mydispatchtoucheventtest.baseview.MyTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private static final String TAG = "FZM-MainActivity";

    @BindView(R.id.test_module_tv)
    MyTextView testModuleTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @OnClick(R.id.test_module_tv)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.test_module_tv:
                Log.e(TAG, "onViewClicked: MyTextView Click!");
                break;
            default:
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "dispatchTouchEvent: ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "dispatchTouchEvent: ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "dispatchTouchEvent: ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i(TAG, "dispatchTouchEvent: ACTION_CANCEL");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onTouchEvent: ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "onTouchEvent: ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onTouchEvent: ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i(TAG, "onTouchEvent: ACTION_CANCEL");
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId()){
            case R.id.test_module_tv:
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i(TAG, "onTouchEvent: ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.i(TAG, "onTouchEvent: ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.i(TAG, "onTouchEvent: ACTION_UP");
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        Log.i(TAG, "onTouchEvent: ACTION_CANCEL");
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return false;
    }
}
