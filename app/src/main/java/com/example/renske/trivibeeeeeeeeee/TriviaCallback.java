package com.example.renske.trivibeeeeeeeeee;

import java.util.ArrayList;

public interface TriviaCallback {

    void onQuestionsReceived(ArrayList<Question> questionList);
    void onErrorReceived();
}
