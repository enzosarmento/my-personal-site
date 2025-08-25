package io.github.enzosarmento.mypersonalsite.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import io.github.enzosarmento.mypersonalsite.DISPLAY_COLOR
import io.github.enzosarmento.mypersonalsite.GAME_BOY_COLOR
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutSection() {
    Column(
        modifier = Modifier
            .backgroundColor(GAME_BOY_COLOR)
            .fontFamily("GameBoy")
            .padding(1.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier.margin(bottom = 1.cssRem),
            horizontalAlignment = Alignment.Start
        ) {
            H5 {
                Text("About Me")
            }
            Box(
                modifier = Modifier
                    .fontFamily("Eightbit").lineHeight(1.5.cssRem)
            ) {
                Text("I'm a developer, I love to code and I'm always looking for new challenges to learn and improve my skills.")
            }
        }
        Button {
            Text("DOWNLOAD CV")
        }
    }
}