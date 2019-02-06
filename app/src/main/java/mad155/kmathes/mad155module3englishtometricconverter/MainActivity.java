package mad155.kmathes.mad155module3englishtometricconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double numberToConvert;

    String convertChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtNbr = (EditText) findViewById(R.id.txtNumber);
        final Spinner spnrConversion = (Spinner) findViewById(R.id.txtConversion);
        Button btnConvert = (Button) findViewById(R.id.btnConversion);

        btnConvert.setOnClickListener(new View.OnClickListener() {

            final TextView results = (TextView) findViewById(R.id.txtResult);

            final RadioButton rbUsToMetric = findViewById(R.id.rb1);
            final RadioButton rbMetricToUs = findViewById(R.id.rb2); // not really needed since there are only two choices
                                                                     // ..and if stmts check for first radio button
            @Override
            public void onClick(View v) {

                if (txtNbr.getText().toString().isEmpty() || txtNbr == null) {
                    System.out.println("NUMBER TO CONVERT MISSING");
                    Toast.makeText
                            (getApplicationContext(), "Please enter a number to convert", Toast.LENGTH_SHORT)
                            .show();
                } else {

                    numberToConvert = Double.parseDouble(txtNbr.getText().toString());
                    double answer = 0;
                    //int convertTypeChoice = 1;  -- for if I was using position to determine selection instead
                    String txtConversionUsOrMetric = "";

                    DecimalFormat formattedNbr = new DecimalFormat("###,###,###.####");

                    convertChoice = spnrConversion.getSelectedItem().toString();
                    //convertTypeChoice = spnrConversion.getSelectedItemPosition();
                    //   -- for if I was using position to determine selection instead

                    if (convertChoice.equalsIgnoreCase("inches <--> centimeters")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * 2.54;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Inches to Centimeters";
                        } else {
                            answer = numberToConvert / 2.54;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Centimeters to Inches";
                        }

                    } else if (convertChoice.equalsIgnoreCase("feet <--> meters")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * .3048;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Feet to Meters";
                        } else {
                            answer = numberToConvert / .3048;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Meters to Feet";
                        }
                    } else if (convertChoice.equalsIgnoreCase("yards <--> meters")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * .9144;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Yards to Meters";
                        } else {
                            answer = numberToConvert / .9144;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Meters to Yards";
                        }
                    } else if (convertChoice.equalsIgnoreCase("miles <--> kilometers")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * 1.609344;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Miles to Kilometers";
                        } else {
                            answer = numberToConvert / 1.609344;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Kilometers to Miles";
                        }
                    } else if (convertChoice.equalsIgnoreCase("fluid ounces <--> milliliters")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * 29.57353;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Fluid Ounces to Milliliters";
                        } else {
                            answer = numberToConvert / 29.57353;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Milliliters to Fluid Ounces";
                        }
                    } else if (convertChoice.equalsIgnoreCase("quarts <--> liters")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * .946352946;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Quarts to Liters";
                        } else {
                            answer = numberToConvert / .946352946;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Liters to Quarts";
                        }
                    } else if (convertChoice.equalsIgnoreCase("gallons <--> liters")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * 3.785411784;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Gallons to Liters";
                        } else {
                            answer = numberToConvert / 3.785411784;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Liters to Gallons";
                        }
                    } else if (convertChoice.equalsIgnoreCase("ounces <--> grams")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * 28.34952;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Ounces to Grams";
                        } else {
                            answer = numberToConvert / 28.34952;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Grams to Ounces";
                        }
                    } else if (convertChoice.equalsIgnoreCase("pounds <--> grams")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * 453.592;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Pounds to Grams";
                        } else {
                            answer = numberToConvert / 453.592;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Grams to Pounds";
                        }
                    } else if (convertChoice.equalsIgnoreCase("pounds <--> kilograms")) {
                        if (rbUsToMetric.isChecked()) {
                            answer = numberToConvert * .45359237;
                            txtConversionUsOrMetric = "Converting U.S. to Metric";
                            convertChoice = "Pounds to Kilograms";
                        } else {
                            answer = numberToConvert / .45359237;
                            txtConversionUsOrMetric = "Converting Metric to U.S.";
                            convertChoice = "Kilograms to Pounds";
                        }

                    } else {
                        convertChoice = "other choice";
                    }

                    results.setText("Number (input) being converted: " + numberToConvert + "\n" +
                            txtConversionUsOrMetric + " \n" + convertChoice +
                            "\n*** Answer:  " + formattedNbr.format(answer) + " ***");

                }
            }
        });
    }
 }