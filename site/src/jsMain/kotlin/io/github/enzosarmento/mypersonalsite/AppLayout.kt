package io.github.enzosarmento.mypersonalsite

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px

val GAME_BOY_COLOR = Color.rgb(0xcec8c0)
val GAME_BOY_BORDER_COLOR = Color.rgb(0x545960)
val DISPLAY_COLOR = Color.rgb(0xe0f8cf)
val TEXT_COLOR = Color.rgb(0x332c50)
val ABOUT_BACK_COLOR = Color.rgb(0xF5F7FA)

val LineStyle = Modifier
    .backgroundColor(GAME_BOY_BORDER_COLOR)
    .position(Position.Absolute)

val ButtonStyle = CssStyle.base {
    Modifier.border { width(1.px) }.color(DISPLAY_COLOR)
}