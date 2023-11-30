package com.ramazanpeker.instagramprofileuicompose.profile.components.highlightsection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ramazanpeker.instagramprofileuicompose.profile.components.ImageWithTextModel
import com.ramazanpeker.instagramprofileuicompose.profile.components.RoundImage

@Composable
fun HighlightSection(
    modifier: Modifier = Modifier,
    highlightModel: List<ImageWithTextModel>
) {
    LazyRow(modifier = modifier) {
        items(highlightModel.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(5.dp)
            ) {
                RoundImage(
                    image = highlightModel[it].image,
                    modifier = Modifier.size(70.dp)
                )
                Text(
                    text = highlightModel[it].text,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                    )
            }
        }
    }

}