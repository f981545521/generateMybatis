package com.citic.gatz.base;

import tk.mybatis.mapper.common.BaseMapper;

/**
 * 
 * @author fengchao
 * Mapper中通用的方法：
 * 		继承了base组合接口中的4个组合接口，包含完整的CRUD方法
 *
 * @param <T>
 */
public interface IBaseMapper<T> extends BaseMapper<T> {

}