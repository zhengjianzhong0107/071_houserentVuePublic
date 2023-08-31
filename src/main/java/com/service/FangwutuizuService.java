package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwutuizuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwutuizuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwutuizuView;


/**
 * 房屋退租
 *
 * @author 
 * @email 
 * @date 2023-04-09 10:34:56
 */
public interface FangwutuizuService extends IService<FangwutuizuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwutuizuVO> selectListVO(Wrapper<FangwutuizuEntity> wrapper);
   	
   	FangwutuizuVO selectVO(@Param("ew") Wrapper<FangwutuizuEntity> wrapper);
   	
   	List<FangwutuizuView> selectListView(Wrapper<FangwutuizuEntity> wrapper);
   	
   	FangwutuizuView selectView(@Param("ew") Wrapper<FangwutuizuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwutuizuEntity> wrapper);
   	

}

