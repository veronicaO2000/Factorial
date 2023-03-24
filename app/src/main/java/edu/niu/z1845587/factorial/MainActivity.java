package edu.niu.z1845587.factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView nTV, multTV, factorialTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nTV = findViewById(R.id.nTextView);
        factorialTV = findViewById(R.id.factorialTextView);

        Random rn = new Random();
        int n = rn.nextInt(12) + 1;
        nTV.setText(n + "!");

        int factorial = calcFact(n);
        factorialTV.setText(String.valueOf(factorial));
    }

    private int calcFact(int n) {
        multTV = findViewById(R.id.multTextView);
        StringBuilder sb = new StringBuilder();
        sb.append(n);

        int factorial = n;
        if (n == 1) {
            multTV.setText("1");
            return 1;
        }

        for (int i = n; i > 1; i--) {
            factorial *= (i-1);
            sb.append(" * " + (i-1));
        }

        sb.append(" =");
        String multiplication = String.valueOf(sb);
        multTV.setText(multiplication);

        return factorial;
    }
}