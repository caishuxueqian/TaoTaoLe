package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.RadioGroup;

import orc.com.taotaole.R;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import orc.com.taotaole.R;

import static java.lang.Class.forName;

public class DrawActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener {
    //    MainActivity
//    private TextView txt_topbar;
    private RadioGroup rg_tab_bar;
    private RadioButton rb_channel;
    private RadioButton rb_message;
    private RadioButton rb_better;
    private RadioButton rb_setting;
    private ViewPager vpager;
    private MyFragmentPagerAdapter mAdapter;
    private String login_Sign;

    //几个代表页面的常量
    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;
//    MainActivity

    //    获取当前用户名
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;
    private MenuItem send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //    MainActivity
        setSupportActionBar(toolbar);
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        bindViews();
        rb_channel.setChecked(true);
//        获取当前登录标志，并设置到个人信息
        mSharedPrefrences = getSharedPreferences("userinfo", MODE_PRIVATE);
        mEditor = mSharedPrefrences.edit();
        login_Sign = mSharedPrefrences.getString("login_Sign", "false");

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        跳转到个人中心
        findViewById(R.id.draw_img).setOnClickListener(e -> startActivity(new Intent(this, UserActivity.class)));
            getMenuInflater().inflate(R.menu.draw, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_share) {

//    ////    } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_home) {
//
//        }else if (id == R.id.nav_tools)  {

        } else if (id == R.id.nav_send) {
            if("false".equals(mSharedPrefrences.getString("login_Sign","false")))
                startActivity(new Intent(this,LoginActivity.class));
            else
            showDialog();

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void showDialog() {
        Dialog dialog = new AlertDialog.Builder(this).setTitle(" ")
                .setMessage("               确定退出登录？").setPositiveButton("确定", (dialog1, which) -> {
                    mEditor.putString("login_Sign", "false");
                    mEditor.commit();
                    startActivity(new Intent(this, DrawActivity.class));
                }).setNegativeButton("取消", (dialog12, which) -> {

                }).create();
        dialog.show();
    }

    //    ---------------------------------------------------------------------------------
    //    MainActivity
    //    MainActivity
    //    MainActivity
    //    MainActivity
    private void bindViews() {
//        txt_topbar = (TextView) findViewById(R.id.txt_topbar);
        rg_tab_bar = (RadioGroup) findViewById(R.id.rg_tab_bar);
        rb_channel = (RadioButton) findViewById(R.id.rb_channel);
        rb_message = (RadioButton) findViewById(R.id.rb_message);
        rb_better = (RadioButton) findViewById(R.id.rb_better);
        rb_setting = (RadioButton) findViewById(R.id.rb_setting);
        rg_tab_bar.setOnCheckedChangeListener(this);

        vpager = (ViewPager) findViewById(R.id.vpager);
        vpager.setAdapter(mAdapter);
        vpager.setCurrentItem(0);
        vpager.addOnPageChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId) {
            case R.id.rb_channel:
                vpager.setCurrentItem(PAGE_ONE);
                break;
            case R.id.rb_message: {
                vpager.setCurrentItem(PAGE_TWO);

            }
            break;
            case R.id.rb_better:
                if ("false".equals(mSharedPrefrences.getString("login_Sign","false"))) {
                    startActivity(new Intent(this, LoginActivity.class));
                } else {
                    vpager.setCurrentItem(PAGE_THREE);
                }

                break;
            case R.id.rb_setting:
                if ("false".equals(mSharedPrefrences.getString("login_Sign","false"))) {
                    startActivity(new Intent(this, LoginActivity.class));
                } else {
                    vpager.setCurrentItem(PAGE_FOUR);
                }

                break;
        }
    }


    //重写ViewPager页面切换的处理方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        //state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
        if (state == 2) {
            switch (vpager.getCurrentItem()) {
                case PAGE_ONE:
                    rb_channel.setChecked(true);
                    break;
                case PAGE_TWO:
                    rb_message.setChecked(true);
                    break;
                case PAGE_THREE:
                    rb_better.setChecked(true);
                    break;
                case PAGE_FOUR:
                    rb_setting.setChecked(true);
                    break;
            }
        }
    }
}
