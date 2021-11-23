package com.firstapp.app.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.firstapp.app.dao.NoteDao;
import com.firstapp.app.entities.Note;

@Database(entities = Note.class, version = 1, exportSchema = false)

public abstract class NotesDataBase extends RoomDatabase {

    private static NotesDataBase notesDatabase;

    public static synchronized NotesDataBase getNotesDatabase(Context context) {
        if (notesDatabase == null) {
            notesDatabase = Room.databaseBuilder(
                    context,
                    NotesDataBase.class,
                    "notes_db"
            ).build();
        }
        return notesDatabase;
    }

    public abstract NoteDao noteDao();
}
