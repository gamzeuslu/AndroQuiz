package com.androidedu.kodluyoruzakademi.androquiz;

import java.util.Arrays;

/**
 * This class stores the user's answers as well as the correct answers.
 */


public class AnswerSheet {

    private static String[] answerSheet = new String[5];

    private static int[] answerIds = new int[5];

    private static int[] correctAnswers = new int[5];

    public AnswerSheet() {

        correctAnswers[0] = QuestionsActivity.getButtonId(QuestionsActivity.optionA);
        correctAnswers[1] = QuestionsActivity.getButtonId(QuestionsActivity.optionB);
        correctAnswers[2] = QuestionsActivity.getButtonId(QuestionsActivity.optionC);
        correctAnswers[3] = QuestionsActivity.getButtonId(QuestionsActivity.optionD);
        correctAnswers[4] = QuestionsActivity.getButtonId(QuestionsActivity.optionA);
    }


    public void setAnswers(String answer, int question, int selectedOption) {

        answerSheet[question] = answer;
        answerIds[question] = selectedOption;

    }

    public String getAnswers() {

        return Arrays.toString(answerSheet);
    }


}
