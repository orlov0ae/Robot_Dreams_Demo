package Lesson33.dao;

import Lesson33.Model.Diary;

import java.util.List;

public interface DAO {

    Diary findById(Integer id);
    Diary update(Diary diary);
    Diary save(Diary diary);
    Diary delete(Diary diary);
    List<Diary> findAll();

}
