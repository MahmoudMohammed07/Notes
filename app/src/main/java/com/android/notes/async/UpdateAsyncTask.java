package com.android.notes.async;

import android.os.AsyncTask;

import com.android.notes.models.Note;
import com.android.notes.persistence.NoteDAO;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDAO mNoteDAO;

    public UpdateAsyncTask(NoteDAO dao) {
        mNoteDAO = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDAO.update(notes);
        return null;
    }
}
