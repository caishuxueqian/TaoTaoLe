package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import orc.com.taotaole.R;

public class DetailActivity extends AppCompatActivity {
    Dialog dialog = null;
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mSharedPrefrences = getSharedPreferences("userinfo", MODE_PRIVATE);
        mEditor = mSharedPrefrences.edit();
        findViewById(R.id.detail_iv).setOnClickListener(e -> startActivity(new Intent(this, ShowImageActivity.class)));
        findViewById(R.id.detail_bt_back).setOnClickListener(e -> {
            finish();
        });
        findViewById(R.id.detail_bt_buy).setOnClickListener(e -> {
            if ("false".equals(mSharedPrefrences.getString("login_Sign", "")))
                startActivity(new Intent(this, LoginActivity.class));
            else
                buy();
        });
        findViewById(R.id.detail_bt_cart).setOnClickListener(e ->{
            if ("false".equals(mSharedPrefrences.getString("login_Sign", "")))
                startActivity(new Intent(this, LoginActivity.class));
            else
                cart();
        });
    }

    public void buy() {
        TextView add;
        TextView sub;
        TextView acount;
        LayoutInflater inflater = LayoutInflater.from(this);
        final View buyView = inflater.inflate(R.layout.dialog_buy_cart, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(buyView);
        add = buyView.findViewById(R.id.dialog_add);
        sub = buyView.findViewById(R.id.dialog_sub);
        acount = buyView.findViewById(R.id.dialog_acount);
        add.setOnClickListener(e -> {
            acount.setText(String.valueOf(Integer.parseInt(acount.getText().toString()) + 1));
        });
        sub.setOnClickListener(e -> {
            if (!(Integer.parseInt(acount.getText().toString()) == 1))
                acount.setText(String.valueOf(Integer.parseInt(acount.getText().toString()) - 1));
        });
        buyView.findViewById(R.id.dialog_no).setOnClickListener(e -> dialog.dismiss());
        buyView.findViewById(R.id.dialog_yes).setOnClickListener(e -> {
            Toast.makeText(this, "稍后重试", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        dialog = builder.create();
        dialog.show();
    }

    public void cart() {
        TextView add;
        TextView sub;
        TextView acount;
        LayoutInflater inflater = LayoutInflater.from(this);
        final View buyView = inflater.inflate(R.layout.dialog_buy_cart, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(buyView);
        add = buyView.findViewById(R.id.dialog_add);
        sub = buyView.findViewById(R.id.dialog_sub);
        acount = buyView.findViewById(R.id.dialog_acount);
        add.setOnClickListener(e -> {
            acount.setText(String.valueOf(Integer.parseInt(acount.getText().toString()) + 1));
        });
        sub.setOnClickListener(e -> {
            if (!(Integer.parseInt(acount.getText().toString()) == 1))
                acount.setText(String.valueOf(Integer.parseInt(acount.getText().toString()) - 1));
        });
        buyView.findViewById(R.id.dialog_no).setOnClickListener(e -> dialog.dismiss());
        buyView.findViewById(R.id.dialog_yes).setOnClickListener(e -> {
            Toast.makeText(this, "收藏成功", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        dialog = builder.create();
        dialog.show();
    }
}