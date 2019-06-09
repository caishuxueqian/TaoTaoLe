package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import orc.com.taotaole.R;

public class DetailActivity extends AppCompatActivity {
    Dialog dialog = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        findViewById(R.id.detail_bt_back).setOnClickListener(e -> {
            finish();
        });
        findViewById(R.id.detail_bt_cart).setOnClickListener(e -> Toast.makeText(this, "点购物车干嘛", Toast.LENGTH_SHORT).show());
        findViewById(R.id.detail_bt_buy).setOnClickListener(e -> buy());
        findViewById(R.id.detail_bt_cart).setOnClickListener(e -> cart());
    }

    public void buy() {
        LayoutInflater inflater = LayoutInflater.from(this);
        final View buyView = inflater.inflate(R.layout.dialog_buy_cart, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(buyView);
        buyView.findViewById(R.id.dialog_no).setOnClickListener(e -> dialog.dismiss());
        buyView.findViewById(R.id.dialog_yes).setOnClickListener(e -> {
            Toast.makeText(this, "买不了", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        dialog = builder.create();
        dialog.show();
    }

    public void cart() {
        LayoutInflater inflater = LayoutInflater.from(this);
        final View buyView = inflater.inflate(R.layout.dialog_buy_cart, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(buyView);
        buyView.findViewById(R.id.dialog_no).setOnClickListener(e -> dialog.dismiss());
        buyView.findViewById(R.id.dialog_yes).setOnClickListener(e -> {
            Toast.makeText(this, "收藏不了", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        dialog = builder.create();
        dialog.show();
    }
}