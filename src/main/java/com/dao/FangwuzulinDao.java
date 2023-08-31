package com.dao;

import com.entity.FangwuzulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwuzulinVO;
import com.entity.view.FangwuzulinView;


/**
 * 房屋租赁
 * 
 * @author 
 * @email 
 * @date 2023-04-09 10:34:55
 */
public interface FangwuzulinDao extends BaseMapper<FangwuzulinEntity> {
	
	List<FangwuzulinVO> selectListVO(@Param("ew") Wrapper<FangwuzulinEntity> wrapper);
	
	FangwuzulinVO selectVO(@Param("ew") Wrapper<FangwuzulinEntity> wrapper);
	
	List<FangwuzulinView> selectListView(@Param("ew") Wrapper<FangwuzulinEntity> wrapper);

	List<FangwuzulinView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuzulinEntity> wrapper);
	
	FangwuzulinView selectView(@Param("ew") Wrapper<FangwuzulinEntity> wrapper);
	

}
