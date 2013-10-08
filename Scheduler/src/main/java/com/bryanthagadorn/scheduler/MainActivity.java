package com.bryanthagadorn.scheduler;

import com.bryanthagadorn.scheduler.R;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends Activity implements ActionBar.TabListener {
    public static FriendsList friendsList;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.mainListView);
       // FriendsList friendsList = new FriendsList();
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab friendsTab = actionBar.newTab().setText("Friends");
        ActionBar.Tab eventsTab = actionBar.newTab().setText("Events");
        friendsTab.setTabListener(this);
        eventsTab.setTabListener(this);

       // Fragment PlayerFragment = new AFragment();
      //  Fragment StationsFragment = new BFragment();

//set the Tab listener. Now we can listen for clicks.
        //PlayerTab.setTabListener(new MyTabsListener(PlayerFragment));
      //  StationsTab.setTabListener(new MyTabsListener(StationsFragment));

//add the two tabs to the actionbar
        actionBar.addTab(friendsTab);
        actionBar.addTab(eventsTab);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_add_friend:
                InputDialog.show(getApplicationContext());
                return true;
            case R.id.action_add_event:
               // dialogShow("events")
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void update(){
        SimpleAdapter adapter = new SimpleAdapter(this,android.R.layout.simple_list_item_1,)
        lv.setAdapter(adapter);
    }




    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
