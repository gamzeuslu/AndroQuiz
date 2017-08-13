package com.androidedu.kodluyoruzakademi.androquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
* First Activity class where users log-in to the quiz.
*/

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userNameEntered;
    Button logInButton;
    Intent intentLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        userNameEntered = (EditText) findViewById(R.id.usernameEditText);
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

        intentLogIn.putExtra("usernameSet", userNameEntered.getText().toString());

        startActivity(intentLogIn);

    }
}
