package com.londonappbrewery.quizzler;

public class TrueFalse {
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionResourceId, boolean trueOrFalse) {
        mQuestionId = questionResourceId;
        mAnswer = trueOrFalse;
    }

    public int getQuestionId() {
        return mQuestionId;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }

    public void setQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;


    }
}
