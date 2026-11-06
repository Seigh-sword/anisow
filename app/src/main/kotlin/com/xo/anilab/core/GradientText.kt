package com.xo.anilab.core

import android.graphics.LinearGradient
import android.graphics.Shader
import android.widget.TextView
import com.xo.anilab.R

/**
 * The brand gradient as a text fill.
 *
 * A flat colour cannot show a gradient and a gradient drawable cannot clip to
 * glyphs, so the shader goes on the paint. The shader is sized to the measured
 * text, which only changes on a layout pass, so that is when it is rebuilt.
 */
object GradientText {

    fun apply(view: TextView) {
        view.addOnLayoutChangeListener { target, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom ->
            val geometryChanged = left != oldLeft || top != oldTop || right != oldRight || bottom != oldBottom
            if (!geometryChanged) return@addOnLayoutChangeListener

            val textView = target as TextView
            val width = textView.paint.measureText(textView.text?.toString().orEmpty())
            if (width <= 0f) return@addOnLayoutChangeListener

            val context = textView.context
            textView.paint.shader = LinearGradient(
                0f,
                0f,
                width,
                0f,
                context.getColor(R.color.brand_start),
                context.getColor(R.color.brand_end),
                Shader.TileMode.CLAMP,
            )
            textView.invalidate()
        }
    }
}
