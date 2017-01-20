package net.gamepickle.rcap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GameVariables gameVars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameVars = new GameVariables(this);
        TextView t = (TextView) findViewById(R.id.cash_text);
        t.setText(String.valueOf(gameVars.getInt("CASH")));
    }

}
