package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import orc.com.taotaole.R;

public class DetailActivity extends AppCompatActivity {
    Dialog dialog = null;
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;
    private ImageView img;
    private TextView money;
    private TextView describe;
    private TextView number;
    private int the_Sign;
    private ImageView dia_img;
    private TextView dia_money;
    private TextView dia_number;
    private TextView dia_add;
    private TextView dia_acount;
    private TextView dia_sub;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mSharedPrefrences = getSharedPreferences("userinfo", MODE_PRIVATE);
        mEditor = mSharedPrefrences.edit();
        initView();
        the_Sign=(int)getIntent().getSerializableExtra("next_Sign");
        if(the_Sign==0){
            img.setImageResource(new view_Mes0().view_img);
            money.setText(new view_Mes0().view_money);
            describe.setText(new view_Mes0().view_describe);
            number.setText(new view_Mes0().view_number);
        }
        if(the_Sign==1){
            img.setImageResource(new view_Mes1().view_img);
            money.setText(new view_Mes1().view_money);
            describe.setText(new view_Mes1().view_describe);
            number.setText(new view_Mes1().view_number);
        }
        if(the_Sign==2){
            img.setImageResource(new view_Mes2().view_img);
            money.setText(new view_Mes2().view_money);
            describe.setText(new view_Mes2().view_describe);
            number.setText(new view_Mes2().view_number);
        }
        if(the_Sign==3){
            img.setImageResource(new view_Mes3().view_img);
            money.setText(new view_Mes3().view_money);
            describe.setText(new view_Mes3().view_describe);
            number.setText(new view_Mes3().view_number);
        }
        if(the_Sign==4){
            img.setImageResource(new view_Mes4().view_img);
            money.setText(new view_Mes4().view_money);
            describe.setText(new view_Mes4().view_describe);
            number.setText(new view_Mes4().view_number);
        }
        if(the_Sign==5){
            img.setImageResource(new view_Mes5().view_img);
            money.setText(new view_Mes5().view_money);
            describe.setText(new view_Mes5().view_describe);
            number.setText(new view_Mes5().view_number);
        }
        findViewById(R.id.detail_img).setOnClickListener(e -> startActivity(new Intent(this, ShowImageActivity.class)));
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
    class view_Mes0{
        int view_img=R.drawable.nai1;
        String view_describe="12月豆本豆原味豆奶250ml*12瓶 早餐营养奶制品19年9月到期";
        String view_money="19.8";
        String view_number="121";
    }
    class view_Mes1{
        int view_img=R.drawable.nai2;
        String view_describe="蒙牛未来星儿童成长牛奶整箱营养佳智型12盒装早餐学生乳制品礼盒";
        String view_money="59";
        String view_number="100";
    }
    class view_Mes2{
        int view_img=R.drawable.dianfanbao1;
        String view_describe="电饭煲家用迷你小型2L3L学生宿舍老式电饭煲 蒸煮多功能1-2-3-4人";
        String view_money="89";
        String view_number="121";
    }
    class view_Mes3{
        int view_img=R.drawable.dianfanbao2;
        String view_describe="电饭煲家用迷你小型电饭煲 1-2-3-4人学生宿舍普通老式蒸煮多功能";
        String view_money="108";
        String view_number="12";
    }
    class view_Mes4{
        int view_img=R.drawable.txu1;
        String view_describe="南极人短袖T恤男潮流潮牌半袖加肥加大宽松大码男士夏季胖子衣服";
        String view_money="92";
        String view_number="1213";
    }
    class view_Mes5{
        int view_img=R.drawable.txu2;
        String view_describe="短袖男夏装韩版潮流纯棉2019新款潮牌宽松青少年男孩初中生T恤";
        String view_money="98";
        String view_number="199";
    }

public void  initView(){
        img=findViewById(R.id.detail_img);
        money=findViewById(R.id.detail_money);
        describe=findViewById(R.id.detail_describe);
        number=findViewById(R.id.detail_number);
}
public void initView_diaglog(View v){
     dia_img=v.findViewById(R.id.dialog_img);
     dia_money=v.findViewById(R.id.dialog_money);
     dia_number=v.findViewById(R.id.dialog_number);
     dia_add=v.findViewById(R.id.dialog_add);
    dia_acount=v.findViewById(R.id.dialog_acount);
     dia_sub=v.findViewById(R.id.dialog_sub);
}
    public void buy() {
        LayoutInflater inflater = LayoutInflater.from(this);
        final View buyView = inflater.inflate(R.layout.dialog_buy_cart, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(buyView);
        initView_diaglog(buyView);
        the_Sign=(int)getIntent().getSerializableExtra("next_Sign");
        if(the_Sign==0){
            dia_img.setImageResource(new view_Mes0().view_img);
            dia_money.setText(new view_Mes0().view_money);
            dia_number.setText(new view_Mes0().view_number);
        }
        if(the_Sign==1){
            dia_img.setImageResource(new view_Mes1().view_img);
            dia_money.setText(new view_Mes1().view_money);
            dia_number.setText(new view_Mes1().view_number);
        }
        if(the_Sign==2){
            dia_img.setImageResource(new view_Mes2().view_img);
            dia_money.setText(new view_Mes2().view_money);
            dia_number.setText(new view_Mes2().view_number);
        }
        if(the_Sign==3){
            dia_img.setImageResource(new view_Mes3().view_img);
            dia_money.setText(new view_Mes3().view_money);
            dia_number.setText(new view_Mes3().view_number);
        }
        if(the_Sign==4){
            dia_img.setImageResource(new view_Mes4().view_img);
            dia_money.setText(new view_Mes4().view_money);
            dia_number.setText(new view_Mes4().view_number);
        }
        if(the_Sign==5){
            dia_img.setImageResource(new view_Mes5().view_img);
            dia_money.setText(new view_Mes5().view_money);
            dia_number.setText(new view_Mes5().view_number);
        }
        dia_add.setOnClickListener(e -> {
            dia_acount.setText(String.valueOf(Integer.parseInt(dia_acount.getText().toString()) + 1));
        });
        dia_sub.setOnClickListener(e -> {
            if (!(Integer.parseInt(dia_acount.getText().toString()) == 1))
                dia_acount.setText(String.valueOf(Integer.parseInt(dia_acount.getText().toString()) - 1));
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
        LayoutInflater inflater = LayoutInflater.from(this);
        final View buyView = inflater.inflate(R.layout.dialog_buy_cart, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(buyView);
        initView_diaglog(buyView);
        the_Sign=(int)getIntent().getSerializableExtra("next_Sign");
        if(the_Sign==0){
            dia_img.setImageResource(new view_Mes0().view_img);
            dia_money.setText(new view_Mes0().view_money);
            dia_number.setText(new view_Mes0().view_number);
        }
        if(the_Sign==1){
            dia_img.setImageResource(new view_Mes1().view_img);
            dia_money.setText(new view_Mes1().view_money);
            dia_number.setText(new view_Mes1().view_number);
        }
        if(the_Sign==2){
            dia_img.setImageResource(new view_Mes2().view_img);
            dia_money.setText(new view_Mes2().view_money);
            dia_number.setText(new view_Mes2().view_number);
        }
        if(the_Sign==3){
            dia_img.setImageResource(new view_Mes3().view_img);
            dia_money.setText(new view_Mes3().view_money);
            dia_number.setText(new view_Mes3().view_number);
        }
        if(the_Sign==4){
            dia_img.setImageResource(new view_Mes4().view_img);
            dia_money.setText(new view_Mes4().view_money);
            dia_number.setText(new view_Mes4().view_number);
        }
        if(the_Sign==5){
            dia_img.setImageResource(new view_Mes5().view_img);
            dia_money.setText(new view_Mes5().view_money);
            dia_number.setText(new view_Mes5().view_number);
        }
        dia_add.setOnClickListener(e -> {
            dia_acount.setText(String.valueOf(Integer.parseInt(dia_acount.getText().toString()) + 1));
        });
        dia_sub.setOnClickListener(e -> {
            if (!(Integer.parseInt(dia_acount.getText().toString()) == 1))
                dia_acount.setText(String.valueOf(Integer.parseInt(dia_acount.getText().toString()) - 1));
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