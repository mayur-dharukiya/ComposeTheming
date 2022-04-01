package com.codelab.theming.ui.start

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codelab.theming.ui.start.theme.*


@Composable
fun JetNewsTheme(content: @Composable ()-> Unit)
{

  MaterialTheme(
  content=content,
  colors=LightColors)

}

private val LightColors= lightColors(

 primary= Red700,
 primaryVariant = Red900,
 onPrimary = Color.White,
 secondary = Red700,
 secondaryVariant = Red900,
 onSecondary = Color.White,
 error = Red800

)

private val JetNewsTypography= Typography(


    h4= TextStyle(
        fontFamily=Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
        ),

    h5= TextStyle(fontFamily=Montserrat,
    fontWeight = FontWeight.W600,
    fontSize = 25.sp
),
    h6= TextStyle(
        fontFamily=Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),

    subtitle1= TextStyle(
        fontFamily=Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),

    subtitle2= TextStyle(
        fontFamily=Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 14.sp
    ),

    body1= TextStyle(
        fontFamily=Domine,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    body2= TextStyle(
        fontFamily= Montserrat,
        fontSize = 14.sp
    ),

    button= TextStyle(
        fontFamily=Montserrat,
        fontWeight=FontWeight.Normal,
        fontSize = 12.sp
    ),

    caption= TextStyle(
        fontFamily=Montserrat,
        fontWeight=FontWeight.Normal,
        fontSize = 12.sp
    ),

    overline= TextStyle(
        fontFamily=Montserrat,
        fontWeight=FontWeight.W500,
        fontSize = 12.sp
    ),



)


