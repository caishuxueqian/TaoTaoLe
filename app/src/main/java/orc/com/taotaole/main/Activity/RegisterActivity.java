package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import orc.com.taotaole.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText user_Name;
    private EditText user_PassWord;
    private EditText user_Phone;
    private EditText user_PassWord_Againt;
    private EditText user_Code;
    private String userName;
    private String passWord;
    private String phone;
    private String passWord_Againt;
    private String Code;
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        user_Name = findViewById(R.id.et_account);
        user_PassWord = findViewById(R.id.et_password);
        user_Phone = findViewById(R.id.et_phone);
        user_PassWord_Againt = findViewById(R.id.et_password_again);
        user_Code = findViewById(R.id.et_code);
        mSharedPrefrences = getSharedPreferences("userinfo", MODE_PRIVATE);
        mEditor = mSharedPrefrences.edit();
        findViewById(R.id.tv_getCode).setOnClickListener(e -> {
            Toast.makeText(this, "验证码:1314", Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.btn_register).setOnClickListener(e -> {
            userName = user_Name.getText().toString();
            passWord = user_PassWord.getText().toString();
            phone = user_Phone.getText().toString();
            passWord_Againt = user_PassWord_Againt.getText().toString();
            Code = user_Code.getText().toString();
            if (userName.equals("") || phone.equals("") || passWord.equals("") || passWord_Againt.equals("") || Code.equals("")) {
                Toast.makeText(this, "信息填写不完整!", Toast.LENGTH_SHORT).show();
            } else if (!passWord.equals(passWord_Againt)) {
                Toast.makeText(this, "两次密码不一致!", Toast.LENGTH_SHORT).show();
            } else  if(user_Name.length()<1 || user_Name.length()>6){
                Toast.makeText(this, "用户名长度应为1到6位!", Toast.LENGTH_SHORT).show();
            } else if (phone.length()!=11){
                Toast.makeText(this, "手机号不符合11位标准!", Toast.LENGTH_SHORT).show();
            } else if (user_PassWord.length()<6){
                Toast.makeText(this, "密码长度应该6位及以上!", Toast.LENGTH_SHORT).show();
            } else if (!mSharedPrefrences.getString(userName, "").isEmpty()) {
                Toast.makeText(this, "该用户已存在!", Toast.LENGTH_SHORT).show();
            } else {
                mEditor.putString(userName, userName);
                mEditor.putString(userName + "_PassWord", passWord);
                mEditor.putString(userName + "_Phone", phone);
                mEditor.commit();

                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                Toast.makeText(this, "注册成功!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
