package com.smartaddress.demo.mapper;

import com.smartaddress.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated Tue Apr 30 17:46:12 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated Tue Apr 30 17:46:12 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated Tue Apr 30 17:46:12 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated Tue Apr 30 17:46:12 CST 2019
     */
    User selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated Tue Apr 30 17:46:12 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_t
     *
     * @mbg.generated Tue Apr 30 17:46:12 CST 2019
     */
    int updateByPrimaryKey(User record);
}