package com.dao;

import com.entity.FangzujiaonaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangzujiaonaVO;
import com.entity.view.FangzujiaonaView;


/**
 * 房租缴纳
 * 
 * @author 
 * @email 
 * @date 2023-04-09 10:34:56
 */
public interface FangzujiaonaDao extends BaseMapper<FangzujiaonaEntity> {
	
	List<FangzujiaonaVO> selectListVO(@Param("ew") Wrapper<FangzujiaonaEntity> wrapper);
	
	FangzujiaonaVO selectVO(@Param("ew") Wrapper<FangzujiaonaEntity> wrapper);
	
	List<FangzujiaonaView> selectListView(@Param("ew") Wrapper<FangzujiaonaEntity> wrapper);

	List<FangzujiaonaView> selectListView(Pagination page,@Param("ew") Wrapper<FangzujiaonaEntity> wrapper);
	
	FangzujiaonaView selectView(@Param("ew") Wrapper<FangzujiaonaEntity> wrapper);
	

}
