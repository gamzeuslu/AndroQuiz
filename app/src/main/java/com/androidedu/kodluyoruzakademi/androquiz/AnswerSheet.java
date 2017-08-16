package com.androidedu.kodluyoruzakademi.androquiz;

import java.util.Arrays;

/**
 * This class stores the user's answers as well as the correct answers.
 */


class AnswerSheet {

    private static String[] answerSheet = new String[5];

    private static int[] answerIds = new int[5];

    private static int[] correctAnswers = new int[5];

    private static boolean[] results = new boolean[5];

    //private QuestionsActivity questionsActivity = new QuestionsActivity();

    AnswerSheet() {

        QuestionsActivity questionsActivity = new QuestionsActivity();

        correctAnswers[0] = questionsActivity.getButtonId(questionsActivity.optionA);
        correctAnswers[1] = questionsActivity.getButtonId(questionsActivity.optionB);
        correctAnswers[2] = questionsActivity.getButtonId(questionsActivity.optionC);
        correctAnswers[3] = questionsActivity.getButtonId(questionsActivity.optionD);
        correctAnswers[4] = questionsActivity.getButtonId(questionsActivity.optionA);
    }


    void setAnswers(String answer, int question, int selectedOption) {

        answerSheet[question] = answer;
        answerIds[question] = selectedOption;

    }

    String getAnswers() {

        return Arrays.toString(answerSheet);

    }

    String getResults() {

        return Arrays.toString(results);
    }


    void checkAnswers() {

        for (int i = 0; i < 5; i++)
            results[i] = answerIds[i] == correctAnswers[i];

    }
}
