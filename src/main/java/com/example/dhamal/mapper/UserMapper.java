package com.example.dhamal.mapper;

import com.example.dhamal.pojo.ProductListPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from users where id = #{id}")
    ProductListPojo getSelectedData(Integer id);
}
