package com.edu.festivalproject.model.service;

import com.edu.festivalproject.util.FestivalAPIManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class FestivalServiceImpl implements FestivalService{

    @Autowired
    private FestivalAPIManager festivalAPIManager;

    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public String getFestival() {
        return null;
    }

    @Override
    public String deleteFestival(int festival_idx) {
        return null;
    }

    @Override
    public String deleteFestival() {
        return null;
    }

    @Override
    public String updateFestival() {
        return null;
    }
}
