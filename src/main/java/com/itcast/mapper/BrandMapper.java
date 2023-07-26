package com.itcast.mapper;


import com.itcast.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {


    /**
     * 查询所有
     */
    List<Brand> selectAll();

    /**
     * 查询id
     */
    Brand selectById(int id);

    /**
     * 条件动态查询
     */
    List<Brand> selectByCondition(@Param("status") int status, @Param("brandName") String brandName, @Param("companyName") String companyName);

//    List<Brand> selectByCondition(Brand brand);

    /**
     * 单条件动态查询
     */
    List<Brand> selectByConditionSingle(Brand brand);

    void addBrand(Brand brand);

    void updateBrand(Brand brand);

    void deleteBrands(@Param("ids") int[] ids);

}
