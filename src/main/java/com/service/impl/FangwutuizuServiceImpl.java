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


import com.dao.FangwutuizuDao;
import com.entity.FangwutuizuEntity;
import com.service.FangwutuizuService;
import com.entity.vo.FangwutuizuVO;
import com.entity.view.FangwutuizuView;

@Service("fangwutuizuService")
public class FangwutuizuServiceImpl extends ServiceImpl<FangwutuizuDao, FangwutuizuEntity> implements FangwutuizuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangwutuizuEntity> page = this.selectPage(
                new Query<FangwutuizuEntity>(params).getPage(),
                new EntityWrapper<FangwutuizuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangwutuizuEntity> wrapper) {
		  Page<FangwutuizuView> page =new Query<FangwutuizuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangwutuizuVO> selectListVO(Wrapper<FangwutuizuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangwutuizuVO selectVO(Wrapper<FangwutuizuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangwutuizuView> selectListView(Wrapper<FangwutuizuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangwutuizuView selectView(Wrapper<FangwutuizuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
