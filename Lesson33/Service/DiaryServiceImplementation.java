package Lesson33.Service;

import Lesson33.DTO.DiaryDTO;
import Lesson33.Mapper.DiaryMapper;
import Lesson33.Model.Diary;
import Lesson33.dao.DAO;
import Lesson33.dao.DAOImplementation;

import java.sql.SQLException;
import java.util.List;

public class DiaryServiceImplementation implements DiaryService{

    private final DAO dao;
    private final DiaryMapper diaryMapper;

    public DiaryServiceImplementation(DAO dao, DiaryMapper diaryMapper) throws SQLException {
        this.dao = new DAOImplementation();
        this.diaryMapper = new DiaryMapper();
    }

    @Override
    public DiaryDTO findById(Integer id) {
        return diaryMapper.toDTO(dao.findById(id));
    }

    @Override
    public DiaryDTO save(DiaryDTO diaryDTO) {
        return diaryMapper.toDTO(dao.save(diaryMapper.toEntity(diaryDTO)));
    }

    @Override
    public DiaryDTO update(DiaryDTO diaryDTO) {
        return diaryMapper.toDTO(dao.update(diaryMapper.toEntity(diaryDTO)));
    }

    @Override
    public DiaryDTO delete(DiaryDTO diaryDTO) {
        return diaryMapper.toDTO(dao.delete(diaryMapper.toEntity(diaryDTO)));
    }

    @Override
    public List<DiaryDTO> fingAll() {
        return diaryMapper.toDTOList(dao.findAll());
    }

    @Override
    public DiaryDTO create(DiaryDTO diaryDTO) {
        Diary diary = dao.save(diaryMapper.toEntity(diaryDTO));
        return new DiaryDTO();
    }
}
