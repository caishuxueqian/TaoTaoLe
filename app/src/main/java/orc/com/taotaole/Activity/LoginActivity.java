package orc.com.taotaole.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import orc.com.taotaole.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intUI();
    }

    private void intUI() {
        findViewById(R.id.tv_register);
        findViewById(R.id.tv_forget);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.tv_register:
                intent.setClass(getApplicationContext(),RegisterActivity.class);
                break;
            case R.id.tv_forget:
                intent.setClass(getApplicationContext(),ForgetActivity.class);
                break;
        }
        startActivity(intent);
    }
}
