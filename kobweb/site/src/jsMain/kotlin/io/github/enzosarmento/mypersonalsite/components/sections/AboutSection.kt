package io.github.enzosarmento.mypersonalsite.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.style.toModifier
import io.github.enzosarmento.mypersonalsite.ABOUT_BACK_COLOR
import io.github.enzosarmento.mypersonalsite.CVButtonStyle
import io.github.enzosarmento.mypersonalsite.TEXT_COLOR
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(ABOUT_BACK_COLOR)
            .fontFamily("GameBoy")
            .padding(left = 1.cssRem, right = 1.cssRem, bottom = 1.cssRem)
            .borderRadius(bottomRight = 60.px),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier
                .margin(bottom = 1.cssRem)
                .color(TEXT_COLOR),
            horizontalAlignment = Alignment.Start
        ) {
            H5 {
                Text("About Me")
            }
            Box(
                modifier = Modifier
                    .fontFamily("Eightbit")
                    .lineHeight(1.5.cssRem)
                    .textAlign(TextAlign.Justify)
            ) {
                Text("I'm a developer, I love to code and I'm always looking for new challenges to learn and improve my skills.")
            }
        }
        Button(
            modifier = CVButtonStyle.toModifier(),
            onClick = { println("Download CV") },
        ) {
            Text("DOWNLOAD CV")
        }
    }
}