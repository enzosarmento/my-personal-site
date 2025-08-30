package io.github.enzosarmento.mypersonalsite.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.style.toModifier
import io.github.enzosarmento.mypersonalsite.GameBoyButtonStyle
import io.github.enzosarmento.mypersonalsite.GameBoyButtonsStyle
import org.jetbrains.compose.web.css.Position.Companion.Relative
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

@Composable
fun ButtonsSection() {
    Row {
        AAndBButton()
    }
}

@Composable
fun AAndBButton() {
    Row(
        modifier = GameBoyButtonsStyle.toModifier()
    ) {
        Button(
            modifier = GameBoyButtonStyle
                .toModifier()
                .top(2.cssRem)
                .left(0.5.cssRem)
            ,
            onClick = {  }
        ) {
            Text("B")
        }
        Button(
            modifier = GameBoyButtonStyle
                .toModifier()
                .top(0.7.cssRem)
                .left(4.3.cssRem)
            ,
            onClick = {  }
        ) {
            Text("A")
        }
    }
}