package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

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
    private String right_phone;
    private String right_passWord;
    private String right_userName;

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
        right_phone = "^((13[0-9])|(14[579])|(15([0-3,5-9]))|(16[6])|(17[0135678])|(18[0-9]|19[89]))\\d{8}$";
        right_passWord = "^([0-9]|[a-z]|[A-Z]){6}$";
        right_userName = "^([0-9]|[a-z]|[A-Z]){4}$";
        findViewById(R.id.tv_getCode).setOnClickListener(e -> {
            String user_Code;
            user_Code = String.valueOf((int) (Math.random() * 8000) + 1000);
            mEditor.putString("user_Code", user_Code);
            mEditor.commit();
            Toast.makeText(this, "验证码：" + user_Code, Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.btn_register).setOnClickListener(e -> {
            userName = user_Name.getText().toString();
            passWord = user_PassWord.getText().toString();
            phone = user_Phone.getText().toString();
            passWord_Againt = user_PassWord_Againt.getText().toString();
            Code = user_Code.getText().toString();
            Map<String, ?> allConent = mSharedPrefrences.getAll();
            if (userName.equals("") || phone.equals("") || passWord.equals("") || passWord_Againt.equals("") || Code.equals("")) {
                Toast.makeText(this, "信息填写不完整!", Toast.LENGTH_SHORT).show();
            } else if (!userName.matches(right_userName)) {
                Toast.makeText(this, "该账号不符合要求!", Toast.LENGTH_SHORT).show();
            } else if (!phone.matches(right_phone)) {
                Toast.makeText(this, "请输入正确的手机号!", Toast.LENGTH_SHORT).show();
            } else if (!passWord.matches(right_passWord)) {
                Toast.makeText(this, "请输入正确的密码!", Toast.LENGTH_SHORT).show();
            } else if (!mSharedPrefrences.getString(userName, "").isEmpty()) {
                Toast.makeText(this, "该用户已存在!", Toast.LENGTH_SHORT).show();
            } else if (!passWord.equals(passWord_Againt)) {
                Toast.makeText(this, "两次密码不一致!", Toast.LENGTH_SHORT).show();
            } else if (!mSharedPrefrences.getString("user_Code", "").equals(Code)) {
                Toast.makeText(this, "验证码输入错误！", Toast.LENGTH_SHORT).show();
            } else if (true) {
                for (Map.Entry<String, ?> entry : allConent.entrySet()) {
                    if (phone.equals(entry.getValue())) {
                        Toast.makeText(this, "该手机号已绑定其他账号！", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        mEditor.putString(userName, userName);
                        mEditor.putString(userName + "_PassWord", passWord);
                        mEditor.putString(userName + "_Phone", phone);
                        mEditor.commit();
                        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                        Toast.makeText(this, "注册成功!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
