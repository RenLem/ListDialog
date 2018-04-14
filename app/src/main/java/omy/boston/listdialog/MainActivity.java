package omy.boston.listdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import omy.boston.listdialog.ListDialog.ListDialog;

public class MainActivity extends AppCompatActivity {

    TextView odabraniTekst;
    Button btnDialogListom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        odabraniTekst = (TextView) findViewById(R.id.tekst);
        btnDialogListom = (Button) findViewById(R.id.button);

        btnDialogListom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ListDialog kadList = new ListDialog();
                kadList.show(getFragmentManager(), "List Dialog");
                odabraniTekst.setText("");
            }
        });
    }

    public void setTextField(String itam){
        odabraniTekst.setText(itam);
    }

    public String getTextField(){
        return odabraniTekst.getText().toString();
    }
}
