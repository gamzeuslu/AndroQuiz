package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * First Activity class where users log-in to the quiz.
 */

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    EditText usernameEntered;
    EditText passwordEntered;
    Button logInButton;
    Intent intentLogIn;
    TextWatcher textWatcher = new TextWatcher() {

        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (usernameEntered.getText().toString().length() != 0 && passwordEntered.getText().toString().length() != 0)
                logInButton.setEnabled(true);
        }

        public void afterTextChanged(Editable s) {

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        usernameEntered = (EditText) findViewById(R.id.usernameEditText);
        usernameEntered.addTextChangedListener(textWatcher);
        passwordEntered = (EditText) findViewById(R.id.passwordEditText);
        passwordEntered.addTextChangedListener(textWatcher);
        logInButton = (Button) findViewById(R.id.logInButton);
        logInButton.setOnClickListener(this);

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

        intentLogIn = new Intent(LogInActivity.this, QuestionsActivity.class);

        intentLogIn.putExtra("username", usernameEntered.getText().toString());

        startActivity(intentLogIn);
    }

}
