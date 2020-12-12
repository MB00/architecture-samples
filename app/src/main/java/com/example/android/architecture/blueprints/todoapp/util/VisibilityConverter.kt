package com.example.android.architecture.blueprints.todoapp.util

import android.view.View
import androidx.databinding.BindingConversion

object VisibilityConverter {

    // allows us to use ObservableBoolean as a parameter to 'android:visibility' in XML layouts

    @BindingConversion
    @JvmStatic
    fun convertBooleanToVisibility(isVisible: Boolean): Int {
        return if (isVisible)
            View.VISIBLE
        else
            View.INVISIBLE
    }
}