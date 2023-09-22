package Lesson33.Constants;

public enum Queries {

    DIARY_INSERT("INSERT INTO diary (name, author, description, LocalDateTime creationTime) VALUES (?, ?, ?, ?)"),
    DIARY_UPDATE("UPDATE diary SET name = ?, author = ?, description = ?, creationTime=? WHERE id = ?"),
    DIARY_DELETE("DELETE FROM diary WHERE id = ?"),
    DIARY_FIND_BY_ID("SELECT d.id, d.name, d.author, d.description, d.creationTime " +
            "FROM diary d " +
            "WHERE d.id = ?"),
    DIARY_FIND_ALL("SELECT d.id as diary_id, d.name as diary_name, d.author, d.description, d.creationTime " +
            "FROM diary d ")
    ;

    private final String name;

    Queries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
