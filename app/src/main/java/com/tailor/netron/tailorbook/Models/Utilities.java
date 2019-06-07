package com.tailor.netron.tailorbook.Models;

import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

import com.tailor.netron.tailorbook.Constants.Constants;
import com.tailor.netron.tailorbook.Fragments.HomeDefaultFragment;
import com.tailor.netron.tailorbook.R;

/**
 * Created by USER on 07/06/2019.
 */

public class Utilities {

    public static SpannableString setHomeBgDefaultText()
    {
        SpannableString spannableString = new SpannableString(HomeDefaultFragment.context.getResources().getString(R.string.home_text_bg, Constants.DEFAULT_TEXT_BG));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(HomeDefaultFragment.context.getResources().getColor(R.color.colorAccentDark));
        spannableString.setSpan(foregroundColorSpan, 26, 34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }
}
