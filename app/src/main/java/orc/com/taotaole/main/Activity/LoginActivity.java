package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import orc.com.taotaole.R;

public class LoginActivity extends AppCompatActivity {
    private EditText user_name;
    private EditText pass_word;
    private String userName;
    private String passWord;
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user_name = findViewById(R.id.et_account);
        pass_word = findViewById(R.id.et_password);

        mSharedPrefrences = getSharedPreferences("userinfo", MODE_PRIVATE);
        findViewById(R.id.tv_register).setOnClickListener(e -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });
        findViewById(R.id.tv_forget).setOnClickListener(e -> {
            startActivity(new Intent(LoginActivity.this, ForgetActivity.class));
        });
        findViewById(R.id.btn_login).setOnClickListener(e -> {
            userName = user_name.getText().toString();
            passWord = pass_word.getText().toString();
            if (userName.equals(mSharedPrefrences.getString(userName, "")) && passWord.equals(mSharedPrefrences.getString((userName + "_PassWord"), ""))) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "用户名或者密码错误！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
