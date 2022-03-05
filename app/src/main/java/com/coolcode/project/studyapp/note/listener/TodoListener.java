package com.coolcode.project.studyapp.note.listener;


import com.coolcode.project.studyapp.note.entities.Todo;

public interface TodoListener {
    void onTodoClicked(Todo todo, int position);
}