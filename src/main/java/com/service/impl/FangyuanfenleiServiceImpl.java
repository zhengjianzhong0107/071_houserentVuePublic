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


import com.dao.FangyuanfenleiDao;
import com.entity.FangyuanfenleiEntity;
import com.service.FangyuanfenleiService;
import com.entity.vo.FangyuanfenleiVO;
import com.entity.view.FangyuanfenleiView;

@Service("fangyuanfenleiService")
public class FangyuanfenleiServiceImpl extends ServiceImpl<FangyuanfenleiDao, FangyuanfenleiEntity> implements FangyuanfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyuanfenleiEntity> page = this.selectPage(
                new Query<FangyuanfenleiEntity>(params).getPage(),
                new EntityWrapper<FangyuanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyuanfenleiEntity> wrapper) {
		  Page<FangyuanfenleiView> page =new Query<FangyuanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyuanfenleiVO> selectListVO(Wrapper<FangyuanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyuanfenleiVO selectVO(Wrapper<FangyuanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyuanfenleiView> selectListView(Wrapper<FangyuanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyuanfenleiView selectView(Wrapper<FangyuanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
