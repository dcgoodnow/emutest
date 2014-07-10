package com.example.mymodule.app2;

/**
 * Created by Daniel on 7/10/2014.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class AndroidVerticalSeekbarExampleActivity extends Activity implements OnSeekBarChangeListener {
    private TextView tv;
    private VerticalSeekBar seekbar;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv_value);
        seekbar = (VerticalSeekBar)findViewById(R.id.seekbar);
        tv.setText(String.valueOf(seekbar.getProgress()) + "/" + String.valueOf(seekbar.getMax()));
        seekbar.setMax(100);
        seekbar.setOnSeekBarChangeListener(this);
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress,
                                  boolean fromUser) {
        // TODO Auto-generated method stub
        tv.setText(String.valueOf(seekbar.getProgress()) + "/" + String.valueOf(seekbar.getMax()));
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // TODO Auto-generated method stub

    }
}
