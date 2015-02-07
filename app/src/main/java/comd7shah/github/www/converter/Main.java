package comd7shah.github.www.converter;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;



public class Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText editCentimeters = (EditText)findViewById(R.id.editCentimeters);
        final EditText editInches = (EditText)findViewById(R.id.editInches);

        Button buttonConvert = (Button)findViewById(R.id.button);

        buttonConvert.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double centimeters = Double.valueOf(editCentimeters.getText().toString());

                double inches = centimeters * 0.393700787;

                editInches.setText(String.valueOf(inches));

            }
        });
    }








    @Override


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
