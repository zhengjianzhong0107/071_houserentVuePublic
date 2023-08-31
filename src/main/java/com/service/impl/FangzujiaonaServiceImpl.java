package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangzujiaonaDao;
import com.entity.FangzujiaonaEntity;
import com.service.FangzujiaonaService;
import com.entity.vo.FangzujiaonaVO;
import com.entity.view.FangzujiaonaView;

@Service("fangzujiaonaService")
public class FangzujiaonaServiceImpl extends ServiceImpl<FangzujiaonaDao, FangzujiaonaEntity> implements FangzujiaonaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangzujiaonaEntity> page = this.selectPage(
                new Query<FangzujiaonaEntity>(params).getPage(),
                new EntityWrapper<FangzujiaonaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangzujiaonaEntity> wrapper) {
		  Page<FangzujiaonaView> page =new Query<FangzujiaonaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangzujiaonaVO> selectListVO(Wrapper<FangzujiaonaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangzujiaonaVO selectVO(Wrapper<FangzujiaonaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangzujiaonaView> selectListView(Wrapper<FangzujiaonaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangzujiaonaView selectView(Wrapper<FangzujiaonaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
