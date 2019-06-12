package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import orc.com.taotaole.R;

public class LoginActivity extends AppCompatActivity {
    private EditText user_name;
    private EditText pass_word;
    private String userName = "";
    private String passWord = "";
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;
    private String right_passWord;

    private String right_userName;
    private MyFragmentPagerAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user_name = findViewById(R.id.et_account);
        pass_word = findViewById(R.id.et_password);
        mSharedPrefrences = getSharedPreferences("userinfo", MODE_PRIVATE);
        mEditor = mSharedPrefrences.edit();
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        right_passWord = "^([0-9]|[a-z]|[A-Z]){6}$";
        right_userName = "^([0-9]|[a-z]|[A-Z]){4}$";
        findViewById(R.id.login_back).setOnClickListener(e -> {
            mEditor.putString("login_Sign", "false");
            mEditor.commit();
            Toast.makeText(this, "" + mSharedPrefrences.getString("login_Sign", ""), Toast.LENGTH_SHORT).show();
             finish();
            startActivity(new Intent(this,DrawActivity.class));
        });
        findViewById(R.id.tv_register).setOnClickListener(e -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });
        findViewById(R.id.tv_forget).setOnClickListener(e -> {
            startActivity(new Intent(LoginActivity.this, ForgetActivity.class));
        });
        findViewById(R.id.btn_login).setOnClickListener(e -> {
            userName = user_name.getText().toString();
            passWord = pass_word.getText().toString();
            if (!userName.equals("") && !passWord.equals("") && userName.equals(mSharedPrefrences.getString(userName, "")) && passWord.equals(mSharedPrefrences.getString((userName + "_PassWord"), ""))) {
                startActivity(new Intent(LoginActivity.this, DrawActivity.class));
                Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
            } else if (userName.equals("") && !passWord.equals("")) {
                Toast.makeText(this, "用户名不能为空！", Toast.LENGTH_SHORT).show();
            } else if (passWord.equals("") && !userName.equals("")) {
                Toast.makeText(this, "密码不能为空！", Toast.LENGTH_SHORT).show();
            } else if (!userName.matches(right_userName)) {
                Toast.makeText(this, "请输入正确的用户名!", Toast.LENGTH_SHORT).show();
            } else if (!passWord.matches(right_passWord)) {
                Toast.makeText(this, "请输入正确的密码!", Toast.LENGTH_SHORT).show();
            }
            //测试使用//测试使用//测试使用//测试使用//测试使用,不输入即可登录
            if (userName.equals("")) {
                mEditor.putString("login_Sign", "true");
                mEditor.commit();
                startActivity(new Intent(LoginActivity.this, DrawActivity.class));
                Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "用户名或者密码错误！", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
