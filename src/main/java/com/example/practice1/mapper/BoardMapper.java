package com.example.practice1.mapper;
import com.example.practice1.model.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface BoardMapper{

    int boardCount();

    List<Board> findAll();

    Board findById(Integer boardId);

    void save(Board board);

    Integer update(Board board);

    Integer delete(Long boardId);
}