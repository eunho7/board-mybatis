package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.mapper.BoardMapper;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    // private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;

    public void save(BoardDTO boardDTO) {
        boardMapper.save(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardMapper.findAll();
    }
}
