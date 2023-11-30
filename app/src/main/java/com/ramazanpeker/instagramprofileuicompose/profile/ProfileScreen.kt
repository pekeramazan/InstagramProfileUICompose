package com.ramazanpeker.instagramprofileuicompose.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ramazanpeker.instagramprofileuicompose.R
import com.ramazanpeker.instagramprofileuicompose.profile.components.ProfileSection
import com.ramazanpeker.instagramprofileuicompose.profile.components.TopBar
import com.ramazanpeker.instagramprofileuicompose.profile.components.buttonsection.ButtonSection
import com.ramazanpeker.instagramprofileuicompose.profile.components.highlightsection.HighlightSection
import com.ramazanpeker.instagramprofileuicompose.profile.components.ImageWithTextModel
import com.ramazanpeker.instagramprofileuicompose.profile.components.postsection.PostTabView
import com.ramazanpeker.instagramprofileuicompose.profile.components.postsection.Posts

@Composable
fun ProfileScreen() {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
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
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.concert),
                    text = "Concert"
                ),
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.holiday),
                    text = "Holiday"
                ),
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.engineering),
                    text = "Engineering"
                ),
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.software),
                    text = "Software"
                ),
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.food),
                    text = "Food"
                )
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        PostTabView(
            onTabSelected = {
                selectedTabIndex = it
            }, imageWithTextModel = listOf(
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.ic_grid),
                    text = "Posts"
                ),
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.ic_reels),
                    text = "Reels"
                ),
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.ic_igtv),
                    text = "IGTV"
                ),
                ImageWithTextModel(
                    image = painterResource(id = R.drawable.ic_profilebox),
                    text = "Profile"
                )
            )
        )
        when (selectedTabIndex) {
            0 -> Posts(
                posts = listOf(
                    painterResource(id = R.drawable.post1),
                    painterResource(id = R.drawable.post2),
                    painterResource(id = R.drawable.post3),
                    painterResource(id = R.drawable.post4),
                    painterResource(id = R.drawable.post5),
                    painterResource(id = R.drawable.post6)
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }


    }
}
