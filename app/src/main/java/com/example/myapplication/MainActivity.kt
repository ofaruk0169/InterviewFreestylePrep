package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // TODO: Build your TodoList app here
                // Requirements will be given during interview
            }
        }
    }
}

/**
 * Interview Task: TodoList Application
 * Time: 45 minutes
 *
 * Requirements:
 * 1. Display list of todos
 * 2. Add new todos
 * 3. Mark todos complete/incomplete
 * 4. Delete todos
 *
 * Bonus: Filter by status, edit todos
 */