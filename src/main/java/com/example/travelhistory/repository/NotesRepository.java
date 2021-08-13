package com.example.travelhistory.repository;

import com.example.travelhistory.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note, Long> {


}
