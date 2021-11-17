package com.julia.topic5_dialog;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity  extends FragmentActivity implements Multichoice.NoticeDialogListener {
    private  ArrayList selectedItems = new ArrayList();
    private TextView vista2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vista2 = (TextView) findViewById(R.id.cuadroTexto);
    }

    public void verDialog(View view) {
        DialogFragment dialog = new SingleChoice(selectedItems);
        dialog.show(getSupportFragmentManager(),SingleChoice.TAG);
    }
 @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        // User touched the dialog's positive button
     String texto = "";
        for (int i =0; i< selectedItems.size(); i++){
            texto += selectedItems.get(i);
        }
        vista2.setText(texto);
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        // User touched the dialog's negative button

    }


}