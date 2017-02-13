package com.talismanov.exam1z0_809;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.talismanov.exam1z0_809.pojos.Question;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    private TextView questionTextView;
    private TextView codeTextView;
    private RadioGroup questionRadioGroup;
    private Button nextButton;

    private Question question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionTextView = (TextView) findViewById(R.id.question);
        codeTextView = (TextView) findViewById(R.id.code);
        questionRadioGroup = (RadioGroup) findViewById(R.id.radio_group_quiz);
        nextButton = (Button) findViewById(R.id.next_quiz_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNewQuestion();
            }
        });

        String questionCode = "class HappyGarbage01 \n" +
                "{ \n" +
                "    public static void main(String args[]) \n" +
                "    {\n" +
                "        HappyGarbage01 h = new HappyGarbage01(); \n" +
                "        h.methodA(); /* Line 6 */\n" +
                "    } \n" +
                "    Object methodA() \n" +
                "    {\n" +
                "        Object obj1 = new Object(); \n" +
                "        Object [] obj2 = new Object[1]; \n" +
                "        obj2[0] = obj1; \n" +
                "        obj1 = null; \n" +
                "        return obj2[0]; \n" +
                "    } \n" +
                "}";

        String questionQuestion = "Where will be the most chance of the garbage collector being invoked?";



        question = new Question(questionCode,questionQuestion, "A.	After line 9",
                "B.	After line 10",
                "C.	After line 11",
                "D.	Garbage collector never invoked in methodA()" );
    }

    private void showNewQuestion() {
        questionTextView.setText(question.getQuestion());
        codeTextView.setText(question.getCode());
        ;
        int count = questionRadioGroup.getChildCount();
        ArrayList<RadioButton> listOfRadioButtons = new ArrayList<RadioButton>();
        for (int i=0;i<count;i++) {
            View o = questionRadioGroup.getChildAt(i);
            if (o instanceof RadioButton) {
                listOfRadioButtons.add((RadioButton)o);
            }
        }

        int i = 0;
        String[] radioButtonTexts = question.getRadioButtonTexts();
        for (RadioButton radioButton : listOfRadioButtons) {
            String radioButtonText = radioButtonTexts[i];
            radioButton.setText(radioButtonText);
            i++;
        }
        questionRadioGroup.clearCheck();
    }


}
