package io.github.enzosarmento.mypersonalsite.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.cssRem


@Composable
fun DisplaySection() {
    Column(
        modifier = Modifier.padding(2.5.cssRem),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        HeaderSection()
        AboutSection()
    }
}

