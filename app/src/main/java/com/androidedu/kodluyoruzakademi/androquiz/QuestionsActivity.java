package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Second Activity class where users go through the quiz.
 */

public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener {

    int clickCounter;
    int selectedOptionId;

    String selectedOptionText;

    RadioGroup options;

    RadioButton optionA;
    RadioButton optionB;
    RadioButton optionC;
    RadioButton optionD;

    TextView selectedOption;
    TextView username;
    TextView questionNumber;
    TextView questionText;

    Button continueButton;
    Button submitButton;

    Resources res;

    Intent intentQuestions;

    public int getButtonId(RadioButton button) {

        return button.getId();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        clickCounter = 0;

        username = (TextView) findViewById(R.id.questionsUsernameRetrieved);
        questionNumber = (TextView) findViewById(R.id.questionNumber);
        questionText = (TextView) findViewById(R.id.questionText);

        options = (RadioGroup) findViewById(R.id.radioGroup);

        optionA = (RadioButton) findViewById(R.id.optionA);
        optionA.setOnClickListener(this);
        optionB = (RadioButton) findViewById(R.id.optionB);
        optionB.setOnClickListener(this);
        optionC = (RadioButton) findViewById(R.id.optionC);
        optionC.setOnClickListener(this);
        optionD = (RadioButton) findViewById(R.id.optionD);
        optionD.setOnClickListener(this);

        continueButton = (Button) findViewById(R.id.continueButton);
        continueButton.setOnClickListener(this);
        continueButton.setVisibility(View.VISIBLE);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(this);
        submitButton.setVisibility(View.GONE);

        AnswerSheet.getNewInstance().init(this);

        res = getResources();

        username.setText(res.getString(R.string.username, getIntent().getExtras().getString("username")));

        questionNumber.setText(res.getString(R.string.question_number, clickCounter + 1));

        questionText.setText(res.getStringArray(R.array.questions)[clickCounter]);

        optionA.setText(res.getString(R.string.optionA_radio, res.getStringArray(R.array.optionA)[clickCounter]));
        optionB.setText(res.getString(R.string.optionB_radio, res.getStringArray(R.array.optionB)[clickCounter]));
        optionC.setText(res.getString(R.string.optionC_radio, res.getStringArray(R.array.optionC)[clickCounter]));
        optionD.setText(res.getString(R.string.optionD_radio, res.getStringArray(R.array.optionD)[clickCounter]));

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

        switch (view.getId()) {
            case R.id.continueButton:

                selectedOptionId = options.getCheckedRadioButtonId();
                selectedOption = (TextView) findViewById(selectedOptionId);
                selectedOptionText = selectedOption.getText().toString();
                AnswerSheet.getNewInstance().setAnswer(selectedOptionText, clickCounter, selectedOptionId);


                options.clearCheck();
                continueButton.setEnabled(false);

                if (clickCounter < 3) {
                    clickCounter++;
                    questionNumber.setText(res.getString(R.string.question_number, clickCounter + 1));
                    questionText.setText(res.getStringArray(R.array.questions)[clickCounter]);
                    optionA.setText(res.getString(R.string.optionA_radio, res.getStringArray(R.array.optionA)[clickCounter]));
                    optionB.setText(res.getString(R.string.optionB_radio, res.getStringArray(R.array.optionB)[clickCounter]));
                    optionC.setText(res.getString(R.string.optionC_radio, res.getStringArray(R.array.optionC)[clickCounter]));
                    optionD.setText(res.getString(R.string.optionD_radio, res.getStringArray(R.array.optionD)[clickCounter]));
                } else if (clickCounter == 3) {
                    clickCounter++;
                    questionNumber.setText(res.getString(R.string.question_number, clickCounter + 1));
                    questionText.setText(res.getStringArray(R.array.questions)[clickCounter]);
                    optionA.setText(res.getString(R.string.optionA_radio, res.getStringArray(R.array.optionA)[clickCounter]));
                    optionB.setText(res.getString(R.string.optionB_radio, res.getStringArray(R.array.optionB)[clickCounter]));
                    optionC.setText(res.getString(R.string.optionC_radio, res.getStringArray(R.array.optionC)[clickCounter]));
                    optionD.setText(res.getString(R.string.optionD_radio, res.getStringArray(R.array.optionD)[clickCounter]));

                    continueButton.setVisibility(View.GONE);
                    submitButton.setVisibility(View.VISIBLE);

                }

                break;

            case R.id.submitButton:

                selectedOptionId = options.getCheckedRadioButtonId();
                selectedOption = (TextView) findViewById(selectedOptionId);
                selectedOptionText = selectedOption.getText().toString();
                AnswerSheet.getNewInstance().setAnswer(selectedOptionText, clickCounter, selectedOptionId);

                intentQuestions = new Intent(QuestionsActivity.this, AnswersActivity.class);
                intentQuestions.putExtra("username", getIntent().getExtras().getString("username"));
                startActivity(intentQuestions);

                break;

            case R.id.optionA:

            case R.id.optionB:

            case R.id.optionC:

            case R.id.optionD:

                continueButton.setEnabled(true);

                break;

        }
    }

}
