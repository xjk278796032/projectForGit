package com.xjk.spring.test.dao;

import com.xjk.spring.test.po.HaaPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HaaDao {

    List<HaaPo> selectAllPo();

    String testDao();

}
