package com.weideha.mapper;

import com.weideha.pojo.admin;

import java.util.List;
import java.util.Map;

public interface adminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sat Apr 08 21:15:54 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sat Apr 08 21:15:54 CST 2023
     */
    int insert(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sat Apr 08 21:15:54 CST 2023
     */
    int insertSelective(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sat Apr 08 21:15:54 CST 2023
     */
    admin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sat Apr 08 21:15:54 CST 2023
     */
    int updateByPrimaryKeySelective(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbggenerated Sat Apr 08 21:15:54 CST 2023
     */
    int updateByPrimaryKey(admin record);
    admin selectByAccandPwd(Map<String,Object> map);
    List<admin> selectAlluser();
}