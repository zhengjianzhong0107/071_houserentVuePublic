package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangwuzulinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangwuzulinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangwuzulinView;


/**
 * 房屋租赁
 *
 * @author 
 * @email 
 * @date 2023-04-09 10:34:55
 */
public interface FangwuzulinService extends IService<FangwuzulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangwuzulinVO> selectListVO(Wrapper<FangwuzulinEntity> wrapper);
   	
   	FangwuzulinVO selectVO(@Param("ew") Wrapper<FangwuzulinEntity> wrapper);
   	
   	List<FangwuzulinView> selectListView(Wrapper<FangwuzulinEntity> wrapper);
   	
   	FangwuzulinView selectView(@Param("ew") Wrapper<FangwuzulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangwuzulinEntity> wrapper);
   	

}

