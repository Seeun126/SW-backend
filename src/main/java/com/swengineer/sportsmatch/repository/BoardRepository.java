package com.swengineer.sportsmatch.repository;

import com.swengineer.sportsmatch.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
