package com.example.dialogmap;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            displayAlertDialog(buildAlertDialog(this,getLayoutInflater().inflate(R.layout.layout_dialog,null),"Set Location on Map","Use the picker to set Location","Confirm","Cancel",false));
        });
    }

    private AlertDialog.Builder buildAlertDialog(Context context,View view, String title, String message, String positiveBtn, String negativeBtn, boolean isCancelable){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);                  // Create the object of AlertDialog Builder class
        builder.setView(view);                                                           // Set xml file representing the dialog UI
        builder.setCancelable(isCancelable);                                             // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
        return builder;
    }
    private void displayAlertDialog(AlertDialog.Builder builder){
        AlertDialog alertDialog = builder.create();                                      // Create the Alert dialog
        alertDialog.show();                                                              // Show the Alert Dialog box
        alertDialog.getWindow().setLayout(1000,1200);                        // Set Dialog screenSize
    }

}