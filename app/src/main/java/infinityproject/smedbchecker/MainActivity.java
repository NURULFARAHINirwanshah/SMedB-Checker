package infinityproject.smedbchecker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(MainActivity.this, BarcodeScanner.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
    protected void onPause(){
        super.onPause();
        finish();
    }
}
