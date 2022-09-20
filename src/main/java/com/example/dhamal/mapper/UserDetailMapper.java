package com.example.dhamal.mapper;

import com.example.dhamal.pojo.ProductListPojo;
import com.example.dhamal.pojo.UserDetailResponsePojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDetailMapper {

    @Select("select * from users where id = #{id}")
    ProductListPojo getSelectedData(Integer id);


    @Select("select id, address, name as \"userName\" from users u where \"name\" = #{name}")
    UserDetailResponsePojo getUserDetailByName(String name);
}
