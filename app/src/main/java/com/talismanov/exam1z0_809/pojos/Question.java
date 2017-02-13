package com.talismanov.exam1z0_809.pojos;

/**
 * Created by Юрий on 13.02.2017.
 */

public class Question {
    private String code;
    private String question;
    private String[] radioButtonTexts;

    public Question(String code, String question, String... radioButtonTexts) {
        this.code = code;
        this.question = question;
        this.radioButtonTexts = radioButtonTexts;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getRadioButtonTexts() {
        return radioButtonTexts;
    }

    public void setRadioButtonTexts(String[] radioButtonTexts) {
        this.radioButtonTexts = radioButtonTexts;
    }
}
