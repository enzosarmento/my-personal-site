package io.github.enzosarmento.mypersonalsite.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.layout.Layout
import io.github.enzosarmento.mypersonalsite.components.layouts.GameBoyLayout
import io.github.enzosarmento.mypersonalsite.components.sections.ButtonsSection
import io.github.enzosarmento.mypersonalsite.components.sections.DisplaySection
import org.jetbrains.compose.web.css.cssRem


@Page
@Layout(".components.layouts.GameBoyLayout")
@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .padding(1.5.cssRem),
    ) {
        DisplaySection()
        ButtonsSection()
    }
}
