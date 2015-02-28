package org.ylm.aa_gradle_seed.app;

import android.app.Activity;
import android.widget.Toast;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;

@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.menu_main)
public class MainActivity extends Activity {


    @OptionsItem(R.id.action_settings)
    void menuActionSetting(){
        Toast.makeText(getApplicationContext(), "settings", Toast.LENGTH_SHORT).show();
    }

}
