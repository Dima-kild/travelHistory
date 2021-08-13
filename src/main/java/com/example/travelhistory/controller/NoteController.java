package com.example.travelhistory.controller;

import com.example.travelhistory.dto.NoteDto;
import com.example.travelhistory.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/notes",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.ALL_VALUE)
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @GetMapping
    public List<NoteDto> getAllNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping
    public NoteDto createNewNote(@RequestBody NoteDto noteDto) {
        return noteService.createNewNote(noteDto);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable("id") Long id) {
        noteService.deleteNote(id);
    }

    @PutMapping("/{id}")
    public NoteDto updateNote(@PathVariable("id") Long id, @RequestBody NoteDto noteDto) {
        return noteService.updateNote(id, noteDto);
    }
}
