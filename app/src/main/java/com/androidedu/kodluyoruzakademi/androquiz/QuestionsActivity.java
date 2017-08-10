package com.androidedu.kodluyoruzakademi.androquiz;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.androidedu.kodluyoruzakademi.androquiz.R.id.usernameRetrieved;


public class QuestionsActivity extends AppCompatActivity implements QuestionFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        TextView view = (TextView) findViewById(usernameRetrieved);
        view.setText("Kullanıcı: " + getIntent().getExtras().getString("usernameSet"));

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
    public void onFragmentInteraction(Uri uri) {

    }
}
