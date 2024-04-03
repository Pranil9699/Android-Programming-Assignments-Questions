package com.example.sendemailwithattachment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sendEmailButton = findViewById(R.id.sendEmailButton);
        sendEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    private void sendEmail() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822"); // Set MIME type for email
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"recipient@example.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of Email");
        intent.putExtra(Intent.EXTRA_TEXT, "Body of Email");
        startActivity(Intent.createChooser(intent, "Send Email"));
    }
}
