package com.blognews.api.repository;

import com.blognews.api.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@SuppressWarnings("unused")
@Repository
public interface INoticeRepository extends JpaRepository<Notice, Long> {
    Optional<Notice> getById();
    // List<Notice> findByTitle(String title);
}
