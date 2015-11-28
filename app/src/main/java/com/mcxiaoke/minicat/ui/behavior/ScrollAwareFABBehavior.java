package com.mcxiaoke.minicat.ui.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by anthonyeef on 11/28/15.
 */

public class ScrollAwareFABBehavior extends FloatingActionButton.Behavior{

    public ScrollAwareFABBehavior(Context context, AttributeSet attrs) {
        super();
    }
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout,
                                       FloatingActionButton child, View directTargetChild,
                                       View target, int nestedScrollAxes) {
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL ||
                super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target,
                        nestedScrollAxes);
    }

//    @Override
//    public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child,
//                               View target, int dxConsumed, int dyConsunmed, int dxUnconsumed,
//                               int dyUnconsumed) {
//        if (UIHome.viewpager.getCurrentItem() == 0) {
//            if (dyConsunmed > 0 && child.getVisibility() == View.VISIBLE ) {
//                child.hide();
//            } else if (dyConsunmed < 0 && child.getVisibility() != View.VISIBLE) {
//                child.show();
//            }

//        }
//    }
}
