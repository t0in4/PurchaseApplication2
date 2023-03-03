package com.example.purchaseapplication2;

import android.app.Activity;
import android.widget.TextView;

public class DublicateAboutActivity {
    Activity activity;
    public DublicateAboutActivity(Activity activity) {
        this.activity = activity;
    }
    public void test() {
        TextView t=activity.findViewById(R.id.answer);
        /*t.setText("Miaooo");*/
        if (Checker.checkPurchase()) {
            t.setText("Куплено");
        } else {
            t.setText("Надо купить");
        }
    }
}
