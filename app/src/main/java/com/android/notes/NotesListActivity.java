package com.android.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.notes.adapters.NotesRecyclerAdapter;
import com.android.notes.models.Note;

import java.util.ArrayList;

public class NotesListActivity extends AppCompatActivity {

    private static final String TAG = "NotesListActivity";

    // Ui components
    private RecyclerView mRecyclerView;

    // vars
    private ArrayList<Note> mNotes = new ArrayList<>();
    private NotesRecyclerAdapter mNotesRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_list);
        mRecyclerView = findViewById(R.id.recyclerView);

        initRecyclerView();
        fakeData();
    }

    private void fakeData() {
        for (int i = 0; i < 1000; i++) {
            Note note = new Note();
            note.setTitle("title # " + i);
            note.setContent("content #:" + i);
            note.setTimestamp("Sep 2019");
            mNotes.add(note);
        }
        mNotesRecyclerAdapter.notifyDataSetChanged();
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mNotesRecyclerAdapter = new NotesRecyclerAdapter(mNotes);
        mRecyclerView.setAdapter(mNotesRecyclerAdapter);
    }
}
