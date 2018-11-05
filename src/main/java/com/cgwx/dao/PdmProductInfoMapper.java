package com.cgwx.dao;

import com.cgwx.data.entity.PdmProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PdmProductInfoMapper {
    int insert(PdmProductInfo record);

    List<PdmProductInfo> selectAll();

    @Select("SELECT client_name\n" +
            "FROM pdm_product_info\n" +
            "WHERE client_name like  '%${clientName}%' order by client_name collate \"C\" "
    )
    List<String> selectClientNameList(@Param("clientName") String clientName);


    @Select("SELECT deliver_name\n" +
            "FROM pdm_product_info\n" +
            "WHERE deliver_name like  '%${deliverName}%' order by deliver_name collate \"C\" "
    )
    List<String> selectDeliverNameList(@Param("deliverName") String deliverName);

    @Select("SELECT producer\n" +
            "FROM pdm_product_info\n" +
            "WHERE producer like  '%${producer}%' order by producer collate \"C\" "
    )
    List<String> selectProducerList(@Param("producer") String producer);




}