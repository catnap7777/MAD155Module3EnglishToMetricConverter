package mad155.kmathes.mad155module3englishtometricconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double numberToConvert;
    double convertedNumber;
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


            @Override
            public void onClick(View v) {

                if (txtNbr.getText().toString().isEmpty() || txtNbr == null) {
                    System.out.println("NUMBER TO CONVERT MISSING");
                    Toast.makeText
                            (getApplicationContext(), "Please enter a number to convert", Toast.LENGTH_SHORT)
                            .show();
                } else {

                    //numberToConvert = Integer.parseInt(txtNbr.getText().toString());
                    numberToConvert = Double.parseDouble(txtNbr.getText().toString());
                    double answer = 10;
                    int convertTypeChoice = 0;

                    //totalCost = costPerTicket * numberOfTickets;
                    DecimalFormat formattedNbr = new DecimalFormat("###,###.##");

                    convertChoice = spnrConversion.getSelectedItem().toString();

                    //convertTypeChoice = spnrConversion.getSelectedItemPosition();

                    if(convertChoice.equalsIgnoreCase("inches to centimeters")) {
                        answer = numberToConvert * 2.54;
                        convertTypeChoice = 1;
                    } else if (convertChoice.equalsIgnoreCase("feet to meters")){
                        convertTypeChoice = 2;
                    } else if (convertChoice.equalsIgnoreCase("yards to meters")){
                        convertTypeChoice = 3;
                    } else if (convertChoice.equalsIgnoreCase("miles to kilometers")){
                        convertTypeChoice = 4;
                    } else if (convertChoice.equalsIgnoreCase("fluid ounces to milliliters")){
                        convertTypeChoice = 5;
                    } else if (convertChoice.equalsIgnoreCase("quarts to liters")){
                        convertTypeChoice = 6;
                    } else if (convertChoice.equalsIgnoreCase("ounces to grams")){
                        convertTypeChoice = 7;
                    } else if (convertChoice.equalsIgnoreCase("grams to liters")){
                        convertTypeChoice = 8;
                    } else if (convertChoice.equalsIgnoreCase("pounds to kilograms")){
                        convertTypeChoice = 9;

                    } else {
                        convertChoice = "other choice";
                    }

                    results.setText("Conversion of " + numberToConvert + "\n(" + convertChoice + ") is: " +
                            formattedNbr.format(answer) + " convertTypeChoice = " + convertTypeChoice);
                }

            }
        });
    }
}