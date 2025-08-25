package io.github.enzosarmento.mypersonalsite.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.graphics.Image
import io.github.enzosarmento.mypersonalsite.DISPLAY_COLOR
import io.github.enzosarmento.mypersonalsite.TEXT_COLOR
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.marginLeft
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun HeaderSection() {
    Row(
        Modifier
            .fillMaxSize()
            .backgroundColor(DISPLAY_COLOR)
            .padding(
                left = 1.cssRem,
                right = 1.cssRem
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Image(
            src = "assets/images/enzo-avatar.png",
            description = "Enzo Avatar",
            modifier = Modifier.size(35.percent)
        )

        P(
            attrs = {
                style {
                    color(TEXT_COLOR)
                    marginLeft(1.2.cssRem)
                    fontSize(0.8.cssRem)
                }
            }
        ) {
            Box(
                modifier = Modifier
                    .fontFamily("GameBoy")
            ) {
                Text("ENZO SARMENTO")
            }
            Br()
            Box(
                modifier = Modifier.fontFamily("Eightbit")
            ) {
                Text("I'm a developer")
            }
        }
    }
}