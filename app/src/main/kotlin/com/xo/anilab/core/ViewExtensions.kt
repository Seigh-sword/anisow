package com.xo.anilab.core

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

fun View.setVisible(visible: Boolean, keepSpace: Boolean = false) {
    visibility = when {
        visible -> View.VISIBLE
        keepSpace -> View.INVISIBLE
        else -> View.GONE
    }
}

fun View.toast(message: CharSequence?) {
    context.toast(message)
}

fun View.toast(@StringRes message: Int) {
    context.toast(message)
}

fun Context.toast(@StringRes message: Int) {
    toast(getString(message))
}

/**
 * The `CharSequence` overload is what every caller passes an API error message
 * to; without it an `Activity` picks the unresolvable `Int` overload instead.
 */
fun Context.toast(message: CharSequence?) {
    if (!message.isNullOrBlank()) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

fun Fragment.toast(@StringRes message: Int) = requireContext().toast(message)

fun Fragment.toast(message: CharSequence?) = context?.toast(message)

/**
 * Posters come from the API with mixed hosts and occasional nulls; Glide
 * handles both, the drawable behind the image covers the gap.
 */
fun ImageView.loadPoster(url: String?) {
    Glide.with(this)
        .load(url)
        .centerCrop()
        .transition(DrawableTransitionOptions.withCrossFade(150))
        .into(this)
}
