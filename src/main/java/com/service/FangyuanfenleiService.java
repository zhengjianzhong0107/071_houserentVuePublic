package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyuanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyuanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyuanfenleiView;


/**
 * 房源分类
 *
 * @author 
 * @email 
 * @date 2023-04-09 10:34:55
 */
public interface FangyuanfenleiService extends IService<FangyuanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyuanfenleiVO> selectListVO(Wrapper<FangyuanfenleiEntity> wrapper);
   	
   	FangyuanfenleiVO selectVO(@Param("ew") Wrapper<FangyuanfenleiEntity> wrapper);
   	
   	List<FangyuanfenleiView> selectListView(Wrapper<FangyuanfenleiEntity> wrapper);
   	
   	FangyuanfenleiView selectView(@Param("ew") Wrapper<FangyuanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyuanfenleiEntity> wrapper);
   	

}

