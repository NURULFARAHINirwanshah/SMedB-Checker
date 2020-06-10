package infinityproject.smedbchecker;

/**
 * Created by ETON on 3/14/2016.
 */
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Profile3 extends AppCompatActivity implements View.OnClickListener {

    Button btn3_sms;

    EditText editTextId;
    private Button buttonGet;
    private TextView textViewResult;

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;

    private ProgressDialog loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile3);

        editTextId = (EditText) findViewById(R.id.editTextId);
        buttonGet = (Button) findViewById(R.id.buttonGet);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        buttonGet.setOnClickListener(this);


        Intent intent = getIntent();
        String fName = intent.getStringExtra("fname");
        editTextId.setText(fName);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        Button btn3_sms=(Button)findViewById(R.id.btn3_sms);
        btn3_sms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile3.this, Profile3_sms.class));

            }
        });

        Button btn3_call=(Button)findViewById(R.id.btn3_call);
        btn3_call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile3.this, Profile3_call.class));

            }
        });



    }

    private void getData() {
        String id = editTextId.getText().toString().trim();
        if (id.equals("")) {
            Toast.makeText(this, "Please enter an id", Toast.LENGTH_LONG).show();
            return;
        }
        loading = ProgressDialog.show(this,"Please wait...","Fetching...",false,false);

        String url = Config.DATA_URL+editTextId.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loading.dismiss();
                showJSON(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Profile3.this,error.getMessage().toString(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String response) {

        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        String s6 = "";
        String s7 = "";
        String s8 = "";
        String s9 = "";
        String s10 = "";
        String s11 = "";
        String s12 = "";
        String s13 = "";
        String s14 = "";
        String s15 = "";
        String s16 = "";
        String s17 = "";
        String s18 = "";
        String s19 = "";
        String s20 = "";
        String s21 = "";
        String s22 = "";
        String s23 = "";
        String s24 = "";
        String s25 = "";
        String s26 = "";
        String s27 = "";
        String s28 = "";
        String s29 = "";
        String s30 = "";
        String s31 = "";
        String s32 = "";
        String s33 = "";
        String s34 = "";
        String s35 = "";
        String s36 = "";
        String s37 = "";
        String s38 = "";
        String s39 = "";
        String s40 = "";
        String s41 = "";
        String s42 = "";
        String s43 = "";
        String s44 = "";
        String s45 = "";
        String s46 = "";
        String s47 = "";
        String s48 = "";
        String s49 = "";
        String s50 = "";
        String s51 = "";
        String s52 = "";
        String s53 = "";
        String s54 = "";
        String s55 = "";
        String s56 = "";
        String s57 = "";
        String s58 = "";
        String s59 = "";
        String s60 = "";
        String s61 = "";
        String s62 = "";
        String s63 = "";


        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject collegeData = result.getJSONObject(0);
            s1 = collegeData.getString(Config.KEY_S1);
            s2 = collegeData.getString(Config.KEY_S2);
            s3 = collegeData.getString(Config.KEY_S3);
            s4 = collegeData.getString(Config.KEY_S4);
            s5 = collegeData.getString(Config.KEY_S5);
            s6 = collegeData.getString(Config.KEY_S6);
            s7 = collegeData.getString(Config.KEY_S7);
            s8 = collegeData.getString(Config.KEY_S8);
            s9 = collegeData.getString(Config.KEY_S9);
            s10 = collegeData.getString(Config.KEY_S10);
            s11 = collegeData.getString(Config.KEY_S11);
            s12 = collegeData.getString(Config.KEY_S12);
            s13 = collegeData.getString(Config.KEY_S13);
            s14 = collegeData.getString(Config.KEY_S14);
            s15 = collegeData.getString(Config.KEY_S15);
            s16 = collegeData.getString(Config.KEY_S16);
            s17 = collegeData.getString(Config.KEY_S17);
            s18 = collegeData.getString(Config.KEY_S18);
            s19 = collegeData.getString(Config.KEY_S19);
            s20 = collegeData.getString(Config.KEY_S20);
            s21 = collegeData.getString(Config.KEY_S21);
            s22 = collegeData.getString(Config.KEY_S22);
            s23 = collegeData.getString(Config.KEY_S23);
            s24 = collegeData.getString(Config.KEY_S24);
            s25 = collegeData.getString(Config.KEY_S25);
            s26 = collegeData.getString(Config.KEY_S26);
            s27 = collegeData.getString(Config.KEY_S27);
            s28 = collegeData.getString(Config.KEY_S28);
            s29 = collegeData.getString(Config.KEY_S29);
            s30 = collegeData.getString(Config.KEY_S30);
            s31 = collegeData.getString(Config.KEY_S31);
            s32 = collegeData.getString(Config.KEY_S32);
            s33 = collegeData.getString(Config.KEY_S33);
            s34 = collegeData.getString(Config.KEY_S34);
            s35 = collegeData.getString(Config.KEY_S35);
            s36 = collegeData.getString(Config.KEY_S36);
            s37 = collegeData.getString(Config.KEY_S37);
            s38 = collegeData.getString(Config.KEY_S38);
            s39 = collegeData.getString(Config.KEY_S39);
            s40 = collegeData.getString(Config.KEY_S40);
            s41 = collegeData.getString(Config.KEY_S41);
            s42 = collegeData.getString(Config.KEY_S42);
            s43 = collegeData.getString(Config.KEY_S43);
            s44 = collegeData.getString(Config.KEY_S44);
            s45 = collegeData.getString(Config.KEY_S45);
            s46 = collegeData.getString(Config.KEY_S46);
            s47 = collegeData.getString(Config.KEY_S47);
            s48 = collegeData.getString(Config.KEY_S48);
            s49 = collegeData.getString(Config.KEY_S49);
            s50 = collegeData.getString(Config.KEY_S50);
            s51 = collegeData.getString(Config.KEY_S51);
            s52 = collegeData.getString(Config.KEY_S52);
            s53 = collegeData.getString(Config.KEY_S53);
            s54 = collegeData.getString(Config.KEY_S54);
            s55 = collegeData.getString(Config.KEY_S55);
            s56 = collegeData.getString(Config.KEY_S56);
            s57 = collegeData.getString(Config.KEY_S57);
            s58 = collegeData.getString(Config.KEY_S58);
            s59 = collegeData.getString(Config.KEY_S59);
            s60 = collegeData.getString(Config.KEY_S60);
            s61 = collegeData.getString(Config.KEY_S61);
            s62 = collegeData.getString(Config.KEY_S62);
            s63 = collegeData.getString(Config.KEY_S63);


        } catch (JSONException e) {
            e.printStackTrace();
        }
        textViewResult.setText("GUARDIAN NAME\t\t\t\t:\t" + s26  + "\nOCCUPATION\t\t\t\t\t\t:\t" + s34+ "\n\nCURRENT ADDRESS\t\t\t:\t" + s27 + "\n\t\t\t\t\t\t\t\t\t\t\t\t:\t" + s28 + "\nPOSCODE\t\t\t\t\t\t\t:\t" + s29 + "\nCITY\t\t\t\t\t\t\t\t\t\t:\t" + s30 + "\nSTATE\t\t\t\t\t\t\t\t\t:\t" + s31 + "\n\nCONTACT NO (HOME)\t\t:\t" + s32 + "\nCONTACT NO (PHONE)\t:\t" + s33);
    }

    @Override
    public void onClick(View v) {

        String button_text;
        button_text = ((Button) v).getText().toString();

        if (button_text.equals("Detail")) {

            Intent intent = new Intent(this, Profile1.class);
            intent.putExtra("fname", editTextId.getText().toString());
            startActivity(intent);

        }else if (button_text.equals("Medical")) {

            Intent intent = new Intent(this, Profile2.class);
            intent.putExtra("fname", editTextId.getText().toString());
            startActivity(intent);
        }else if (button_text.equals("Academical")) {

            Intent intent = new Intent(this, Profile4.class);
            intent.putExtra("fname", editTextId.getText().toString());
            startActivity(intent);
        }

        getData();
    }
}