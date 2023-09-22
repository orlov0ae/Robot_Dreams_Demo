package Lesson33.DTO;

import java.time.LocalDateTime;
import java.util.Objects;

public class DiaryDTO {
    private Integer id;
    private String name;
    private String author;
    private String description;
    private LocalDateTime creationTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        DiaryDTO diaryDTO = (DiaryDTO) object;
        return Objects.equals(id, diaryDTO.id) && Objects.equals(name, diaryDTO.name) && Objects.equals(author, diaryDTO.author) && Objects.equals(description, diaryDTO.description) && Objects.equals(creationTime, diaryDTO.creationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, description, creationTime);
    }

    @Override
    public String toString() {
        return "DiaryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }
}
