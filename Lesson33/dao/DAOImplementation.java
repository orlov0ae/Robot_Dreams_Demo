package Lesson33.dao;

import Lesson32.Creation.DbConnection;
import Lesson33.Constants.Queries;
import Lesson33.Model.Diary;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DAOImplementation implements DAO{

    private final Connection connection;

    public DAOImplementation() throws SQLException {
        this.connection = DbConnection.getInstance().getConnection();
    }

    @Override
    public Diary findById(Integer id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DIARY_FIND_BY_ID.getName())) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Diary diary = new Diary();
                diary.setId(resultSet.getInt("id"));
                diary.setName(resultSet.getString("name"));
                diary.setAuthor(resultSet.getString("author"));
                diary.setDescription(resultSet.getString("description"));
                diary.setCreationTime(LocalDateTime.parse(resultSet.getString("creationTime")));
                return diary;
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Diary update(Diary diary) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DIARY_UPDATE.getName())) {
            preparedStatement.setString(1, diary.getName());
            preparedStatement.setString(2, diary.getAuthor());
            preparedStatement.setString(3, diary.getDescription());
            preparedStatement.setString(4, String.valueOf(diary.getCreationTime()));
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Diary save(Diary diary) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DIARY_INSERT.getName())) {
            preparedStatement.setString(1, diary.getName());
            preparedStatement.setString(2, diary.getAuthor());
            preparedStatement.setString(3, diary.getDescription());
            preparedStatement.setString(4, String.valueOf(diary.getCreationTime()));
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Diary delete(Diary diary) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DIARY_DELETE.getName())) {
            preparedStatement.setInt(1, diary.getId());
            preparedStatement.executeUpdate();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Diary> findAll() {
        List<Diary> diaries = new ArrayList<>();
        try (Statement statement = connection.createStatement();

             ResultSet resultSet = statement.executeQuery(Queries.DIARY_FIND_ALL.getName())) {

            while (resultSet.next()) {
                Diary diary = new Diary();
                diary.setId(resultSet.getInt("id"));
                diary.setName(resultSet.getString("name"));
                diary.setAuthor(resultSet.getString("author"));
                diary.setDescription(resultSet.getString("description"));
                diary.setCreationTime(LocalDateTime.parse(resultSet.getString("creationTime")));
                diaries.add(diary);
            }
        }catch (SQLException e){
            throw new RuntimeException();
        }

        return diaries;
    }

}
