package com.example.practice1.controller;

import com.example.practice1.model.Board;
import com.example.practice1.service.BoardServicve;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardServicve boardServicve;

    @GetMapping("/hello")
    public String Hello() {
        return "/board/hello";
    }

    @GetMapping("/test")
    public String boardList(Model model) {
        model.addAttribute("cnt", boardServicve.boardCount());
        model.addAttribute("test", boardServicve.boardList());

        return "/board/hello";
    }

    @GetMapping("/{boardId}")
    public String boardDetail(@PathVariable Integer boardId , Model model) {
        model.addAttribute("board", boardServicve.findById(boardId));

        return "/board/board";
    }

    @GetMapping("/add")
    public String addPost() {

        return "/board/addpost";
    }

    @PostMapping("/add")
    public String posting(@RequestParam Board board) {
//        model.addAttribute("board", boardServicve.findById(boardId));

        return "/board/board";
    }


    @GetMapping
    public String main(Model model) {
        model.addAttribute("boards", boardServicve.boardList());

        return "/board/boards";
    }



}
