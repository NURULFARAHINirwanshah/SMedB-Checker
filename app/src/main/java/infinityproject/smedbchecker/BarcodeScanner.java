package infinityproject.smedbchecker;

/**
 * Created by ETON on 3/14/2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;


public class BarcodeScanner extends Activity implements OnClickListener {
    EditText etFName;
    Button btnSubmit;


    private Button scanBtn;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barcodescanner);

        etFName = (EditText) findViewById(R.id.etFName);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);


        scanBtn = (Button) findViewById(R.id.scan_button);
        scanBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        String button_text;
        button_text = ((Button) v).getText().toString();
        if (button_text.equals("Scan")) {
            if (v.getId() == R.id.scan_button) {
                IntentIntegrator scanIntegrator = new IntentIntegrator(this);
                scanIntegrator.initiateScan();
            }

        } else if (button_text.equals("Click")) {

            Intent intent = new Intent(this, Profile1.class);
            intent.putExtra("fname", etFName.getText().toString());
            startActivity(intent);

        }
    }




    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
            String scanContent = scanningResult.getContents();
            etFName.setText(scanContent);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "No scan data received!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
