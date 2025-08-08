package com.example.myapplication.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.myapplication.data.ToDo

@Composable
fun ToDoListScreen() {
    // Create a few sample todos

    var todos by remember { mutableStateOf(listOf(
        ToDo(1, "Buy groceries", false),
        ToDo(2, "Walk the dog", true),
        ToDo(3, "Read a book", false)
    )) }


    Column {

        // Display them in a LazyColumn
        LazyColumn {
            items(todos) { todo ->
                Row {
                    Checkbox(checked = todo.completed, onCheckedChange =  { isChecked ->
                        todos = todos.map {
                            if (it.id == todo.id) it.copy(completed = isChecked )
                            else it
                        }
                    } )
                    Text(text = todo.text)
                }
            }

        }

        var inputText by remember { mutableStateOf("") }

        TextField(
            value = inputText,
            onValueChange = { inputText = it } // what to do when user types
        )
        Button(
            onClick = {

            }
        ) {
            Text("Add todo")
        }

    }





}