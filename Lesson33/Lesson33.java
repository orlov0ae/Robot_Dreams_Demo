package Lesson33;

import Lesson33.DbInit.DbCreate;
import Lesson33.Mapper.DiaryMapper;
import Lesson33.Model.Diary;
import Lesson33.Service.DiaryService;
import Lesson33.Service.DiaryServiceImplementation;
import Lesson33.dao.DAO;
import Lesson33.dao.DAOImplementation;

import java.sql.SQLException;
import java.time.LocalDateTime;

public class Lesson33 {

    public static void main(String[] args) {

        DbCreate dbCreate = new DbCreate();
        dbCreate.createAndInsertDatabase(true);

        try {
            Diary diary1 = new Diary();
            diary1.setName("Note 1");
            diary1.setAuthor("Alex");
            diary1.setDescription("Note 1 description");
            diary1.setCreationTime(LocalDateTime.now());

            Diary diary2 = new Diary();
            diary2.setName("Note 2");
            diary2.setAuthor("Alex");
            diary2.setDescription("Note  description");
            diary2.setCreationTime(LocalDateTime.now());

            DAO dao = new DAOImplementation();
            dao.save(diary1);
            dao.save(diary2);

            DiaryMapper diaryMapper = new DiaryMapper();

            DiaryService diaryService = new DiaryServiceImplementation(dao, diaryMapper);
            diaryService.findById(1);
            diaryService.fingAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
