package com.mcxiaoke.minicat.ui.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

/**
 * Created by anthonyeef on 11/28/15.
 */

public class ScrollFABBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {
    private int tabbarHeight;

    public ScrollFABBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
