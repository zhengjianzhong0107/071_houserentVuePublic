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


import com.dao.FangzhuDao;
import com.entity.FangzhuEntity;
import com.service.FangzhuService;
import com.entity.vo.FangzhuVO;
import com.entity.view.FangzhuView;

@Service("fangzhuService")
public class FangzhuServiceImpl extends ServiceImpl<FangzhuDao, FangzhuEntity> implements FangzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangzhuEntity> page = this.selectPage(
                new Query<FangzhuEntity>(params).getPage(),
                new EntityWrapper<FangzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangzhuEntity> wrapper) {
		  Page<FangzhuView> page =new Query<FangzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangzhuVO> selectListVO(Wrapper<FangzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangzhuVO selectVO(Wrapper<FangzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangzhuView> selectListView(Wrapper<FangzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangzhuView selectView(Wrapper<FangzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
