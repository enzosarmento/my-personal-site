package io.github.enzosarmento.mypersonalsite.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import io.github.enzosarmento.mypersonalsite.components.layouts.GameBoyLayout
import io.github.enzosarmento.mypersonalsite.components.sections.DisplaySection

@Page
@Composable
fun HomePage() {
    GameBoyLayout {
        Column {
            DisplaySection()
        }
    }
}
