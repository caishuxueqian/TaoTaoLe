package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

import orc.com.taotaole.R;

public class ForgetActivity extends AppCompatActivity {
    private EditText user_Phone;
    private EditText user_PassWord_Reset;
    private EditText user_Code;
    private String phone;
    private String passWord_Reset;
    private String code;
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        Button button = findViewById(R.id.btn_register);
        user_Phone = (EditText) findViewById(R.id.et_phone);
        user_PassWord_Reset = (EditText) findViewById(R.id.et_password_reset);
        user_Code = (EditText) findViewById(R.id.et_code);
        mSharedPrefrences = getSharedPreferences("userinfo", MODE_PRIVATE);
        mEditor = mSharedPrefrences.edit();
        findViewById(R.id.tv_getCode).setOnClickListener(e -> {
            Toast.makeText(this, "正在获取验证码", Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.btn_yes).setOnClickListener(e -> {
            phone = user_Phone.getText().toString();
            passWord_Reset = user_PassWord_Reset.getText().toString();
            code = user_Code.getText().toString();
//            遍历map
            Map<String, ?> allConent = mSharedPrefrences.getAll();
            String userName;
            if (phone.equals("") || passWord_Reset.equals("") || code.equals("")) {
                Toast.makeText(this, "信息不完整", Toast.LENGTH_SHORT).show();
            } else if (true) {
                for (Map.Entry<String, ?> entry : allConent.entrySet()) {
                    if (phone.equals(entry.getValue())) {
//                        通过手机号获取账号名
                        userName = entry.getKey().substring(0, entry.getKey().length() - 6);
//                        通过账号名获取密码名
                        mEditor.putString(userName + "_PassWord", passWord_Reset);
                        mEditor.commit();
                        startActivity(new Intent(ForgetActivity.this, LoginActivity.class));
                        Toast.makeText(this, "密码更改成功！", Toast.LENGTH_SHORT).show();
                        break;
                    } else {
                        Toast.makeText(this, "手机号不存在!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }
}
