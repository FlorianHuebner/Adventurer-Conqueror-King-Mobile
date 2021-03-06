package com.ack.adventureandconquer.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ack.adventureandconquer.R;
import com.ack.adventureandconquer.game.adventure.Barren;
import com.ack.adventureandconquer.game.adventure.City;
import com.ack.adventureandconquer.game.adventure.Clear;
import com.ack.adventureandconquer.game.adventure.Desert;
import com.ack.adventureandconquer.game.adventure.Encounter;
import com.ack.adventureandconquer.game.adventure.Grass;
import com.ack.adventureandconquer.game.adventure.Hills;
import com.ack.adventureandconquer.game.adventure.Inhabited;
import com.ack.adventureandconquer.game.adventure.IsTerrain;
import com.ack.adventureandconquer.game.adventure.Jungle;
import com.ack.adventureandconquer.game.adventure.Mountains;
import com.ack.adventureandconquer.game.adventure.Ocean;
import com.ack.adventureandconquer.game.adventure.River;
import com.ack.adventureandconquer.game.adventure.Scrub;
import com.ack.adventureandconquer.game.adventure.Swamp;
import com.ack.adventureandconquer.game.adventure.Wilderness;
import com.ack.adventureandconquer.game.adventure.Woods;
import com.ack.adventureandconquer.info.GameController;
import com.ack.adventureandconquer.ui.character.LoginActivity;
import com.ack.adventureandconquer.ui.helper.image.ImageSizeHelper;


public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout)
        );

        _setImageButtonBackground(R.id.clearing_image, R.drawable.clearing_q, 100, 100);
        _setImageButtonBackground(R.id.grass_image, R.drawable.grass_q, 100, 100);
        _setImageButtonBackground(R.id.scrub_image, R.drawable.scrub_q, 100, 100);
        _setImageButtonBackground(R.id.woods_image, R.drawable.woods_q, 100, 100);
        _setImageButtonBackground(R.id.river_image, R.drawable.river_q, 100, 100);
        _setImageButtonBackground(R.id.swamp_image, R.drawable.marsh_q, 100, 100);
        _setImageButtonBackground(R.id.mountains_image, R.drawable.mountains_q, 100, 100);
        _setImageButtonBackground(R.id.hills_image, R.drawable.hills_q, 100, 100);
        _setImageButtonBackground(R.id.barren_image, R.drawable.barren_q, 100, 100);
        _setImageButtonBackground(R.id.desert_image, R.drawable.desert_q, 100, 100);
        _setImageButtonBackground(R.id.inhabited_image, R.drawable.inhabited_q, 100, 100);
        _setImageButtonBackground(R.id.city_image, R.drawable.city_q, 100, 100);
        _setImageButtonBackground(R.id.ocean_image, R.drawable.ocean_q, 100, 100);
        _setImageButtonBackground(R.id.jungle_image, R.drawable.jungle_q, 100, 100);
    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();

        if (position == 1) {
            Intent intent = new Intent(this, EncounterListActivity.class);
            startActivity(intent);
        }
        if (position == 2) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    public void onImageButtonClicked(View v) {
        Wilderness wilderness = new Wilderness();
        IsTerrain terrain = null;

        switch (v.getId()) {
            case R.id.clearing_image:
                terrain = new Clear();
                break;
            case R.id.grass_image:
                terrain = new Grass();
                break;
            case R.id.scrub_image:
                terrain = new Scrub();
                break;
            case R.id.woods_image:
                terrain = new Woods();
                break;
            case R.id.river_image:
                terrain = new River();
                break;
            case R.id.swamp_image:
                terrain = new Swamp();
                break;
            case R.id.mountains_image:
                terrain = new Mountains();
                break;
            case R.id.hills_image:
                terrain = new Hills();
                break;
            case R.id.barren_image:
                terrain = new Barren();
                break;
            case R.id.desert_image:
                terrain = new Desert();
                break;
            case R.id.inhabited_image:
                terrain = new Inhabited();
                break;
            case R.id.city_image:
                terrain = new City();
                break;
            case R.id.ocean_image:
                terrain = new Ocean();
                break;
            case R.id.jungle_image:
                terrain = new Jungle();
                break;
        }

        GameController.getInstance().destroyData();

        Encounter encounter = wilderness.findEncounterByTerrain(terrain);
        GameController.getInstance().addEncounter(encounter);

        Intent intent = new Intent(this, EncounterDetailActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void _setImageButtonBackground(int imageViewId, int imageResourceId, int height, int width) {

        ImageView clearing_button = (ImageView) findViewById(imageViewId);
        clearing_button.setImageBitmap(
            ImageSizeHelper.decodeSampledBitmapFromResource(getResources(), imageResourceId, height, width)
        );
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MainActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

}
