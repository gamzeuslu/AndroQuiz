package com.androidedu.kodluyoruzakademi.androquiz;

/**
 * This class stores the user's answers as well as the correct answers.
 */


class AnswerSheet {

    private static AnswerSheet newInstance;

    private static String[] answerSheet = new String[5];

    private static int[] answerIds = new int[5];

    private static int[] correctAnswers = new int[5];

    private AnswerSheet() {
    }

    static AnswerSheet getNewInstance() {

        if (newInstance == null) {

            newInstance = new AnswerSheet();
        }

        return newInstance;
    }

    void init(QuestionsActivity questionsActivity) {

        correctAnswers[0] = questionsActivity.getButtonId(questionsActivity.optionC);
        correctAnswers[1] = questionsActivity.getButtonId(questionsActivity.optionD);
        correctAnswers[2] = questionsActivity.getButtonId(questionsActivity.optionB);
        correctAnswers[3] = questionsActivity.getButtonId(questionsActivity.optionA);
        correctAnswers[4] = questionsActivity.getButtonId(questionsActivity.optionC);
    }

    void setAnswer(String answer, int question, int selectedOption) {

        answerSheet[question] = answer;
        answerIds[question] = selectedOption;

    }

    String getAnswer(int question) {

        return answerSheet[question];

    }


    String checkAnswer(int answer) {

        String result;

        boolean flag = answerIds[answer] == correctAnswers[answer];

        if (flag)
            result = "DOĞRU";
        else
            result = "YANLIŞ";

        return result;

    }
}
