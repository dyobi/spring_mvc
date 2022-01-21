package com.emp.sawon.service;

import com.emp.sawon.dao.SawonDao;
import com.emp.sawon.vo.SawonVo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("sawonService")
public class SawonServiceImpl implements SawonService {

    @Setter(onMethod = @__({@Autowired}))
    private SawonDao sawonDao;

    @Override
    @Transactional
    public ArrayList<SawonVo> getAllSawon() {
        return sawonDao.getAllSawon();
    }

}
