package com.android.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.notes.models.Note;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        if (getIntent().hasExtra("selected_note")) {
            Note note = getIntent().getParcelableExtra("selected_note");
        }
    }
}
