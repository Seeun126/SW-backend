package com.swengineer.sportsmatch.controller;

import com.swengineer.sportsmatch.dto.BoardDTO;
import com.swengineer.sportsmatch.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/member")
    public String member_findAll(){
        return "member";
    }

    @GetMapping("/member/write")
    public String member_writeForm(){
        return "member_write";
    }

    @PostMapping("/member/write")
    public String member_write(@ModelAttribute BoardDTO boardDTO) {
        boardDTO.setPost_type("member");
        boardService.save(boardDTO);
        return "member";
    }

    @GetMapping("/team")
    public String team_findAll(){
        return "team";
    }

    @GetMapping("/team/write")
    public String team_writeForm(){
        return "team_write";
    }

    @PostMapping("/team/write")
    public String team_write(@ModelAttribute BoardDTO boardDTO) {
        boardDTO.setPost_type("team");
        boardService.save(boardDTO);
        return "team";
    }

}
