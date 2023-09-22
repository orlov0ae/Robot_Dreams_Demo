package Lesson33.Service;

import Lesson33.DTO.DiaryDTO;

import java.util.List;

public interface DiaryService {

    DiaryDTO findById(Integer id);
    DiaryDTO save(DiaryDTO diaryDTO);
    DiaryDTO update(DiaryDTO diaryDTO);
    DiaryDTO delete(DiaryDTO diaryDTO);
    List<DiaryDTO> fingAll();
    DiaryDTO create(DiaryDTO diaryDTO);

}
