package com.qg.www.controllers;

import com.qg.www.models.AwardInfo;
import com.qg.www.models.DataPack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author net
 * @version 2.0
 * 奖项管理控制类
 */
@Controller
@CrossOrigin
@RequestMapping("/infomaneger")
public class InfoManegerController {

    @PostMapping("/addaward")
    public DataPack addAward(@RequestParam("awardInfo") AwardInfo awardInfo, @RequestParam("userid") int userId){
        System.out.println(awardInfo.getName());
        System.out.println(userId);
        return null;
    }
}
