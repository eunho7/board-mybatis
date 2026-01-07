package com.example.board.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("BoardDTO")
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private String createdAt;
}
