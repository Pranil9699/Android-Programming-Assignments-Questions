package com.example.wifiapp;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonToggleWifi;
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToggleWifi = findViewById(R.id.buttonToggleWifi);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        updateButtonState(); // Update button text based on Wi-Fi state
    }

    public void toggleWifi(View view) {
        if (wifiManager.isWifiEnabled()) {
            // Wi-Fi is enabled, so disable it
            wifiManager.setWifiEnabled(false);
        } else {
            // Wi-Fi is disabled, so enable it
            wifiManager.setWifiEnabled(true);
        }

        updateButtonState(); // Update button text after toggling Wi-Fi state
    }

    private void updateButtonState() {
        if (wifiManager.isWifiEnabled()) {
            buttonToggleWifi.setText("Turn OFF Wi-Fi");
        } else {
            buttonToggleWifi.setText("Turn ON Wi-Fi");
        }
    }
}
