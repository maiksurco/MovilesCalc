package com.example.navegacionjpc.ui.theme

import android.app.Activity
import android.os.Build
import android.view.WindowInsets.Side
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

public val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)


public val lightRedScheme = lightColorScheme(
    primary = r_primaryLight,
    onPrimary = r_onPrimaryLight,
    primaryContainer = r_primaryContainerLight,
    onPrimaryContainer = r_onPrimaryContainerLight,
    secondary = r_secondaryLight,
    onSecondary = r_onSecondaryLight,
    secondaryContainer = r_secondaryContainerLight,
    onSecondaryContainer = r_onSecondaryContainerLight,
    tertiary = r_tertiaryLight,
    onTertiary = r_onTertiaryLight,
    tertiaryContainer = r_tertiaryContainerLight,
    onTertiaryContainer = r_onTertiaryContainerLight,
    error = r_errorLight,
    onError = r_onErrorLight,
    errorContainer = r_errorContainerLight,
    onErrorContainer = r_onErrorContainerLight,
    background = r_backgroundLight,
    onBackground = r_onBackgroundLight,
    surface = r_surfaceLight,
    onSurface = r_onSurfaceLight,
    surfaceVariant = r_surfaceVariantLight,
    onSurfaceVariant = r_onSurfaceVariantLight,
    outline = r_outlineLight,
    outlineVariant = r_outlineVariantLight,
    scrim = r_scrimLight,
    inverseSurface = r_inverseSurfaceLight,
    inverseOnSurface = r_inverseOnSurfaceLight,
    inversePrimary = r_inversePrimaryLight,
    surfaceDim = r_surfaceDimLight,
    surfaceBright = r_surfaceBrightLight,
    surfaceContainerLowest = r_surfaceContainerLowestLight,
    surfaceContainerLow = r_surfaceContainerLowLight,
    surfaceContainer = r_surfaceContainerLight,
    surfaceContainerHigh = r_surfaceContainerHighLight,
    surfaceContainerHighest = r_surfaceContainerHighestLight,
)

public val darkRedScheme = darkColorScheme(
    primary = r_primaryDark,
    onPrimary = r_onPrimaryDark,
    primaryContainer = r_primaryContainerDark,
    onPrimaryContainer = r_onPrimaryContainerDark,
    secondary = r_secondaryDark,
    onSecondary = r_onSecondaryDark,
    secondaryContainer = r_secondaryContainerDark,
    onSecondaryContainer = r_onSecondaryContainerDark,
    tertiary = r_tertiaryDark,
    onTertiary = r_onTertiaryDark,
    tertiaryContainer = r_tertiaryContainerDark,
    onTertiaryContainer = r_onTertiaryContainerDark,
    error = r_errorDark,
    onError = r_onErrorDark,
    errorContainer = r_errorContainerDark,
    onErrorContainer = r_onErrorContainerDark,
    background = r_backgroundDark,
    onBackground = r_onBackgroundDark,
    surface = r_surfaceDark,
    onSurface = r_onSurfaceDark,
    surfaceVariant = r_surfaceVariantDark,
    onSurfaceVariant = r_onSurfaceVariantDark,
    outline = r_outlineDark,
    outlineVariant = r_outlineVariantDark,
    scrim = r_scrimDark,
    inverseSurface = r_inverseSurfaceDark,
    inverseOnSurface = r_inverseOnSurfaceDark,
    inversePrimary = r_inversePrimaryDark,
    surfaceDim = r_surfaceDimDark,
    surfaceBright = r_surfaceBrightDark,
    surfaceContainerLowest = r_surfaceContainerLowestDark,
    surfaceContainerLow = r_surfaceContainerLowDark,
    surfaceContainer = r_surfaceContainerDark,
    surfaceContainerHigh = r_surfaceContainerHighDark,
    surfaceContainerHighest = r_surfaceContainerHighestDark,
)




