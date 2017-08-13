package com.androidedu.kodluyoruzakademi.androquiz;

import java.util.Arrays;

/**
 * This class stores the user's answers as well as the correct answers.
 */


public class AnswerSheet {

    private static int[] answerSheet = new int[5];


    public void setAnswers(int answer, int question) {

        answerSheet[question] = answer;

    }

    public String getAnswers() {

        return Arrays.toString(answerSheet);
    }

}
