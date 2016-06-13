package com.example.hzwangwentong.ripplelayout;

/**
 * Created by hzwangwentong on 2015/8/24.
 */
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.hzwangwentong.ripplelayout.MaterialRippleLayout;


public class DemoActivity extends Activity implements View.OnClickListener, View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);


        findViewById(R.id.ripple_layout_1).setOnClickListener(this);
        findViewById(R.id.ll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent   intent=new Intent(DemoActivity.this,TTActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.ripple_layout_1).setOnLongClickListener(this);


        View view = findViewById(R.id.ripple_layout_2);
        MaterialRippleLayout.on(view)
                .rippleColor(Color.parseColor("#D32F2F"))   //���ò��Ƶ���ɫ  ������ɫ�����������ã�ͨ��R.color.XXXX����������Ч��
                .rippleAlpha(0.1f)
                .rippleHover(true)
                .create();

        view.setOnLongClickListener(this);
        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

}