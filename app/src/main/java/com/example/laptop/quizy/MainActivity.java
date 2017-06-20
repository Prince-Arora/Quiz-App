package com.example.laptop.quizy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    String ques1 = "";
    String ques2 = "";
    String ques3 = "";
    int id = R.id.que3_Radio1;
    int correct = 0;
    int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void conditions() {
        EditText text = (EditText) findViewById(R.id.que1);
        ques1 = text.getText().toString();
        EditText text1 = (EditText) findViewById(R.id.que2);
        ques2 = text1.getText().toString();
        EditText text2 = (EditText) findViewById(R.id.que5);
        ques3 = text2.getText().toString();
        RadioGroup r = (RadioGroup) findViewById(R.id.RG1);
        CheckBox ques4_1 = (CheckBox) findViewById(R.id.ques4_check1);
        CheckBox ques4_2 = (CheckBox) findViewById(R.id.ques4_check2);
        CheckBox ques4_3 = (CheckBox) findViewById(R.id.ques4_check3);
        CheckBox ques6_1 = (CheckBox) findViewById(R.id.ques6_check1);
        CheckBox ques6_2 = (CheckBox) findViewById(R.id.ques6_check2);
        CheckBox ques6_3 = (CheckBox) findViewById(R.id.ques6_check3);
        RadioGroup rg = (RadioGroup) findViewById(R.id.RG1);

        if (rg.getCheckedRadioButtonId() == id) {
            correct++;
        } else {
            wrong++;
        }
        if (ques1.trim().equalsIgnoreCase("peacock")) {
            correct++;
        } else {
            wrong++;
        }
        if (ques2.trim().equalsIgnoreCase("hockey")) {
            correct++;

        } else {
            wrong++;
        }
        if (ques3.trim().equalsIgnoreCase("jaipur")) {
            correct++;
        } else {
            wrong++;
        }
        if (ques4_1.isChecked() && ques4_2.isChecked() && !ques4_3.isChecked()) {
            correct++;
        } else {
            wrong++;
        }
        if (ques6_1.isChecked() && ques6_3.isChecked() && !ques6_2.isChecked()) {
            correct++;
        } else {
            wrong++;
        }
    }

    public void SubmitResult(View view) {

        conditions();
        Result(correct, wrong);

    }

    public void Result(int count, int count1) {
        Toast.makeText(this, "Your correct answers are " + count + "/6\nYour " + count1 + " answers are wrong", Toast.LENGTH_SHORT).show();
        correct = 0;
        wrong = 0;
    }
}
