package com.cxyzy.tools.edittexthint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
/**
 * @author 程序园中猿
 */
public class RelativeLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        new EditTextHint(this, "RelativeLayout中为EditText添加hint", R.id.editText).showHint();
    }

}
