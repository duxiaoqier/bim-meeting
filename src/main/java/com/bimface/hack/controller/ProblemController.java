package com.bimface.hack.controller;

import com.bimface.hack.bean.GeneralResponse;
import com.bimface.hack.bean.Problem;
import com.bimface.hack.holder.ProblemHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProblemController {

    @GetMapping("problems")
    @ResponseBody
    GeneralResponse<List<Problem>> getProblems(){
        return new GeneralResponse<List<Problem>>(ProblemHolder.problemList);
    }
}
