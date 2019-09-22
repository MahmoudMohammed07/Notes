package com.android.notes.async;

import android.os.AsyncTask;

import com.android.notes.models.Note;
import com.android.notes.persistence.NoteDAO;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDAO mNoteDAO;

    public DeleteAsyncTask(NoteDAO dao) {
        mNoteDAO = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDAO.delete(notes);
        return null;
    }
}
