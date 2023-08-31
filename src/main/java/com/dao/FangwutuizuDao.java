package com.dao;

import com.entity.FangwutuizuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangwutuizuVO;
import com.entity.view.FangwutuizuView;


/**
 * 房屋退租
 * 
 * @author 
 * @email 
 * @date 2023-04-09 10:34:56
 */
public interface FangwutuizuDao extends BaseMapper<FangwutuizuEntity> {
	
	List<FangwutuizuVO> selectListVO(@Param("ew") Wrapper<FangwutuizuEntity> wrapper);
	
	FangwutuizuVO selectVO(@Param("ew") Wrapper<FangwutuizuEntity> wrapper);
	
	List<FangwutuizuView> selectListView(@Param("ew") Wrapper<FangwutuizuEntity> wrapper);

	List<FangwutuizuView> selectListView(Pagination page,@Param("ew") Wrapper<FangwutuizuEntity> wrapper);
	
	FangwutuizuView selectView(@Param("ew") Wrapper<FangwutuizuEntity> wrapper);
	

}
