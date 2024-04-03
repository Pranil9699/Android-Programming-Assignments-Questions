package com.example.phonecalldemostation;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button callButton = findViewById(R.id.call_button);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Phone number to dial
                String phoneNumber = "9699532910";

                // Create an intent with ACTION_CALL action
                Intent callIntent = new Intent(Intent.ACTION_CALL);

                // Set the phone number to dial
                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                // Check if the device can make calls
                if (callIntent.resolveActivity(getPackageManager()) != null) {
                    // Start the activity to initiate the phone call
                    startActivity(callIntent);
                } else {
                    // Display a message if the device cannot make calls
                    Toast.makeText(MainActivity.this, "Your device cannot make calls.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
