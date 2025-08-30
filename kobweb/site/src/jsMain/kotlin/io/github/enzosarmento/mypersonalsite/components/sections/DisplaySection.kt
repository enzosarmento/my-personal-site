package io.github.enzosarmento.mypersonalsite.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import io.github.enzosarmento.mypersonalsite.ABOUT_BACK_COLOR
import io.github.enzosarmento.mypersonalsite.DISPLAY_COLOR
import io.github.enzosarmento.mypersonalsite.GAME_BOY_BORDER_COLOR
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px


@Composable
fun DisplaySection() {
    Column(
        modifier = Modifier
            .backgroundColor(ABOUT_BACK_COLOR)
            .border(width = 2.cssRem, style = Solid, color = GAME_BOY_BORDER_COLOR)
            .borderRadius(topLeft = 15.px, topRight = 15.px, bottomLeft = 15.px, bottomRight = 60.px)
            .boxShadow(10.px,
                10.px,
                6.px,
                5.px,
                Color.rgba(0, 0, 0, 0.7f),
                true
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HeaderSection()
        AboutSection()
    }
}

