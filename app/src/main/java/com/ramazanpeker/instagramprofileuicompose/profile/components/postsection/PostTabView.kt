package com.ramazanpeker.instagramprofileuicompose.profile.components.postsection

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ramazanpeker.instagramprofileuicompose.profile.components.ImageWithTextModel

@Composable
fun PostTabView(
    modifier: Modifier = Modifier,
    onTabSelected: (selectedIndex: Int) -> Unit,
    imageWithTextModel: List<ImageWithTextModel>
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }

    val inactiveColor = Color(0xFF777777)
    TabRow(
        selectedTabIndex = selectedTabIndex,
        containerColor = Color.Transparent,
        contentColor = Color.Black,
        modifier = modifier

        ) {
        imageWithTextModel.forEachIndexed { index, item ->
            Tab(
                selected = selectedTabIndex == 0,
                selectedContentColor = Color.Black,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                }) {
                Icon(
                    painter = item.image,
                    contentDescription = item.text,
                    tint = if(selectedTabIndex == index) Color.Black else inactiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(20.dp)
                )

            }
        }

        
    }

}