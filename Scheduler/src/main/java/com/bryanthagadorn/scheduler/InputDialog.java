package com.bryanthagadorn.scheduler;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Bryant on 10/8/13.
 */
public class InputDialog {

    static void show(Context context){
        LayoutInflater li = LayoutInflater.from(context);
        View promptsView = li.inflate(R.layout.new_friend, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set prompts.xml to alertdialog builder
        alertDialogBuilder.setView(promptsView);

        final EditText name = (EditText) promptsView.findViewById(R.id.nameEditText);
        final EditText phoneNumber = (EditText) promptsView.findViewById(R.id.phoneNumberEditText);

        // set dialog message
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Add",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                               MainActivity.friendsList.addFriend(name.getText().toString(),phoneNumber.getText().toString());
                               dialog.dismiss();
                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }
}
