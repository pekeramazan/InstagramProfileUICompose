package com.ramazanpeker.instagramprofileuicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ramazanpeker.instagramprofileuicompose.profile.ProfileScreen
import com.ramazanpeker.instagramprofileuicompose.ui.theme.InstagramProfileUIComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramProfileUIComposeTheme {
                ProfileScreen()
            }
        }
    }
}

