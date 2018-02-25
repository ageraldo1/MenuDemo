package com.itktechnologies.menudemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class NoteEditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_editor);

        EditText note = (EditText) findViewById(R.id.notes);

        Intent intent = getIntent();

        int noteId = intent.getIntExtra("noteId", -1);

        if ( noteId != -1) {
            note.setText(MainActivity.notes.get(noteId));
        }

    }
}