public val lightGreenScheme = lightColorScheme(
    primary = g_primaryLight,
    onPrimary = g_onPrimaryLight,
    primaryContainer = g_primaryContainerLight,
    onPrimaryContainer = g_onPrimaryContainerLight,
    secondary = g_secondaryLight,
    onSecondary = g_onSecondaryLight,
    secondaryContainer = g_secondaryContainerLight,
    onSecondaryContainer = g_onSecondaryContainerLight,
    tertiary = g_tertiaryLight,
    onTertiary = g_onTertiaryLight,
    tertiaryContainer = g_tertiaryContainerLight,
    onTertiaryContainer = g_onTertiaryContainerLight,
    error = g_errorLight,
    onError = g_onErrorLight,
    errorContainer = g_errorContainerLight,
    onErrorContainer = g_onErrorContainerLight,
    background = g_backgroundLight,
    onBackground = g_onBackgroundLight,
    surface = g_surfaceLight,
    onSurface = g_onSurfaceLight,
    surfaceVariant = g_surfaceVariantLight,
    onSurfaceVariant = g_onSurfaceVariantLight,
    outline = g_outlineLight,
    outlineVariant = g_outlineVariantLight,
    scrim = g_scrimLight,
    inverseSurface = g_inverseSurfaceLight,
    inverseOnSurface = g_inverseOnSurfaceLight,
    inversePrimary = g_inversePrimaryLight,
    surfaceDim = g_surfaceDimLight,
    surfaceBright = g_surfaceBrightLight,
    surfaceContainerLowest = g_surfaceContainerLowestLight,
    surfaceContainerLow = g_surfaceContainerLowLight,
    surfaceContainer = g_surfaceContainerLight,
    surfaceContainerHigh = g_surfaceContainerHighLight,
    surfaceContainerHighest = g_surfaceContainerHighestLight,
)

public val darkGreenScheme = darkColorScheme(
    primary = g_primaryDark,
    onPrimary = g_onPrimaryDark,
    primaryContainer = g_primaryContainerDark,
    onPrimaryContainer = g_onPrimaryContainerDark,
    secondary = g_secondaryDark,
    onSecondary = g_onSecondaryDark,
    secondaryContainer = g_secondaryContainerDark,
    onSecondaryContainer = g_onSecondaryContainerDark,
    tertiary = g_tertiaryDark,
    onTertiary = g_onTertiaryDark,
    tertiaryContainer = g_tertiaryContainerDark,
    onTertiaryContainer = g_onTertiaryContainerDark,
    error = g_errorDark,
    onError = g_onErrorDark,
    errorContainer = g_errorContainerDark,
    onErrorContainer = g_onErrorContainerDark,
    background = g_backgroundDark,
    onBackground = g_onBackgroundDark,
    surface = g_surfaceDark,
    onSurface = g_onSurfaceDark,
    surfaceVariant = g_surfaceVariantDark,
    onSurfaceVariant = g_onSurfaceVariantDark,
    outline = g_outlineDark,
    outlineVariant = g_outlineVariantDark,
    scrim = g_scrimDark,
    inverseSurface = g_inverseSurfaceDark,
    inverseOnSurface = g_inverseOnSurfaceDark,
    inversePrimary = g_inversePrimaryDark,
    surfaceDim = g_surfaceDimDark,
    surfaceBright = g_surfaceBrightDark,
    surfaceContainerLowest = g_surfaceContainerLowestDark,
    surfaceContainerLow = g_surfaceContainerLowDark,
    surfaceContainer = g_surfaceContainerDark,
    surfaceContainerHigh = g_surfaceContainerHighDark,
    surfaceContainerHighest = g_surfaceContainerHighestDark,
)

enum class ThemeType{RED, GREEN}


@Composable
fun NavegacionJPCTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    colorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    /*val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }*/
    val view = LocalView.current
    if (!view.isInEditMode){
        SideEffect {
            val window = (view.context as Activity). window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}