package com.mcxiaoke.minicat.adapter;

import android.app.FragmentManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.mcxiaoke.minicat.R;
import com.mcxiaoke.minicat.fragment.AbstractListFragment;
import com.mcxiaoke.minicat.fragment.ConversationListFragment;
import com.mcxiaoke.minicat.fragment.HomeTimelineFragment;
import com.mcxiaoke.minicat.fragment.MentionTimelineFragment;
import com.mcxiaoke.minicat.fragment.PublicTimelineFragment;

public class HomePagesAdapter extends FragmentPagerAdapter {

    private static final int[] ICONS = {
            R.drawable.ic_home_material, R.drawable.ic_mention_yup, R.drawable.ic_public_material, R.drawable.ic_conversation_material
    };
    private static final int[] TITLES = {
            R.string.page_title_home, R.string.page_title_mention, R.string.page_title_public, R.string.page_title_conversation
    };

    private Context mContext;

    public HomePagesAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public AbstractListFragment getItem(int position) {
        final AbstractListFragment fragment;
        switch (position) {
            case 0:
                fragment = HomeTimelineFragment.newInstance();
//                fragment = PublicTimelineFragment.newInstance();
                break;
            case 1:
                fragment = MentionTimelineFragment.newInstance();
                break;
            case 2:
                fragment = PublicTimelineFragment.newInstance();
//                fragment = HomeTimelineFragment.newInstance();
                break;
            case 3:
                fragment = ConversationListFragment.newInstance(false);
                break;
            default:
                fragment = null;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        return mContext.getString(TITLES[position]);
        Drawable image = ContextCompat.getDrawable(mContext, ICONS[position]);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        SpannableString sb = new SpannableString(" ");
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }
}
