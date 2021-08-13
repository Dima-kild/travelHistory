package com.example.travelhistory.mapper;

import com.example.travelhistory.dto.NoteDto;
import com.example.travelhistory.entity.Note;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface NoteMapper {

    NoteDto toDto(Note note);

    @Mapping(target = "id", ignore = true)
    Note fromDto(NoteDto noteDto);

    @InheritConfiguration
    Note fillFromDto(NoteDto noteDto, @MappingTarget Note note);


}
