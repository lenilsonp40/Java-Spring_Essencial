package com.ead.course.Repository;

import com.ead.course.models.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LessonRepository extends JpaRepository<LessonModel, UUID> {
}
