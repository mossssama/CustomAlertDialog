# CustomAlertDialog
Custom Alert Dialog in Android using Java language

# **Usage** 
***
[1] **Add the following two functions in any class in your project** 

      private AlertDialog.Builder buildAlertDialog(Context context,View view, String title, String message, String positiveBtn, String negativeBtn, boolean isCancelable){
          AlertDialog.Builder builder = new AlertDialog.Builder(context);                  // Create the object of AlertDialog Builder class
          builder.setView(view);                                                           // Set xml file representing the dialog UI
          builder.setCancelable(isCancelable);                                             // Set Cancelable false for when the user clicks on the outside the Dialog Box then it will remain show
          return builder;
      }
    
and 

       private void displayAlertDialog(AlertDialog.Builder builder){
          AlertDialog alertDialog = builder.create();                                      // Create the Alert dialog
          alertDialog.show();                                                              // Show the Alert Dialog box
          alertDialog.getWindow().setLayout(1000,1200);                        // Set Dialog screenSize
      }
***
[2] **Make a layout file for your dialog**
***
[3] **Call the two functions in the activity/fragment you want to fire AlertDialog from & pass the layout file to the inflater like this**

    displayAlertDialog(buildAlertDialog(this,getLayoutInflater().inflate(R.layout.layout_dialog,null),"Set Location on Map","Use the picker to set Location","Confirm","Cancel",false));
***
[4] **[Here](https://github.com/mossssama/CustomAlertDialog/blob/main/CustomAlertDialog/app/src/main/java/com/example/dialogmap/MainActivity.java) an example applying the previous two point to be click** 
***
