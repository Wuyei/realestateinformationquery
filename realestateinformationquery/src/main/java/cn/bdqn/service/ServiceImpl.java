package cn.bdqn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.bdqn.dao.RealEstateMapper;
import cn.bdqn.pojo.RealEstate;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    
    @Autowired
    private RealEstateMapper mapper;
    
    @Override
    public List<RealEstate> getRealEstateList() {
        return mapper.getRealEstateList();
    }

}
