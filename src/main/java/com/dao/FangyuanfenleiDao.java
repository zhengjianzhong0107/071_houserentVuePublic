package com.dao;

import com.entity.FangyuanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyuanfenleiVO;
import com.entity.view.FangyuanfenleiView;


/**
 * 房源分类
 * 
 * @author 
 * @email 
 * @date 2023-04-09 10:34:55
 */
public interface FangyuanfenleiDao extends BaseMapper<FangyuanfenleiEntity> {
	
	List<FangyuanfenleiVO> selectListVO(@Param("ew") Wrapper<FangyuanfenleiEntity> wrapper);
	
	FangyuanfenleiVO selectVO(@Param("ew") Wrapper<FangyuanfenleiEntity> wrapper);
	
	List<FangyuanfenleiView> selectListView(@Param("ew") Wrapper<FangyuanfenleiEntity> wrapper);

	List<FangyuanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<FangyuanfenleiEntity> wrapper);
	
	FangyuanfenleiView selectView(@Param("ew") Wrapper<FangyuanfenleiEntity> wrapper);
	

}
