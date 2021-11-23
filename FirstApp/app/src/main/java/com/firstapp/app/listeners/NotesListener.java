package com.firstapp.app.listeners;

        import com.firstapp.app.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}