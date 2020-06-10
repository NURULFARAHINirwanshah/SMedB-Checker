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

public class Profile4 extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.profile4);

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

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);


        Button btn3_sms=(Button)findViewById(R.id.btn3_sms);
        btn3_sms.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile4.this, Profile3_sms.class));

            }
        });

        Button btn3_call=(Button)findViewById(R.id.btn3_call);
        btn3_call.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Profile4.this, Profile3_call.class));

            }
        });


    }

    private void getData1() {
        String id = editTextId.getText().toString().trim();
        if (id.equals("")) {
            Toast.makeText(this, "Please enter an id", Toast.LENGTH_LONG).show();
            return;
        }
        loading = ProgressDialog.show(this,"Please wait...","Fetching...",false,false);

        String url = Config1.DATA_URL+editTextId.getText().toString().trim();

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
                        Toast.makeText(Profile4.this,error.getMessage().toString(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String response){

        String l1="";
        String l2="";
        String l3="";
        String l4="";
        String l5="";
        String l6="";
        String l7="";
        String l8="";
        String l9="";
        String l10="";
        String l11="";
        String l12="";
        String l13="";
        String l14="";
        String l15="";
        String l16="";
        String l17="";
        String l18="";
        String l19="";
        String l20="";



        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config1.JSON_ARRAY);
            JSONObject collegeData = result.getJSONObject(0);
            l1 = collegeData.getString(Config1.KEY_L1);
            l2 = collegeData.getString(Config1.KEY_L2);
            l3 = collegeData.getString(Config1.KEY_L3);
            l4 = collegeData.getString(Config1.KEY_L4);
            l5 = collegeData.getString(Config1.KEY_L5);
            l6 = collegeData.getString(Config1.KEY_L6);
            l7 = collegeData.getString(Config1.KEY_L7);
            l8 = collegeData.getString(Config1.KEY_L8);
            l9 = collegeData.getString(Config1.KEY_L9);
            l10 = collegeData.getString(Config1.KEY_L10);
            l11 = collegeData.getString(Config1.KEY_L11);
            l12 = collegeData.getString(Config1.KEY_L12);
            l13 = collegeData.getString(Config1.KEY_L13);
            l14 = collegeData.getString(Config1.KEY_L14);
            l15 = collegeData.getString(Config1.KEY_L15);
            l16 = collegeData.getString(Config1.KEY_L16);
            l17 = collegeData.getString(Config1.KEY_L17);
            l18 = collegeData.getString(Config1.KEY_L18);
            l19 = collegeData.getString(Config1.KEY_L19);
            l20 = collegeData.getString(Config1.KEY_L20);


        } catch (JSONException e) {
            e.printStackTrace();
        }
        textViewResult.setText("NAME:\t"+l1+"\nIC NUMBER:\t" +l2+ "\nSTUDENT ID:\t"+l3+"\nDEPARTMENT:\t" +l4+ "\nCOURSE:\t"+l5+"\nCURRENT SEMESTER:\t" +l6+ "\nDATE OF BIRTH:\t"+l7+"\nAGE:\t" +l8+ "\nGENDER:\t"+l9+"\nSTATUS:\t" +l10+ "\nNATION:\t"+l11+"\nRELIGION:\t" +l12+ "\nCURRENT ADDRESS:\t"+l13+"\n:\t" +l14+ "\nPOSCODE:\t"+l15+"\nCITY:\t" +l16+ "\nSTATE:\t"+l17+"\nPOSTAL ADDRESS:\t" +l18+ "\n:\t"+l19+"\nPOSCODE:\t" +l20);
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
        }else if (button_text.equals("Parental")) {

            Intent intent = new Intent(this, Profile3.class);
            intent.putExtra("fname", editTextId.getText().toString());
            startActivity(intent);
        }

        getData1();
    }
}