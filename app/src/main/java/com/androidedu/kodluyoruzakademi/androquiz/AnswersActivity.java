package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Third Activity class where users check their answers.
 */

public class AnswersActivity extends AppCompatActivity {

    TextView username;
    TextView answerTitle;
    TextView answersRetrieved;

    AnswerSheet answerSheet;

    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        username = (TextView) findViewById(R.id.answersUsernameRetrieved);
        answerTitle = (TextView) findViewById(R.id.userAnswersTitle);
        answersRetrieved = (TextView) findViewById(R.id.userAnswers);

        answerSheet = new AnswerSheet();

        res = getResources();

        username.setText(res.getString(R.string.username, getIntent().getExtras().getString("username")));
        answerTitle.setText(res.getString(R.string.user_answers_title));
        answersRetrieved.setText(res.getString(R.string.answersRetrieved, answerSheet.getAnswers()));


    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {

        super.onStart();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    protected void onStop() {

        super.onStop();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}
