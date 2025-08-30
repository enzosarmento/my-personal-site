package io.github.enzosarmento.mypersonalsite.components.layouts

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.right
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.layout.Layout
import io.github.enzosarmento.mypersonalsite.GAME_BOY_COLOR
import io.github.enzosarmento.mypersonalsite.LineStyle
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Layout
@Composable
fun GameBoyLayout(content: @Composable () -> Unit) {
    GameBoyLines()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundColor(GAME_BOY_COLOR),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}

@Composable
fun GameBoyLines() {
    Box(
        modifier = LineStyle
            .width(6.px)
            .height(10.px)
            .left(5.percent)
    )
    Box(
        modifier = LineStyle
            .width(6.px)
            .height(10.px)
            .right(5.percent)
    )
    Box(
        modifier = LineStyle
            .fillMaxWidth()
            .height(6.px)
            .margin(top = 10.px)
    )
}