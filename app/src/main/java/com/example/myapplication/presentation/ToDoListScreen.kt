package com.example.myapplication.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.myapplication.data.ToDo

@Composable
fun ToDoListScreen() {
    // Create a few sample todos
    val todos = listOf(
        ToDo(1, "Buy groceries", false),
        ToDo(2, "Walk the dog", true),
        ToDo(3, "Read a book", false)
    )

    // Display them in a LazyColumn
    LazyColumn {
        items(todos) { todo ->
            Row {
                Checkbox(checked = todo.completed, onCheckedChange =  { } )
                Text(text = todo.text)
            }
        }
    }
}