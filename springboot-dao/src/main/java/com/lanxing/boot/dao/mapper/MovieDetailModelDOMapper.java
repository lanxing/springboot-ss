package com.lanxing.boot.dao.mapper;

import com.lanxing.boot.dao.model.MovieDetailModelDO;
import com.lanxing.boot.dao.model.MovieDetailModelDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MovieDetailModelDOMapper {
    long countByExample(MovieDetailModelDOExample example);

    int deleteByExample(MovieDetailModelDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MovieDetailModelDO record);

    int insertSelective(MovieDetailModelDO record);

    List<MovieDetailModelDO> selectByExampleWithRowbounds(MovieDetailModelDOExample example, RowBounds rowBounds);

    List<MovieDetailModelDO> selectByExample(MovieDetailModelDOExample example);

    MovieDetailModelDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MovieDetailModelDO record, @Param("example") MovieDetailModelDOExample example);

    int updateByExample(@Param("record") MovieDetailModelDO record, @Param("example") MovieDetailModelDOExample example);

    int updateByPrimaryKeySelective(MovieDetailModelDO record);

    int updateByPrimaryKey(MovieDetailModelDO record);
}