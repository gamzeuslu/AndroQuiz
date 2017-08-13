package com.androidedu.kodluyoruzakademi.androquiz;

import java.util.Arrays;

/**
 * This class stores the user's answers as well as the correct answers.
 */


public class AnswerSheet {

    private static String[] answerSheet = new String[5];


    public void setAnswers(String answer, int question) {

        answerSheet[question] = answer;

    }

    public String getAnswers() {

        return Arrays.toString(answerSheet);
    }

    public boolean checkAnswer() {
        return false;
    }



}
