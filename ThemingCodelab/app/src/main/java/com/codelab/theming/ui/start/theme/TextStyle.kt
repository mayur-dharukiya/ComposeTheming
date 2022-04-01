package com.codelab.theming.ui.start.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.window.SecureFlagPolicy

data class TextStyle(
    val color: Color ? = null,
    val fontSize: TextUnit? = null,
    val fontWeight: FontWeight? = null,
    val fontStyle: FontStyle? = null,
    val fontFamily: FontFamily? = null,
    val letterSpacing: TextUnit? = null,
    val background: Color? = null,
    val textAlign: TextAlign? = null,
    val textDirection: TextDirection? = null,
    val lineHeight: TextUnit? = null,

    )
