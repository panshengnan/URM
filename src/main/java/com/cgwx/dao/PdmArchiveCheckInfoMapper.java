package com.cgwx.dao;

import com.cgwx.data.entity.PdmArchiveCheckInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PdmArchiveCheckInfoMapper {
    int insert(PdmArchiveCheckInfo record);

    List<PdmArchiveCheckInfo> selectAll();

    @Select("SELECT file_name\n" +
            "FROM pdm_archive_check_info\n" +
            "WHERE product_id = #{tempId} "
    )
    String selectFileNameById(@Param("tempId") String tempId);

    @Select("SELECT temporary_path\n" +
            "FROM pdm_archive_check_info\n" +
            "WHERE product_id = #{tempId} "
    )
    String selectTemporaryPathById(@Param("tempId") String tempId);


}