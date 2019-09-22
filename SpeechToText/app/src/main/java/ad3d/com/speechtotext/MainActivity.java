package ad3d.com.speechtotext;

import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.speech.tts.TextToSpeech;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.*;
import android.view.View;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Build;
import android.widget.Button;
import android.support.v4.content.ContextCompat;
import android.widget.EditText;
import android.content.Intent;
import android.util.Log;
import android.Manifest;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.Toast;
import android.net.Uri;
import android.view.View;
import android.telephony.SmsManager;


import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Build;
import android.widget.Button;
import android.support.v4.content.ContextCompat;
import android.widget.EditText;
import android.util.Log;
import android.Manifest;
import android.content.pm.PackageManager;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private static final int REQUEST_CODE_SPEECH_INPUT = 100;

    TextView mTextTv;
    TextView SpeechCond;
    ImageButton mVoiceBtn;
    Button btnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextTv = findViewById(R.id.textSect);
        //SpeechCond = findViewById(R.id.SpeechCond);
        mVoiceBtn = findViewById(R.id.VoiceBtn);

        mVoiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                speak();
            }
        });

        btnSms = findViewById(R.id.sendSMS);
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse("smsto:"));
                    i.setType("vnd.android-dir/mms-sms");
                    final EditText txtMobile = (EditText) findViewById(R.id.phoneNumber);
                    i.putExtra("address", new String(txtMobile.getText().toString()));
                    i.putExtra("sms_body","Test Text");
                    startActivity(Intent.createChooser(i, "Send sms via:"));
                    SmsManager smgr = SmsManager.getDefault();
                    smgr.sendTextMessage(txtMobile.toString(),null,"Mess message",null,null);
                }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "SMS Failed to Send, Please try again", Toast.LENGTH_SHORT).show();
                }
            }
        });

        if (Build.VERSION.SDK_INT >= 23) {
            if (checkPermission()) {
                Log.e("permission", "Permission already granted.");
            } else {

//If the app doesn’t have the CALL_PHONE permission, request it//

                requestPermission();
            }
        }

    }





    private void speak(){
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Leave Message");

        try{
            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);
        }catch (Exception e){
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onActivityResult(int requestcode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestcode, resultCode, data);

        switch (requestcode){
            case REQUEST_CODE_SPEECH_INPUT:{
                if (resultCode == RESULT_OK && null != data){
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    mTextTv.setText(result.get(0));

                    String case1 = "Please don't hurt me";
                    String case2 = "I don't have any money";
                    String case3 = "Get this blanket off me";


                    if (result.get(0).equalsIgnoreCase(case1)){
                        //SpeechCond.setText("Code Word1");
                        mTextTv.setText(result.get(0));
                        final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
                        String phoneNum = phoneNumber.getText().toString();
                        if(!TextUtils.isEmpty(phoneNum)) {
                            String dial = "tel:" + phoneNum;
                        //Make an Intent object of type intent.ACTION_CALL//

                                                    startActivity(new Intent(Intent.ACTION_CALL,

                        //Extract the telephone number from the URI//

                                                            Uri.parse(dial)));
                        }
                    }else if(result.get(0).equalsIgnoreCase(case2)){
                        //SpeechCond.setText("Code Word2");
                        mTextTv.setText(result.get(0));
                    }else if(result.get(0).equalsIgnoreCase(case3)){
                        //SpeechCond.setText("Code Word3");
                        mTextTv.setText(result.get(0));
                    }else{
                        //SpeechCond.setText("not code word");
                        mTextTv.setText(result.get(0));
                    }
                }
                break;
            }
        }
    }

    private static final int PERMISSION_REQUEST_CODE = 1;

    Button callButton;



    public boolean checkPermission() {

        int CallPermissionResult = ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE);

        return CallPermissionResult == PackageManager.PERMISSION_GRANTED;

    }

    private void requestPermission() {

        ActivityCompat.requestPermissions(MainActivity.this, new String[]
                {
                        Manifest.permission.CALL_PHONE
                }, PERMISSION_REQUEST_CODE);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {

            case PERMISSION_REQUEST_CODE:
                callButton = (Button)findViewById(R.id.call);

                if (grantResults.length > 0) {

                    boolean CallPermission = grantResults[0] == PackageManager.PERMISSION_GRANTED;

                    if (CallPermission ) {

                        Toast.makeText(MainActivity.this,
                                "Permission accepted", Toast.LENGTH_LONG).show();

//If the permission is denied….//

                    } else {
                        Toast.makeText(MainActivity.this,

//...display the following toast...//

                                "Permission denied", Toast.LENGTH_LONG).show();

//...and disable the call button.//

                        callButton.setEnabled(false);

                    }
                    break;
                }
        }
    }

    public void call(View view)
    {
        final EditText phoneNumber = (EditText) findViewById(R.id.phoneNumber);
        String phoneNum = phoneNumber.getText().toString();
        if(!TextUtils.isEmpty(phoneNum)) {
            String dial = "tel:" + phoneNum;

//Make an Intent object of type intent.ACTION_CALL//

            startActivity(new Intent(Intent.ACTION_CALL,

//Extract the telephone number from the URI//

                    Uri.parse(dial)));
        }else {
            Toast.makeText(MainActivity.this, "Please enter a valid telephone number", Toast.LENGTH_SHORT).show();
        }

    }

}

