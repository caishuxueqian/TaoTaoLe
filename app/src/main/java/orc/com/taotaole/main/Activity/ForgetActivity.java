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
    private String right_phone;
    private String right_passWord;

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
        right_phone="^((13[0-9])|(14[579])|(15([0-3,5-9]))|(16[6])|(17[0135678])|(18[0-9]|19[89]))\\d{8}$";
        right_passWord="^([0-9]|[a-z]|[A-Z]){6}$";
        findViewById(R.id.tv_getCode).setOnClickListener(e -> {
            String user_Code;
            user_Code = String.valueOf((int) (Math.random() * 8000) + 1000);
            mEditor.putString("user_Code", user_Code);
            mEditor.commit();
            Toast.makeText(this, "验证码：" + user_Code, Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.btn_yes).setOnClickListener(e -> {
            phone = user_Phone.getText().toString();
            passWord_Reset = user_PassWord_Reset.getText().toString();
            code = user_Code.getText().toString();
//            //遍历map
            Map<String, ?> allConent = mSharedPrefrences.getAll();
            String userName;
            if (phone.equals("") || passWord_Reset.equals("") || code.equals("")) {
                Toast.makeText(this, "信息填写不完整", Toast.LENGTH_SHORT).show();
            }  else if(!phone.matches(right_phone)){
                Toast.makeText(this, "请输入正确的手机号!", Toast.LENGTH_SHORT).show();
            }
            else if(!passWord_Reset.matches(right_passWord)) {
                Toast.makeText(this, "请输入正确的密码!", Toast.LENGTH_SHORT).show();

            } else if (!mSharedPrefrences.getString("user_Code", "").equals(code)) {
                Toast.makeText(this, "验证码输入错误！", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(this, "该手机号不存在!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
