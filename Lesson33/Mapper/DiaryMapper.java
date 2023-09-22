package Lesson33.Mapper;

import Lesson33.DTO.DiaryDTO;
import Lesson33.Model.Diary;

import java.util.List;
import java.util.stream.Collectors;

public class DiaryMapper {

    public DiaryDTO toDTO(Diary diary) {
        DiaryDTO diaryDTO = new DiaryDTO();
        diaryDTO.setId(diary.getId());
        diaryDTO.setName(diary.getName());
        diaryDTO.setAuthor(diary.getAuthor());
        diaryDTO.setDescription(diary.getDescription());
        diaryDTO.setCreationTime(diary.getCreationTime());

        return diaryDTO;
    }

    public Diary toEntity(DiaryDTO diaryDTO){
        Diary diary = new Diary();
        diary.setId(diaryDTO.getId());
        diary.setName(diaryDTO.getName());
        diary.setAuthor(diaryDTO.getAuthor());
        diary.setDescription(diaryDTO.getDescription());
        diary.setCreationTime(diaryDTO.getCreationTime());

        return diary;
    }

    public List<DiaryDTO> toDTOList(List<Diary> diaries) {
        return diaries.stream().map(
                this::toDTO
        ).collect(Collectors.toList());
    }

}
