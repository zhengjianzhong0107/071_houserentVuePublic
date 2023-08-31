package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangzujiaonaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangzujiaonaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangzujiaonaView;


/**
 * 房租缴纳
 *
 * @author 
 * @email 
 * @date 2023-04-09 10:34:56
 */
public interface FangzujiaonaService extends IService<FangzujiaonaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangzujiaonaVO> selectListVO(Wrapper<FangzujiaonaEntity> wrapper);
   	
   	FangzujiaonaVO selectVO(@Param("ew") Wrapper<FangzujiaonaEntity> wrapper);
   	
   	List<FangzujiaonaView> selectListView(Wrapper<FangzujiaonaEntity> wrapper);
   	
   	FangzujiaonaView selectView(@Param("ew") Wrapper<FangzujiaonaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangzujiaonaEntity> wrapper);
   	

}

