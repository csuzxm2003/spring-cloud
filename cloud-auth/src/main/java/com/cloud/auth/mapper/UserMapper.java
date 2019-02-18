package com.cloud.auth.mapper;

import com.cloud.auth.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: 用户查询映射类
 * FileName: UserMapper
 * Author:   ZhaoXiaoman
 * Date:     2019/2/18 16:51
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/2/18 16:51    1.0
 * 版权:   版权所有(C)2018
 * 公司:   东华云计算有限公司
 */
@Mapper
public interface UserMapper {
    /**
    * @Author ZhaoXiaoman
    * @Description 根据用户ID查找用户信息
    * @Date 16:54 2019/2/18
    * @Param [id]
    * @Return com.cloud.auth.entity.User
    */
    public User getUserById(Long id);
}
