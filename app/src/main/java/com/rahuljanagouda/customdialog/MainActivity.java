package com.rahuljanagouda.customdialog;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rahuljanagouda.prettydialog.PrettyDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Context mContext = MainActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
        View dialogView = inflater.inflate(R.layout.test_layout,null);

        TextView clickText = (TextView) dialogView.findViewById(R.id.click_me);
        clickText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Clicked the click", Toast.LENGTH_SHORT).show();
            }
        });

        FragmentManager fm = getSupportFragmentManager();
        PrettyDialog pd = PrettyDialog.newInstance(dialogView);
        pd.show(fm,"Testing");
    }
}
