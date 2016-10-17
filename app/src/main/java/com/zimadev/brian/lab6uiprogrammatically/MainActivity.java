package com.zimadev.brian.lab6uiprogrammatically;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView tv_title;
    TextView tv_loanAmount;
    TextView tv_termOfLoan;
    TextView tv_yearlyInterestRate;
    TextView tv_results;
    TextView tv_monthlyPayment;
    TextView tv_totatlPayment;
    TextView tv_totalInterest;
    TextView tv_monthlyPaymentAns;
    TextView tv_totatlPaymentAns;
    TextView tv_totalInterestAns;

    EditText et_loanAmont;
    EditText et_termOfLoan;
    EditText et_yearlyInterestRate;

    Button btn_calc;
    Button btn_clr;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout baseLayout = (LinearLayout) findViewById(R.id.activity_main);

        tv_title = new TextView(this);
        tv_loanAmount = new TextView(this);
        tv_termOfLoan = new TextView(this);
        tv_yearlyInterestRate = new TextView(this);
        tv_results = new TextView(this);
        tv_monthlyPayment = new TextView(this);
        tv_totatlPayment = new TextView(this);
        tv_totalInterest = new TextView(this);
        tv_monthlyPaymentAns = new TextView(this);
        tv_totatlPaymentAns = new TextView(this);
        tv_totalInterestAns = new TextView(this);

        et_loanAmont = new EditText(this);
        et_termOfLoan = new EditText(this);
        et_yearlyInterestRate = new EditText(this);

        btn_calc = new Button(this);
        btn_clr = new Button(this);

        tv_title.setText(getString(R.string.title));
        tv_title.setGravity(Gravity.CENTER_HORIZONTAL);
        tv_title.setTextSize(20);
        baseLayout.addView(tv_title);

        LinearLayout layout1 = new LinearLayout(this);
        layout1.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        tv_loanAmount.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        tv_loanAmount.setText(getString(R.string.loanAmount));

        layout1.addView(tv_loanAmount);

        et_loanAmont.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout1.addView(et_loanAmont);

        baseLayout.addView(layout1);


        LinearLayout layout2 = new LinearLayout(this);
        layout2.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        tv_termOfLoan.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        tv_termOfLoan.setText(getString(R.string.termOfLoan));

        layout2.addView(tv_termOfLoan);

        et_termOfLoan.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout2.addView(et_termOfLoan);

        baseLayout.addView(layout2);


        LinearLayout layout3 = new LinearLayout(this);
        layout3.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        tv_yearlyInterestRate.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        tv_yearlyInterestRate.setText(getString(R.string.yearlyInterestRate));

        layout3.addView(tv_yearlyInterestRate);

        et_yearlyInterestRate.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout3.addView(et_yearlyInterestRate);

        baseLayout.addView(layout3);


        LinearLayout layout4 = new LinearLayout(this);

        btn_calc.setText(getString(R.string.calc));
        btn_calc.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout4.addView(btn_calc);

        btn_clr.setText(getString(R.string.clr));
        btn_clr.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout4.addView(btn_clr);

        baseLayout.addView(layout4);

        tv_results.setText(getString(R.string.results));
        tv_results.setGravity(Gravity.CENTER_HORIZONTAL);
        tv_results.setTextSize(20);
        baseLayout.addView(tv_results);

        LinearLayout layout5 = new LinearLayout(this);

        tv_monthlyPayment.setText(getString(R.string.monthlyPayment));
        tv_monthlyPayment.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout5.addView(tv_monthlyPayment);

        tv_monthlyPaymentAns.setText(getString(R.string.zero));
        tv_monthlyPaymentAns.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout5.addView(tv_monthlyPaymentAns);

        baseLayout.addView(layout5);


        LinearLayout layout6 = new LinearLayout(this);

        tv_totatlPayment.setText(getString(R.string.totalPayment));
        tv_totatlPayment.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout6.addView(tv_totatlPayment);

        tv_totatlPaymentAns.setText(getString(R.string.zero));
        tv_totatlPaymentAns.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout6.addView(tv_totatlPaymentAns);

        baseLayout.addView(layout6);


        LinearLayout layout7 = new LinearLayout(this);

        tv_totalInterest.setText(getString(R.string.toalInterest));
        tv_totalInterest.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout7.addView(tv_totalInterest);

        tv_totalInterestAns.setText(getString(R.string.zero));
        tv_totalInterestAns.setLayoutParams(new LinearLayout.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        layout7.addView(tv_totalInterestAns);

        baseLayout.addView(layout7);

        btn_calc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                calculate();
            }
        });

        btn_clr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                clear();
            }
        });
    }

    private void calculate()
    {
        try {
            LoanCalculator lCalc = new LoanCalculator();

            lCalc.setLoanAmount(Double.parseDouble(et_loanAmont.getText().toString()));
            lCalc.setNumberOfYears(Integer.parseInt(et_termOfLoan.getText().toString()));
            lCalc.setYearlyInterestRate(Double.parseDouble(et_yearlyInterestRate.getText().toString()));

            tv_monthlyPaymentAns.setText(String.format(Locale.CANADA, "$%,.2f", lCalc.getMonthlyPayment()));
            tv_totalInterestAns.setText(String.format(Locale.CANADA, "$%,.2f", lCalc.getTotalInterest()));
            tv_totatlPaymentAns.setText(String.format(Locale.CANADA, "$%,.2f", lCalc.getTotalCostOfLoan()));
        }catch(Exception e)
        {

        }
    }

    private void clear()
    {
        tv_monthlyPaymentAns.setText(R.string.zero);
        tv_totalInterestAns.setText(R.string.zero);
        tv_totatlPaymentAns.setText(R.string.zero);
        et_loanAmont.setText(R.string.initial);
        et_termOfLoan.setText(R.string.initial);
        et_yearlyInterestRate.setText(R.string.initial);
    }
}
