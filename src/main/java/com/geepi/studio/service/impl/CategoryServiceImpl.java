package com.geepi.studio.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.geepi.studio.entity.Category;
import com.geepi.studio.mapper.CategoryDao;
import com.geepi.studio.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author geepi
 * @since 2020-05-04
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {
	
}
