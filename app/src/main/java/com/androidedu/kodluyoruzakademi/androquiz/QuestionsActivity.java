package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener {

    int clickCounter;

    TextView showUsernameQuestions;
    TextView questionNumber;
    TextView questionText;
    TextView optionAText;
    TextView optionBText;
    TextView optionCText;
    TextView optionDText;

    Button continueButton;
    Button submitButton;

    Resources res;

    Intent intentQuestions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        clickCounter = 0;

        showUsernameQuestions = (TextView) findViewById(R.id.usernameRetrieved);
        questionNumber = (TextView) findViewById(R.id.questionNumber);
        questionText = (TextView) findViewById(R.id.questionText);
        optionAText = (TextView) findViewById(R.id.optionA);
        optionBText = (TextView) findViewById(R.id.optionB);
        optionCText = (TextView) findViewById(R.id.optionC);
        optionDText = (TextView) findViewById(R.id.optionD);

        continueButton = (Button) findViewById(R.id.continueButton);
        continueButton.setOnClickListener(this);
        continueButton.setVisibility(View.VISIBLE);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);
        submitButton.setVisibility(View.GONE);

        res = getResources();

        showUsernameQuestions.setText(res.getString(R.string.username, getIntent().getExtras().getString("usernameSet")));
        questionNumber.setText(res.getString(R.string.question_number, clickCounter+1));
        questionText.setText(res.getStringArray(R.array.questions)[clickCounter]);
        optionAText.setText(res.getString(R.string.optionA_radio, res.getStringArray(R.array.optionA)[clickCounter]));
        optionBText.setText(res.getString(R.string.optionB_radio, res.getStringArray(R.array.optionB)[clickCounter]));
        optionCText.setText(res.getString(R.string.optionC_radio, res.getStringArray(R.array.optionC)[clickCounter]));
        optionDText.setText(res.getString(R.string.optionD_radio, res.getStringArray(R.array.optionD)[clickCounter]));

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


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.continueButton:

                if(clickCounter < 3) {
                    clickCounter++;
                    showUsernameQuestions.setText(res.getString(R.string.username, getIntent().getExtras().getString("usernameSet")));
                    questionNumber.setText(res.getString(R.string.question_number, clickCounter+1));
                    questionText.setText(res.getStringArray(R.array.questions)[clickCounter]);
                    optionAText.setText(res.getString(R.string.optionA_radio, res.getStringArray(R.array.optionA)[clickCounter]));
                    optionBText.setText(res.getString(R.string.optionB_radio, res.getStringArray(R.array.optionB)[clickCounter]));
                    optionCText.setText(res.getString(R.string.optionC_radio, res.getStringArray(R.array.optionC)[clickCounter]));
                    optionDText.setText(res.getString(R.string.optionD_radio, res.getStringArray(R.array.optionD)[clickCounter]));
                }

                else if(clickCounter == 3) {
                    clickCounter++;
                    showUsernameQuestions.setText(res.getString(R.string.username, getIntent().getExtras().getString("usernameSet")));
                    questionNumber.setText(res.getString(R.string.question_number, clickCounter+1));
                    questionText.setText(res.getStringArray(R.array.questions)[clickCounter]);
                    optionAText.setText(res.getString(R.string.optionA_radio, res.getStringArray(R.array.optionA)[clickCounter]));
                    optionBText.setText(res.getString(R.string.optionB_radio, res.getStringArray(R.array.optionB)[clickCounter]));
                    optionCText.setText(res.getString(R.string.optionC_radio, res.getStringArray(R.array.optionC)[clickCounter]));
                    optionDText.setText(res.getString(R.string.optionD_radio, res.getStringArray(R.array.optionD)[clickCounter]));

                    continueButton.setVisibility(View.GONE);
                    submitButton.setVisibility(View.VISIBLE);

                }

                break;

            case R.id.submitButton:

                intentQuestions = new Intent(QuestionsActivity.this, AnswersActivity.class);
                startActivity(intentQuestions);

                break;
        }
    }
}
