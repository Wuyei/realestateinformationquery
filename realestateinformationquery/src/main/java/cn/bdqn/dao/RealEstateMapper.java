package cn.bdqn.dao;

import java.util.List;

import cn.bdqn.pojo.RealEstate;

/**
 * @author w
 * @date 2018-11-15
 */
public interface RealEstateMapper {

    /**
     * 获得所有Real estate表中数据
     * 
     * @return
     */
    List<RealEstate> getRealEstateList();
}
