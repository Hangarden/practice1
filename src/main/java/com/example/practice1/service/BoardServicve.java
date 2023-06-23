package com.example.practice1.service;

import com.example.practice1.mapper.BoardMapper;
import com.example.practice1.model.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardServicve {

    private final BoardMapper boardMapper;
    public int boardCount() {
        return boardMapper.boardCount();
    }

    public List<Board> boardList() {
        return boardMapper.findAll();
    }

    public Board findById(Integer boardId) {
        return boardMapper.findById(boardId);
    }

    @Transactional
    public Integer add(Board board) {
        boardMapper.save(board);
        return board.getBoardId();
    }

    public Integer update(Board board) {
        return boardMapper.update(board);
    }

    public Integer deleteById(Long boardId) {
        return boardMapper.delete(boardId);
    }
}
