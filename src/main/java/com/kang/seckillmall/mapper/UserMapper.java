package com.kang.seckillmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kang.seckillmall.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @projectName: secKillMall
 * @package: com.kang.seckillmall.pojo
 * @className: UserMapper
 * @author: Weikang Zhang
 * @description: TODO
 * @date: 09/04/2023 22:09
 * @version: 1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
