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

                    numberToConvert = Integer.parseInt(txtNbr.getText().toString());
                    double answer = 10;

                    //totalCost = costPerTicket * numberOfTickets;
                    DecimalFormat formattedNbr = new DecimalFormat("###,###.##");

                    convertChoice = spnrConversion.getSelectedItem().toString();

                    results.setText("Conversion of " + numberToConvert + "\n(" + convertChoice + ") is: " +
                            formattedNbr.format(answer));
                }

            }
        });
    }
}