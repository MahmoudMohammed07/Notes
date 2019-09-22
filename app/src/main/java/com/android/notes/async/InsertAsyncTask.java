package com.android.notes.async;

import android.os.AsyncTask;

import com.android.notes.models.Note;
import com.android.notes.persistence.NoteDAO;

public class InsertAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDAO mNoteDAO;

    public InsertAsyncTask(NoteDAO dao) {
        mNoteDAO = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDAO.insertNotes(notes);
        return null;
    }
}
