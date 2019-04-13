package com.carbonylgroup.schoolpower.utils

import android.content.Context
import android.support.annotation.StyleRes
import com.carbonylgroup.schoolpower.R


/**
 * Created on 2017/10/30 13:26:25
 * Copied from Copyright (C) 2017 Kosh.
 * Modified by Copyright (C) 2019 SchoolPower Studio.
 */

class ThemeHelper(private val context: Context) {

    val utils = Utils(context)

    internal fun apply() {
        val theme = utils.getTheme()
        context.setTheme(getTheme(theme, utils.getAccentColorIndex()))
    }

    @StyleRes
    fun getTheme(theme: String, accentColor: Int): Int {
        return when (theme) {
            Utils.LIGHT -> lightArray[accentColor]
            Utils.DARK -> darkArray[accentColor]
            else -> R.style.ThemeLight_Cyan_500
        }
    }

    val lightArray = intArrayOf(
            R.style.ThemeLight_Pink_200,
            R.style.ThemeLight_Pink_300,
            R.style.ThemeLight_Pink_400,
            R.style.ThemeLight_Pink_500,
            R.style.ThemeLight_Pink_600,
            R.style.ThemeLight_Pink_700,
            R.style.ThemeLight_Red_200,
            R.style.ThemeLight_Red_300,
            R.style.ThemeLight_Red_400,
            R.style.ThemeLight_Red_500,
            R.style.ThemeLight_Red_600,
            R.style.ThemeLight_Red_700,
            R.style.ThemeLight_Purple_200,
            R.style.ThemeLight_Purple_300,
            R.style.ThemeLight_Purple_400,
            R.style.ThemeLight_Purple_500,
            R.style.ThemeLight_Purple_600,
            R.style.ThemeLight_Purple_700,
            R.style.ThemeLight_Blue_200,
            R.style.ThemeLight_Blue_300,
            R.style.ThemeLight_Blue_400,
            R.style.ThemeLight_Blue_500,
            R.style.ThemeLight_Blue_600,
            R.style.ThemeLight_Blue_700,
            R.style.ThemeLight_Cyan_200,
            R.style.ThemeLight_Cyan_300,
            R.style.ThemeLight_Cyan_400,
            R.style.ThemeLight_Cyan_500,
            R.style.ThemeLight_Cyan_600,
            R.style.ThemeLight_Cyan_700,
            R.style.ThemeLight_Teal_200,
            R.style.ThemeLight_Teal_300,
            R.style.ThemeLight_Teal_400,
            R.style.ThemeLight_Teal_500,
            R.style.ThemeLight_Teal_600,
            R.style.ThemeLight_Teal_700,
            R.style.ThemeLight_Green_200,
            R.style.ThemeLight_Green_300,
            R.style.ThemeLight_Green_400,
            R.style.ThemeLight_Green_500,
            R.style.ThemeLight_Green_600,
            R.style.ThemeLight_Green_700,
            R.style.ThemeLight_LightGreen_200,
            R.style.ThemeLight_LightGreen_300,
            R.style.ThemeLight_LightGreen_400,
            R.style.ThemeLight_LightGreen_500,
            R.style.ThemeLight_LightGreen_600,
            R.style.ThemeLight_LightGreen_700,
            R.style.ThemeLight_Yellow_200,
            R.style.ThemeLight_Yellow_300,
            R.style.ThemeLight_Yellow_400,
            R.style.ThemeLight_Yellow_500,
            R.style.ThemeLight_Yellow_600,
            R.style.ThemeLight_Yellow_700,
            R.style.ThemeLight_Orange_200,
            R.style.ThemeLight_Orange_300,
            R.style.ThemeLight_Orange_400,
            R.style.ThemeLight_Orange_500,
            R.style.ThemeLight_Orange_600,
            R.style.ThemeLight_Orange_700,
            R.style.ThemeLight_DeepOrange_200,
            R.style.ThemeLight_DeepOrange_300,
            R.style.ThemeLight_DeepOrange_400,
            R.style.ThemeLight_DeepOrange_500,
            R.style.ThemeLight_DeepOrange_600,
            R.style.ThemeLight_DeepOrange_700,
            R.style.ThemeLight_Brown_200,
            R.style.ThemeLight_Brown_300,
            R.style.ThemeLight_Brown_400,
            R.style.ThemeLight_Brown_500,
            R.style.ThemeLight_Brown_600,
            R.style.ThemeLight_Brown_700,
            R.style.ThemeLight_Grey_200,
            R.style.ThemeLight_Grey_300,
            R.style.ThemeLight_Grey_400,
            R.style.ThemeLight_Grey_500,
            R.style.ThemeLight_Grey_600,
            R.style.ThemeLight_Grey_700,
            R.style.ThemeLight_BlueGrey_200,
            R.style.ThemeLight_BlueGrey_300,
            R.style.ThemeLight_BlueGrey_400,
            R.style.ThemeLight_BlueGrey_500,
            R.style.ThemeLight_BlueGrey_600,
            R.style.ThemeLight_BlueGrey_700
    )
    val darkArray = intArrayOf(
            R.style.ThemeDark_Pink_200,
            R.style.ThemeDark_Pink_300,
            R.style.ThemeDark_Pink_400,
            R.style.ThemeDark_Pink_500,
            R.style.ThemeDark_Pink_600,
            R.style.ThemeDark_Pink_700,
            R.style.ThemeDark_Red_200,
            R.style.ThemeDark_Red_300,
            R.style.ThemeDark_Red_400,
            R.style.ThemeDark_Red_500,
            R.style.ThemeDark_Red_600,
            R.style.ThemeDark_Red_700,
            R.style.ThemeDark_Purple_200,
            R.style.ThemeDark_Purple_300,
            R.style.ThemeDark_Purple_400,
            R.style.ThemeDark_Purple_500,
            R.style.ThemeDark_Purple_600,
            R.style.ThemeDark_Purple_700,
            R.style.ThemeDark_Blue_200,
            R.style.ThemeDark_Blue_300,
            R.style.ThemeDark_Blue_400,
            R.style.ThemeDark_Blue_500,
            R.style.ThemeDark_Blue_600,
            R.style.ThemeDark_Blue_700,
            R.style.ThemeDark_Cyan_200,
            R.style.ThemeDark_Cyan_300,
            R.style.ThemeDark_Cyan_400,
            R.style.ThemeDark_Cyan_500,
            R.style.ThemeDark_Cyan_600,
            R.style.ThemeDark_Cyan_700,
            R.style.ThemeDark_Teal_200,
            R.style.ThemeDark_Teal_300,
            R.style.ThemeDark_Teal_400,
            R.style.ThemeDark_Teal_500,
            R.style.ThemeDark_Teal_600,
            R.style.ThemeDark_Teal_700,
            R.style.ThemeDark_Green_200,
            R.style.ThemeDark_Green_300,
            R.style.ThemeDark_Green_400,
            R.style.ThemeDark_Green_500,
            R.style.ThemeDark_Green_600,
            R.style.ThemeDark_Green_700,
            R.style.ThemeDark_DarkGreen_200,
            R.style.ThemeDark_DarkGreen_300,
            R.style.ThemeDark_DarkGreen_400,
            R.style.ThemeDark_DarkGreen_500,
            R.style.ThemeDark_DarkGreen_600,
            R.style.ThemeDark_DarkGreen_700,
            R.style.ThemeDark_Yellow_200,
            R.style.ThemeDark_Yellow_300,
            R.style.ThemeDark_Yellow_400,
            R.style.ThemeDark_Yellow_500,
            R.style.ThemeDark_Yellow_600,
            R.style.ThemeDark_Yellow_700,
            R.style.ThemeDark_Orange_200,
            R.style.ThemeDark_Orange_300,
            R.style.ThemeDark_Orange_400,
            R.style.ThemeDark_Orange_500,
            R.style.ThemeDark_Orange_600,
            R.style.ThemeDark_Orange_700,
            R.style.ThemeDark_DeepOrange_200,
            R.style.ThemeDark_DeepOrange_300,
            R.style.ThemeDark_DeepOrange_400,
            R.style.ThemeDark_DeepOrange_500,
            R.style.ThemeDark_DeepOrange_600,
            R.style.ThemeDark_DeepOrange_700,
            R.style.ThemeDark_Brown_200,
            R.style.ThemeDark_Brown_300,
            R.style.ThemeDark_Brown_400,
            R.style.ThemeDark_Brown_500,
            R.style.ThemeDark_Brown_600,
            R.style.ThemeDark_Brown_700,
            R.style.ThemeDark_Grey_200,
            R.style.ThemeDark_Grey_300,
            R.style.ThemeDark_Grey_400,
            R.style.ThemeDark_Grey_500,
            R.style.ThemeDark_Grey_600,
            R.style.ThemeDark_Grey_700,
            R.style.ThemeDark_BlueGrey_200,
            R.style.ThemeDark_BlueGrey_300,
            R.style.ThemeDark_BlueGrey_400,
            R.style.ThemeDark_BlueGrey_500,
            R.style.ThemeDark_BlueGrey_600,
            R.style.ThemeDark_BlueGrey_700
    )
}
