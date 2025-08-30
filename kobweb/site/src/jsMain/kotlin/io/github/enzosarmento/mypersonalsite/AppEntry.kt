package io.github.enzosarmento.mypersonalsite

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.px

@InitSilk
fun initStyles(ctx: InitSilkContext) {
    ctx.stylesheet.registerStyleBase("html, body") { Modifier.fillMaxHeight() }
}

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().fillMaxHeight()) {
            content()
        }
    }
}
