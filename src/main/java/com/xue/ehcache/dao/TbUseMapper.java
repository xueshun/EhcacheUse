package com.xue.ehcache.dao;

import com.xue.ehcache.entity.TbUse;
import com.xue.ehcache.entity.TbUseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int countByExample(TbUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int insert(TbUse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int insertSelective(TbUse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    List<TbUse> selectByExample(TbUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    TbUse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int updateByExampleSelective(@Param("record") TbUse record, @Param("example") TbUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int updateByExample(@Param("record") TbUse record, @Param("example") TbUseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int updateByPrimaryKeySelective(TbUse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbggenerated Wed Oct 25 13:56:15 CST 2017
     */
    int updateByPrimaryKey(TbUse record);
}