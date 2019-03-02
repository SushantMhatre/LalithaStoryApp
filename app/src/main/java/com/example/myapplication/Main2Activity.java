package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView story;
    ScrollView mScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        story = (TextView) findViewById(R.id.story_text_id);
        mScrollView = (ScrollView) findViewById(R.id.SCROLLER_ID);
        int i = getIntent().getIntExtra("POSITION", 0);
        story.setText(findStoryId(i));
        //story.setMovementMethod(new ScrollingMovementMethod());
        mScrollView.smoothScrollTo(0, story.getBottom());
    }

    private int findStoryId(int pos) {
        int id;
        switch (pos) {
            case 0:
                id = R.string.Story_Body_1;
                break;
            case 1:
                id = R.string.Story_body_2;
                break;
            case 2:
                id = R.string.Story_body_2;
                break;
            case 3:
                id = R.string.Story_body_4;
                break;
            case 4:
                id = R.string.Story_body_5;
                break;
            default:
                id = 0;
        }
        return id;
    }
}
