package com.lidan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import java.util.Date;
import com.lidan.sudoku;

@Controller
public class SudokuController {

    private sudoku SdkGamge;

    private String message = "终局数独生成器";

    @RequestMapping("/sudoku")
    public String welcome(ModelMap model) {
        SdkGamge = new sudoku();
        SdkGamge.gensudoku();
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("sudoku",SdkGamge.finall);
        return "sudoku";
    }
}
