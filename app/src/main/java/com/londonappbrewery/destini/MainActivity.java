package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    public TextView mStoryTextView;
    public Button mT1Answer, mT2Answer;
    public String mTopButton, mBottomButton;
    public int mStoryIndex = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mT1Answer = findViewById(R.id.buttonTop);
        mT2Answer = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mT1Answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mT1Answer.setText(R.string.T3_Ans1);
                    mT2Answer.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    mStoryTextView.setText(R.string.T6_End);
                    mT1Answer.setVisibility(View.GONE);
                    mT2Answer.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mT2Answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mT1Answer.setText(R.string.T2_Ans1);
                    mT2Answer.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mT1Answer.setVisibility(View.GONE);
                    mT2Answer.setVisibility(View.GONE);
                    mStoryIndex = 3;
                } else {
                    mStoryTextView.setText(R.string.T5_End);
                    mT1Answer.setVisibility(View.GONE);
                    mT2Answer.setVisibility(View.GONE);
                }
            }
        });

    }
    }