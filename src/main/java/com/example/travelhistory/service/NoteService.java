package com.example.travelhistory.service;

import com.example.travelhistory.dto.NoteDto;

import java.util.List;

public interface NoteService {

    List<NoteDto> getAllNotes();

    NoteDto createNewNote(NoteDto noteDto);

    void deleteNote(Long id);

    NoteDto updateNote(Long id, NoteDto noteDto);


}
