package omy.boston.listdialog.ListDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import omy.boston.listdialog.MainActivity;
import omy.boston.listdialog.R;

/**
 * Created by LosFrancisco on 11-Jan-17.
 */

public class ListDialog extends DialogFragment {

    private String[] languageList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        languageList = getResources().getStringArray(R.array.languages_list);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder lista = new AlertDialog.Builder(getActivity());
        lista.setTitle(R.string.odaberi_jezik);
        lista.setItems(languageList, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int brJezika) {
                String odabraniJezik = languageList[brJezika];
                ((MainActivity)getActivity()).setTextField("Choosen language: " + odabraniJezik);
                dismiss();
            }
        });

        AlertDialog neki = lista.create();
        return neki;
    }
}
