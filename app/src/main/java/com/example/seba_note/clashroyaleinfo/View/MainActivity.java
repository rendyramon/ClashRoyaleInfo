package com.example.seba_note.clashroyaleinfo.View;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.example.seba_note.clashroyaleinfo.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content_frame)
    FrameLayout contentFrame;
    @BindView(R.id.left_drawer)
    ListView leftDrawer;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.bind(this);
        setFirstFragment();
    }

    private void setFirstFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.content_frame,new CardFragment(),CardFragment.class.getName());
        ft.commit();
    }

}
