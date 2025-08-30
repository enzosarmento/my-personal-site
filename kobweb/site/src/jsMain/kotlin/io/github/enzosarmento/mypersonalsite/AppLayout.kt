package io.github.enzosarmento.mypersonalsite

import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.TransitionTimingFunction
import com.varabyte.kobweb.compose.css.UserSelect
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.translate
import com.varabyte.kobweb.compose.ui.modifiers.userSelect
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.base
import com.varabyte.kobweb.silk.style.selectors.active
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val GAME_BOY_COLOR = Color.rgb(0xcec8c0)
val GAME_BOY_BORDER_COLOR = Color.rgb(0x545960)
val DISPLAY_COLOR = Color.rgb(0xe0f8cf)
val TEXT_COLOR = Color.rgb(0x332c50)
val ABOUT_BACK_COLOR = Color.rgb(0xF5F7FA)

val LineStyle = Modifier
    .backgroundColor(GAME_BOY_BORDER_COLOR)
    .position(Position.Absolute)

val ActivateButtonStyle = Modifier
    .transform { translate(2.px, 2.px) }
    .boxShadow(2.px, 2.px, 2.px, 3.px, Color.rgba(0, 0, 0, 0.6f), true)
    .border { color(Color.rgb(0x490f23)) }

val CVButtonStyle = CssStyle {
    base {
        Modifier
            .backgroundColor(Color.rgb(0xD95763))
            .color(Colors.White)
            .border(1.px, Solid, Color.rgb(0x00000))
            .borderRadius(8.px)
            .padding(topBottom = 8.px, leftRight = 16.px)
            .cursor(Cursor.Pointer)
            .fontFamily("GameBoy")
            .boxShadow(2.px,
                2.px,
                3.px,
                2.px,
                Color.rgba(0, 0, 0, 0.4f),
            )
            .transition(
                Transition.of("all",
                    0.07.s,
                    TransitionTimingFunction.EaseInOut
                )
            )
    }
    active {
        ActivateButtonStyle
    }
}

val GameBoyButtonsStyle = CssStyle.base {
    Modifier
        .position(Position.Relative)
        .width(8.cssRem)
        .height(6.cssRem)
        .backgroundColor(Color.rgb(0xd1d1d1))
        .borderRadius(80.percent)
        .border(1.px, Solid, Color.rgb(0xb0b0b0))
        .translate(
            tx = 14.cssRem,
            ty = 2.cssRem
        )
        .transform {
            rotateZ((-10).deg)
        }
}

val GameBoyButtonStyle = CssStyle {
    base {
        Modifier
            .position(Position.Absolute)
            .backgroundColor(Color.rgb(0xD95763))
            .size(3.125.cssRem)
            .borderRadius(50.percent)
            .color(Colors.White)
            .fontFamily("Helvetica", "sans-serif")
            .fontSize(24.px)
            .fontWeight(FontWeight.Bold)
            .textAlign(TextAlign.Center)
            .lineHeight(50.px)
            .border(3.px, Solid, Color.rgb(0x5a122b))
            .boxShadow(2.px,
                2.px,
                3.px,
                2.px,
                Color.rgba(0, 0, 0, 0.4f),
            )
            .cursor(Cursor.Pointer)
            .userSelect(UserSelect.None)
            .transition(
                Transition.of("all",
                    0.07.s,
                    TransitionTimingFunction.EaseInOut
                )
            )
    }
    active {
        ActivateButtonStyle
    }
}