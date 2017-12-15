package com.bimface.hack.holder;

import com.bimface.hack.bean.Problem;
import com.bimface.hack.bean.Reporter;
import com.bimface.hack.utils.IdGenerator;

import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProblemHolder {
    public final static CopyOnWriteArrayList problemList = new CopyOnWriteArrayList<Problem>();

    static {
        problemList.add(new Problem(IdGenerator.generateId(), "井盖移动", "在XX路和XX路之间井盖缺失，严重危及到路人的安全，请尽快处理",new Reporter("张三",18666668888L, "巡检员"), new Date()));
        problemList.add(new Problem(IdGenerator.generateId(), "水管爆裂", "在XX路和XX路之间水管爆裂，严重危及到车辆的安全，请尽快处理",new Reporter("李四",18666668887L, "巡检员"), new Date()));
        problemList.add(new Problem(IdGenerator.generateId(), "树枝清理", "在XX路和XX路之间树枝堆积，可能危及到路人和车辆安全，请尽快处理",new Reporter("王五",18666668886L, "巡检员"), new Date()));
    }
}
