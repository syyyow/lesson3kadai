package jp.techacademy.shoichi.ito.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ポチ", 3,"映画鑑賞");     // 名前をポチ、年齢3歳で、Humanのインスタンスを作る

        human.say();
        Log.d("javatest", "私の名前は" + human.name + "です。");
        Log.d("javatest", "年齢は" + human.age + "歳です。");

        human.think();
        Log.d("javatest", "趣味は" + human.hobby + "です。");
    }
}