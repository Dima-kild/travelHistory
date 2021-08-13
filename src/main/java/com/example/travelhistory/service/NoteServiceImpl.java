package com.example.travelhistory.service;

import com.example.travelhistory.api.WeatherApiClient;
import com.example.travelhistory.dto.NoteDto;
import com.example.travelhistory.entity.Note;
import com.example.travelhistory.mapper.NoteMapper;
import com.example.travelhistory.repository.NotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor

public class NoteServiceImpl implements NoteService {


    private final NotesRepository notesRepository;
    private final NoteMapper noteMapper;
    private final WeatherApiClient weatherApiClient;

    @Override
    public List<NoteDto> getAllNotes() {
        return notesRepository.findAll().stream().map(noteMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public NoteDto createNewNote(NoteDto noteDto) {
        String temperature = weatherApiClient.getTemperature(noteDto.getCountryName());
        Note note = noteMapper.fromDto(noteDto);
        note.setCurrentWeather(temperature);
        return noteMapper.toDto(notesRepository.save(note));
    }

    @Override
    public void deleteNote(Long id) {
        Note note = notesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Note not found"));
        notesRepository.delete(note);

    }

    @Override
    public NoteDto updateNote(Long id, NoteDto noteDto) {
        String temperature = weatherApiClient.getTemperature(noteDto.getCountryName());
        noteDto.setCurrentWeather(temperature);
        return notesRepository.findById(id)
                .map((note) -> noteMapper.fillFromDto(noteDto, note))
                .map(noteMapper::toDto)
                .orElseThrow(() -> new RuntimeException("note not found"));
    }


}
