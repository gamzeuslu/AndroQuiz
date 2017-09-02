package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.androidedu.kodluyoruzakademi.androquiz.R.string.answer_five_retrieved;
import static com.androidedu.kodluyoruzakademi.androquiz.R.string.answer_four_retrieved;
import static com.androidedu.kodluyoruzakademi.androquiz.R.string.answer_one_retrieved;
import static com.androidedu.kodluyoruzakademi.androquiz.R.string.answer_three_retrieved;
import static com.androidedu.kodluyoruzakademi.androquiz.R.string.answer_two_retrieved;

/**
 * Third Activity class where users see their results.
 */

public class AnswersActivity extends AppCompatActivity {

    TextView username;
    TextView answerTitle;
    TextView answer1Retrieved;
    TextView answer2Retrieved;
    TextView answer3Retrieved;
    TextView answer4Retrieved;
    TextView answer5Retrieved;

    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        username = (TextView) findViewById(R.id.answersUsernameRetrieved);
        answerTitle = (TextView) findViewById(R.id.userAnswersTitle);
        answer1Retrieved = (TextView) findViewById(R.id.userAnswer1);
        answer2Retrieved = (TextView) findViewById(R.id.userAnswer2);
        answer3Retrieved = (TextView) findViewById(R.id.userAnswer3);
        answer4Retrieved = (TextView) findViewById(R.id.userAnswer4);
        answer5Retrieved = (TextView) findViewById(R.id.userAnswer5);

        res = getResources();

        username.setText(res.getString(R.string.username, getIntent().getExtras().getString("username")));
        answerTitle.setText(res.getString(R.string.user_answers_title));
        answer1Retrieved.setText(res.getString(answer_one_retrieved, AnswerSheet.getNewInstance().getAnswer(0), AnswerSheet.getNewInstance().checkAnswer(0)));
        answer2Retrieved.setText(res.getString(answer_two_retrieved, AnswerSheet.getNewInstance().getAnswer(1), AnswerSheet.getNewInstance().checkAnswer(1)));
        answer3Retrieved.setText(res.getString(answer_three_retrieved, AnswerSheet.getNewInstance().getAnswer(2), AnswerSheet.getNewInstance().checkAnswer(2)));
        answer4Retrieved.setText(res.getString(answer_four_retrieved, AnswerSheet.getNewInstance().getAnswer(3), AnswerSheet.getNewInstance().checkAnswer(3)));
        answer5Retrieved.setText(res.getString(answer_five_retrieved, AnswerSheet.getNewInstance().getAnswer(4), AnswerSheet.getNewInstance().checkAnswer(4)));

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
