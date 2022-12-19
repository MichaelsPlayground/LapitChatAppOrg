package in.tvac.akshaye.lapitchat;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by AkshayeJH on 11/06/17.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter {

    // todo deprecated FragmentPagerAdapter
    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            // todo add fragments

            case 0: return new ChatsFragment();
            /*
            case 1: return new ContactsFragment();
            case 2: return new RequestsFragment();
            case 3: return new GroupsFragment();
             */
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position) {
            case 0: return "REQUESTS";
            case 1: return "CHATS";
            case 2: return "FRIENDS";
            default: return null;
        }
    }
}
