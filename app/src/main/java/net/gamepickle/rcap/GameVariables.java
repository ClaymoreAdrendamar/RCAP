package net.gamepickle.rcap;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Joseph on 21/12/2016.
 */

public class GameVariables{
    private SharedPreferences settings;
    private SharedPreferences.Editor editor;

    public GameVariables(Context context) {
        String file_name = "Stats";

        // Stats file name
        // {"CASH": int cash; "POPULARITY": int popularity;
        // "PLAYER_STATS": int player_stats; "NAME": string name

        settings = context.getSharedPreferences(file_name, Context.MODE_PRIVATE);
        editor = settings.edit();

    }

    public int getInt(String key) {
        return settings.getInt(key, 0);
    }

    public void setInt(String key, int amount) {
        editor.putInt(key, amount);
        editor.commit();
    }
}
