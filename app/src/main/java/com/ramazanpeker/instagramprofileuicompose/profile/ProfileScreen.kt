package com.ramazanpeker.instagramprofileuicompose.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ramazanpeker.instagramprofileuicompose.R
import com.ramazanpeker.instagramprofileuicompose.profile.components.ProfileSection
import com.ramazanpeker.instagramprofileuicompose.profile.components.TopBar
import com.ramazanpeker.instagramprofileuicompose.profile.components.buttonsection.ButtonSection
import com.ramazanpeker.instagramprofileuicompose.profile.components.highlightsection.HighlightSection
import com.ramazanpeker.instagramprofileuicompose.profile.components.highlightsection.StoryHighlightModel

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            name = "pekeramazan",
            modifier = Modifier.padding(top = 30.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection(
            highlightModel = listOf(
                StoryHighlightModel(
                    image = painterResource(id = R.drawable.concert),
                    text = "Concert"
                ),
                StoryHighlightModel(
                    image = painterResource(id = R.drawable.holiday),
                    text = "Holiday"
                ),
                StoryHighlightModel(
                    image = painterResource(id = R.drawable.engineering),
                    text = "Engineering"
                ),
                StoryHighlightModel(
                    image = painterResource(id = R.drawable.software),
                    text = "Software"
                ),
                StoryHighlightModel(
                    image = painterResource(id = R.drawable.food),
                    text = "Food"
                )
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )

    }
}
