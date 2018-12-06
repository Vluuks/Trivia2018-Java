package com.example.gebruiker.triviaaaaaaaaah;

import java.util.ArrayList;

public interface TriviaCallback {

    void onQuestionsReceived(ArrayList<Question> questionList);
    void onErrorReceived();
}
